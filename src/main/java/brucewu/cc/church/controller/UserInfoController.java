package brucewu.cc.church.controller;

import brucewu.cc.church.bean.UserInfo;
import brucewu.cc.church.common.CipherUtils;
import brucewu.cc.church.common.Response;
import brucewu.cc.church.common.UserUtils;
import brucewu.cc.church.service.UserInfoService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/login")
    public UserInfo login(@RequestParam("username") String username,@RequestParam("name") String loginname ,
                          @RequestParam("password") String password) {

        UserInfo userInfo = userInfoService.login(username , loginname , password);
        return userInfo;
    }

    @RequestMapping(value="/logout", method = RequestMethod.GET)
    public Response logoutPage (HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        Response resp = new Response();
        resp.setStatus(Response.MSG_SUCCESS);
        resp.setMsg(Response.MSG_SUCCESS);
        if (auth != null) {
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return resp;
    }

    @RequestMapping("/getMembers")
    public Response getMemberFromGroup(
            @RequestParam(value = "gId",required = false)String groupId){
        Response resp = new Response();
        resp.setStatus(Response.STATUS_ERROR);
        UserInfo userInfo = UserUtils.getCurrentUser();
        if(userInfo == null ){
            resp.setMsg(Response.MSG_NOT_FOUND);
            return resp;
        }

        if(userInfo.getGroupid() == null && (groupId == null || groupId == "")){
            resp.setMsg(Response.MSG_ORG_NOT_FOUND);
            return resp;
        }

        List<UserInfo> list = userInfoService.getMemberFromGroup(
                (groupId == null || groupId == "") ? userInfo.getGroupid() : groupId);
        resp.setStatus(Response.STATUS_SUCCESS);
        resp.setMsg(Response.MSG_SUCCESS);
        resp.setData(list);
        return resp;
    }

    @RequestMapping("/updatepassword")
    public Response updatePassword(@RequestParam("userId") String userId, @RequestParam("oPassword") String originPassword,
                                   @RequestParam("nPassword") String newPassword) {
        Response resp = new Response();
        resp.setStatus(Response.STATUS_ERROR);
        UserInfo userInfo = UserUtils.getCurrentUser();
        if(userInfo == null ){
            resp.setMsg(Response.MSG_TIME_OUT);
            return resp;
        }

        if(!UserUtils.isCurrentUser(userId)){
            resp.setMsg(Response.MSG_NOT_FOUND);
            return resp;
        }

        if(!UserUtils.validatePassword(originPassword)){
            resp.setMsg(Response.MSG_ORI_PASSWORD_ERROR);
            return resp;
        }

        try{
            userInfo.setPassword(CipherUtils.encodeWithBase64(newPassword));
            userInfoService.updatePassword(userInfo);
            resp.setStatus(Response.STATUS_SUCCESS);
            resp.setMsg(Response.MSG_SUCCESS);
        }catch (Exception e) {
            resp.setMsg(e.getMessage());
        }

        return resp;
    }

    @RequestMapping("/newMember")
    public Response newMember(@RequestParam("loginname") String loginName, @RequestParam("username") String userName,
                              @RequestParam(value="nickname" , required = false) String nickName, @RequestParam("password") String password,
                              @RequestParam("phone") String phone , @RequestParam("gender") String gender ,
                              @RequestParam("groupid") String groupId){
        Response resp = new Response();
        resp.setStatus(Response.STATUS_ERROR);
        UserInfo userInfo = UserUtils.getCurrentUser();
        if(userInfo == null ){
            resp.setMsg(Response.MSG_TIME_OUT);
            return resp;
        }
        try{
            userInfoService.insertNewMember(loginName , userName , nickName , password , phone , gender  , groupId);
            resp.setStatus(Response.STATUS_SUCCESS);
            resp.setMsg(Response.MSG_SUCCESS);
        }catch (Exception e){
            resp.setStatus(Response.STATUS_ERROR);
            resp.setMsg(e.getMessage());
        }
        return resp;
    }

    @RequestMapping("/updateMember")
    public Response updatePassword(@RequestParam("userId") String userId, @RequestParam("mobile") String mobile,
                                   @RequestParam("username") String username , @RequestParam("loginname") String loginname ,
                                   @RequestParam("gender") String gender) {
        Response resp = new Response();
        resp.setStatus(Response.STATUS_ERROR);
        UserInfo userInfo = UserUtils.getCurrentUser();
        if(userInfo == null ){
            resp.setMsg(Response.MSG_TIME_OUT);
            return resp;
        }

        UserInfo member = userInfoService.findUserById(userId);

        if(member == null){
            resp.setMsg(Response.MSG_NOT_FOUND);
            return resp;
        }

        try{
            member.setLoginname(loginname);
            member.setUsername(username);
            member.setPhone(mobile);
            member.setGender(gender);
            userInfoService.update(member);
            resp.setStatus(Response.STATUS_SUCCESS);
            resp.setMsg(Response.MSG_SUCCESS);
        }catch (Exception e) {
            resp.setMsg(e.getMessage());
        }
        return resp;
    }

}

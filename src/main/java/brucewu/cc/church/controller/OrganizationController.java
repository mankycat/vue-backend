package brucewu.cc.church.controller;

import brucewu.cc.church.bean.Organization;
import brucewu.cc.church.bean.UserInfo;
import brucewu.cc.church.common.Response;
import brucewu.cc.church.common.UserUtils;
import brucewu.cc.church.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/org")
public class OrganizationController {

    @Autowired
    OrganizationService organizationService;

    @RequestMapping("/getChildAreas")
    public Response getChildArea(){
        Response resp = new Response();
        resp.setStatus(Response.STATUS_ERROR);
        UserInfo userInfo = UserUtils.getCurrentUser();
        Map<String,Object> map = new HashMap<>();
        if(userInfo == null ){
            resp.setMsg(Response.MSG_NOT_FOUND);
            return resp;
        }

        boolean permit = false;
        List<SimpleGrantedAuthority> authorities = (List<SimpleGrantedAuthority>) userInfo.getAuthorities();
        for(SimpleGrantedAuthority auth : authorities){
            if(auth.getAuthority().equals("区牧")){
                permit = true;
                break;
            }
        }

        if(!permit){
            resp.setMsg(Response.MSG_UNAUTORIZED);
            return resp;
        }

        List<Organization> orgs = userInfo.getOrganization();
        String oId = null;
        for( Organization item : orgs){
            if(item.getRolename().equals("区牧")){
                oId = item.getId();
                break;
            }
        }

        List<Organization> list = organizationService.getChildOrg(oId);
        resp.setStatus(Response.STATUS_SUCCESS);
        resp.setMsg(Response.MSG_SUCCESS);
        resp.setData(list);
        return resp;
    }

    @RequestMapping("/getChildTeams")
    public Response getChildTeams(@RequestParam(value = "aId",required = false)String areaId){
        Response resp = new Response();
        resp.setStatus(Response.STATUS_ERROR);
        UserInfo userInfo = UserUtils.getCurrentUser();
        Map<String,Object> map = new HashMap<>();
        if(userInfo == null ){
            resp.setMsg(Response.MSG_NOT_FOUND);
            return resp;
        }

        boolean permit = false;
        List<SimpleGrantedAuthority> authorities = (List<SimpleGrantedAuthority>) userInfo.getAuthorities();
        for(SimpleGrantedAuthority auth : authorities){
            if(auth.getAuthority().equals("区长")){
                permit = true;
                break;
            }
        }

        if( !permit ){
            resp.setMsg(Response.MSG_UNAUTORIZED);
            return resp;
        }

        List<Organization> orgs = userInfo.getOrganization();
        String oId = null;
        for( Organization item : orgs){
            if(item.getRolename().equals("区长")){
                oId = item.getId();
                break;
            }
        }

        List<Organization> list = organizationService.getChildOrg(
                (areaId == null || areaId == "") ? oId : areaId);
        resp.setStatus(Response.STATUS_SUCCESS);
        resp.setMsg(Response.MSG_SUCCESS);
        resp.setData(list);
        return resp;
    }
}

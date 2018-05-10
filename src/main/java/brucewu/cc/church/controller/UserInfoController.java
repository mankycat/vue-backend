package brucewu.cc.church.controller;

import brucewu.cc.church.bean.UserInfo;
import brucewu.cc.church.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @ResponseBody
    @RequestMapping(value="/login", produces={"application/json;charset=UTF-8"})
    public UserInfo login(@RequestParam("username") String username,@RequestParam("name") String loginname ,
                          @RequestParam("password") String password) {

        UserInfo userInfo = userInfoService.login(username , loginname , password);
        return userInfo;
    }

}

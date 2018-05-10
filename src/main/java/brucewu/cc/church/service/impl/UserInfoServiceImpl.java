package brucewu.cc.church.service.impl;

import brucewu.cc.church.bean.UserInfo;
import brucewu.cc.church.mapper.UserInfoMapper;
import brucewu.cc.church.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "/userInfoService")
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoMapper userInfoMapper;

    @Override
    public UserInfo login(String username, String loginname, String password) {
        return userInfoMapper.login(username, loginname, password);
    }
}

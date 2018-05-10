package brucewu.cc.church.service;

import brucewu.cc.church.bean.UserInfo;

public interface UserInfoService {

    UserInfo login(String username , String loginname , String password);
}

package brucewu.cc.church.service;

import brucewu.cc.church.bean.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserInfoService extends UserDetailsService {

    UserInfo login(String username , String loginname , String password);

    int updatePassword(UserInfo userInfo);

}

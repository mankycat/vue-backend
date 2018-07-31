package brucewu.cc.church.service;

import brucewu.cc.church.bean.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserInfoService extends UserDetailsService {

    UserInfo login(String username , String loginname , String password);

    int updatePassword(UserInfo userInfo);

    List<UserInfo> getMemberFromGroup(String groupId);

    UserInfo findUserById(int id);

    void update(UserInfo userInfo);

    int getMaxUserId();

    int insertNewMember(String loginName , String userName , String nickName , String password ,String groupId);
}

package brucewu.cc.church.service.impl;

import brucewu.cc.church.bean.UserInfo;
import brucewu.cc.church.mapper.UserInfoMapper;
import brucewu.cc.church.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "/userInfoService")
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoMapper userInfoMapper;

    @Override
    public UserInfo login(String username, String loginname, String password) {
        return userInfoMapper.login(username, loginname, password);
    }

    @Override
    public int updatePassword(UserInfo userInfo) {
        return userInfoMapper.updateByPrimaryKeySelective(userInfo);
    }

    @Override
    public List<UserInfo> getMemberFromGroup(String groupId) {
       return userInfoMapper.getMemberFromGroup(groupId);
    }

    @Override
    public UserInfo findUserById(int id) {
        return userInfoMapper.findUserById(id);
    }

    @Override
    public void update(UserInfo userInfo) {
        userInfoMapper.updateByPrimaryKeySelective(userInfo);
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserInfo userInfo = userInfoMapper.loadUserByUsername(s);
        if(userInfo == null){
            throw new UsernameNotFoundException("用户名不正确");
        }

        return userInfo;
    }
}

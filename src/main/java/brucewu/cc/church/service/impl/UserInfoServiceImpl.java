package brucewu.cc.church.service.impl;

import brucewu.cc.church.bean.UserInfo;
import brucewu.cc.church.common.CipherUtils;
import brucewu.cc.church.common.DateConverter;
import brucewu.cc.church.mapper.UserInfoMapper;
import brucewu.cc.church.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service(value = "/userInfoService")
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoMapper userInfoMapper;

    @Value("${serverType}") private String serverType;

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
    public UserInfo findUserById(String id) {
        return userInfoMapper.findUserById(id);
    }

    @Override
    public void update(UserInfo userInfo) {
        userInfoMapper.updateByPrimaryKeySelective(userInfo);
    }

    @Override
    public String getMaxUserId() {
        String currentDate = DateConverter.getStringDateFrom("yyyyMM");
        String value = null;
        try{
            value = userInfoMapper.getCurrentMaxId(serverType + currentDate + "%");
            int intValue = Integer.parseInt(value.substring(2));
            intValue += 1;
            value = new StringBuilder().append(serverType).append(intValue).toString();
        }catch (Exception e){
            value = new StringBuilder().append(serverType).append(Integer.parseInt(currentDate) * 10000 + 1).toString();
        }

        return value;
    }

    private UserInfo generateUserInfo(String loginName, String userName, String nickName, String password,
                                      String phone , String gender , String groupId){
        UserInfo userInfo = new UserInfo();
        String primaryKey = getMaxUserId();
        userInfo.setUserid(primaryKey);
        userInfo.setLoginname(loginName);
        userInfo.setUsername(userName);
        userInfo.setNickname(nickName);
        userInfo.setPassword(CipherUtils.encodeWithBase64(password));
        userInfo.setPhone(phone);
        userInfo.setGender(gender);
        userInfo.setGroupid(groupId);
        userInfo.setCourseid("00000000-0000-0000-0000-000000000000");
        userInfo.setMiniroleid("00000000-0000-0000-0000-000000000000");
        userInfo.setMemberid("5F7A794B-8F56-47CB-B7FE-D141C0B56FD2");
        userInfo.setCreatedate(new Date());
        userInfo.setIsbaptism(0);
        userInfo.setBaptismdate(DateConverter.strToDateShort("3939-01-01"));
        userInfo.setJoinchurchdate(new Date());
        userInfo.setIsdelete(0);

        return userInfo;

    }

    @Override
    public int insertNewMember(String loginName, String userName, String nickName, String password,
                               String phone , String gender , String groupId) {

        return userInfoMapper.insertSelective(generateUserInfo(loginName,userName,nickName,password,
                phone,gender,groupId));
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

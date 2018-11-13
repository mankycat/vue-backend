package brucewu.cc.church.mapper;

import brucewu.cc.church.bean.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface UserInfoMapper {
    int deleteByPrimaryKey(String userid);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

    UserInfo login(@Param("username") String username ,
                   @Param("loginname") String loginname ,@Param("password") String password);

    UserInfo loadUserByUsername(String loginname);

    List getMemberFromGroup(String groupId);

    UserInfo findUserById(String userid);

    String getCurrentMaxId(String date);
}
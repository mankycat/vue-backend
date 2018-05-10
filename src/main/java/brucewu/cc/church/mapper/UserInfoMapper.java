package brucewu.cc.church.mapper;

import brucewu.cc.church.bean.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

    UserInfo login(@Param("username") String username ,
                   @Param("loginname") String loginname ,@Param("password") String password);
}
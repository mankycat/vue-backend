package brucewu.cc.church.mapper;

import brucewu.cc.church.bean.LeaveInfo;

public interface LeaveInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(LeaveInfo record);

    int insertSelective(LeaveInfo record);

    LeaveInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(LeaveInfo record);

    int updateByPrimaryKey(LeaveInfo record);
}
package brucewu.cc.church.mapper;

import brucewu.cc.church.bean.LeaveType;

public interface LeaveTypeMapper {
    int deleteByPrimaryKey(String id);

    int insert(LeaveType record);

    int insertSelective(LeaveType record);

    LeaveType selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(LeaveType record);

    int updateByPrimaryKey(LeaveType record);
}
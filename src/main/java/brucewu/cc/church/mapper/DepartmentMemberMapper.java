package brucewu.cc.church.mapper;

import brucewu.cc.church.bean.DepartmentMember;

public interface DepartmentMemberMapper {
    int deleteByPrimaryKey(String id);

    int insert(DepartmentMember record);

    int insertSelective(DepartmentMember record);

    DepartmentMember selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(DepartmentMember record);

    int updateByPrimaryKey(DepartmentMember record);
}
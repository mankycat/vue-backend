package brucewu.cc.church.mapper;

import brucewu.cc.church.bean.RegisterManage;

public interface RegisterManageMapper {
    int deleteByPrimaryKey(String id);

    int insert(RegisterManage record);

    int insertSelective(RegisterManage record);

    RegisterManage selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RegisterManage record);

    int updateByPrimaryKey(RegisterManage record);
}
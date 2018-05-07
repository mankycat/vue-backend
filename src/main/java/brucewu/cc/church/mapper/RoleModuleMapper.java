package brucewu.cc.church.mapper;

import brucewu.cc.church.bean.RoleModule;

public interface RoleModuleMapper {
    int deleteByPrimaryKey(String id);

    int insert(RoleModule record);

    int insertSelective(RoleModule record);

    RoleModule selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RoleModule record);

    int updateByPrimaryKey(RoleModule record);
}
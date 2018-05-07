package brucewu.cc.church.mapper;

import brucewu.cc.church.bean.RoleController;

public interface RoleControllerMapper {
    int deleteByPrimaryKey(String id);

    int insert(RoleController record);

    int insertSelective(RoleController record);

    RoleController selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RoleController record);

    int updateByPrimaryKey(RoleController record);
}
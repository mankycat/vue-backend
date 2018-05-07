package brucewu.cc.church.mapper;

import brucewu.cc.church.bean.MiniRole;

public interface MiniRoleMapper {
    int deleteByPrimaryKey(String id);

    int insert(MiniRole record);

    int insertSelective(MiniRole record);

    MiniRole selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MiniRole record);

    int updateByPrimaryKey(MiniRole record);
}
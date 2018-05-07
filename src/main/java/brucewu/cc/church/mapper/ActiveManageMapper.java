package brucewu.cc.church.mapper;

import brucewu.cc.church.bean.ActiveManage;

public interface ActiveManageMapper {
    int deleteByPrimaryKey(String id);

    int insert(ActiveManage record);

    int insertSelective(ActiveManage record);

    ActiveManage selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ActiveManage record);

    int updateByPrimaryKey(ActiveManage record);
}
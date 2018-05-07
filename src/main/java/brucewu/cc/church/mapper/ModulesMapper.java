package brucewu.cc.church.mapper;

import brucewu.cc.church.bean.Modules;

public interface ModulesMapper {
    int deleteByPrimaryKey(String id);

    int insert(Modules record);

    int insertSelective(Modules record);

    Modules selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Modules record);

    int updateByPrimaryKey(Modules record);
}
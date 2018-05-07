package brucewu.cc.church.mapper;

import brucewu.cc.church.bean.RegisterCategory;

public interface RegisterCategoryMapper {
    int deleteByPrimaryKey(String id);

    int insert(RegisterCategory record);

    int insertSelective(RegisterCategory record);

    RegisterCategory selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RegisterCategory record);

    int updateByPrimaryKey(RegisterCategory record);
}
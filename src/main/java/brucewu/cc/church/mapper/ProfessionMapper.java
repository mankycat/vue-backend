package brucewu.cc.church.mapper;

import brucewu.cc.church.bean.Profession;

public interface ProfessionMapper {
    int deleteByPrimaryKey(String id);

    int insert(Profession record);

    int insertSelective(Profession record);

    Profession selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Profession record);

    int updateByPrimaryKey(Profession record);
}
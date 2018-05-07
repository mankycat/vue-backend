package brucewu.cc.church.mapper;

import brucewu.cc.church.bean.Speciality;

public interface SpecialityMapper {
    int deleteByPrimaryKey(String id);

    int insert(Speciality record);

    int insertSelective(Speciality record);

    Speciality selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Speciality record);

    int updateByPrimaryKey(Speciality record);
}
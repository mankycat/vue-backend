package brucewu.cc.church.mapper;

import brucewu.cc.church.bean.Gift;

public interface GiftMapper {
    int deleteByPrimaryKey(String id);

    int insert(Gift record);

    int insertSelective(Gift record);

    Gift selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Gift record);

    int updateByPrimaryKey(Gift record);
}
package brucewu.cc.church.mapper;

import brucewu.cc.church.bean.Location;

public interface LocationMapper {
    int deleteByPrimaryKey(String id);

    int insert(Location record);

    int insertSelective(Location record);

    Location selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Location record);

    int updateByPrimaryKey(Location record);
}
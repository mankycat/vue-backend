package brucewu.cc.church.mapper;

import brucewu.cc.church.bean.GroupFiveW;

public interface GroupFiveWMapper {
    int deleteByPrimaryKey(String id);

    int insert(GroupFiveW record);

    int insertSelective(GroupFiveW record);

    GroupFiveW selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(GroupFiveW record);

    int updateByPrimaryKey(GroupFiveW record);
}
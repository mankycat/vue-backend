package brucewu.cc.church.mapper;

import brucewu.cc.church.bean.ConferencePlan;

public interface ConferencePlanMapper {
    int deleteByPrimaryKey(String id);

    int insert(ConferencePlan record);

    int insertSelective(ConferencePlan record);

    ConferencePlan selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ConferencePlan record);

    int updateByPrimaryKey(ConferencePlan record);
}
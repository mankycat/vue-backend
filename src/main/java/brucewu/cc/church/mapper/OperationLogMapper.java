package brucewu.cc.church.mapper;

import brucewu.cc.church.bean.OperationLog;

public interface OperationLogMapper {
    int deleteByPrimaryKey(String id);

    int insert(OperationLog record);

    int insertSelective(OperationLog record);

    OperationLog selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OperationLog record);

    int updateByPrimaryKey(OperationLog record);
}
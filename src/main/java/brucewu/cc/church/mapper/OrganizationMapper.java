package brucewu.cc.church.mapper;

import brucewu.cc.church.bean.Organization;

import java.util.List;

public interface OrganizationMapper {
    int deleteByPrimaryKey(String id);

    int insert(Organization record);

    int insertSelective(Organization record);

    Organization selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Organization record);

    int updateByPrimaryKey(Organization record);

    List<Organization> selectByParentId(String parentId);
}
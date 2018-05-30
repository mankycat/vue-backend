package brucewu.cc.church.service.impl;

import brucewu.cc.church.bean.Organization;
import brucewu.cc.church.mapper.OrganizationMapper;
import brucewu.cc.church.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "/organizationService")
public class OrganizationServiceImpl implements OrganizationService {

    @Autowired
    OrganizationMapper organizationMapper;

    @Override
    public List<Organization> getChildOrg(String parentId) {
        return organizationMapper.selectByParentId(parentId);
    }
}

package brucewu.cc.church.service;

import brucewu.cc.church.bean.Organization;

import java.util.List;

public interface OrganizationService {
    List<Organization> getChildOrg(String parentId);
}

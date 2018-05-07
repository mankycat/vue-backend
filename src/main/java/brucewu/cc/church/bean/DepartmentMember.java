package brucewu.cc.church.bean;

import java.util.Date;

public class DepartmentMember {
    private String id;

    private String departmentid;

    private Integer manageruserid;

    private Integer memberuserid;

    private Date createdate;

    private String description;

    private Integer isprincipal;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid == null ? null : departmentid.trim();
    }

    public Integer getManageruserid() {
        return manageruserid;
    }

    public void setManageruserid(Integer manageruserid) {
        this.manageruserid = manageruserid;
    }

    public Integer getMemberuserid() {
        return memberuserid;
    }

    public void setMemberuserid(Integer memberuserid) {
        this.memberuserid = memberuserid;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getIsprincipal() {
        return isprincipal;
    }

    public void setIsprincipal(Integer isprincipal) {
        this.isprincipal = isprincipal;
    }
}
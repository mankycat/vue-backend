package brucewu.cc.church.bean;

import java.util.Date;

public class Organization {
    private String id;

    private String organizationname;

    private String rolename;

    private String organizationtype;

    private String parentid;

    private String codes;

    private Integer isenable;

    private String meetingdate;

    private String meetinglocation;

    private Date createtime;

    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrganizationname() {
        return organizationname;
    }

    public void setOrganizationname(String organizationname) {
        this.organizationname = organizationname == null ? null : organizationname.trim();
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getOrganizationtype() {
        return organizationtype;
    }

    public void setOrganizationtype(String organizationtype) {
        this.organizationtype = organizationtype == null ? null : organizationtype.trim();
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public String getCodes() {
        return codes;
    }

    public void setCodes(String codes) {
        this.codes = codes == null ? null : codes.trim();
    }

    public Integer getIsenable() {
        return isenable;
    }

    public void setIsenable(Integer isenable) {
        this.isenable = isenable;
    }

    public String getMeetingdate() {
        return meetingdate;
    }

    public void setMeetingdate(String meetingdate) {
        this.meetingdate = meetingdate == null ? null : meetingdate.trim();
    }

    public String getMeetinglocation() {
        return meetinglocation;
    }

    public void setMeetinglocation(String meetinglocation) {
        this.meetinglocation = meetinglocation == null ? null : meetinglocation.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}
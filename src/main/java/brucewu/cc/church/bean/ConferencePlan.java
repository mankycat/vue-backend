package brucewu.cc.church.bean;

import java.util.Date;

public class ConferencePlan {
    private String id;

    private String locationid;

    private Date conferencebegindate;

    private Date conferenceenddate;

    private Integer operationuserid;

    private String principal;

    private Date createtime;

    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getLocationid() {
        return locationid;
    }

    public void setLocationid(String locationid) {
        this.locationid = locationid == null ? null : locationid.trim();
    }

    public Date getConferencebegindate() {
        return conferencebegindate;
    }

    public void setConferencebegindate(Date conferencebegindate) {
        this.conferencebegindate = conferencebegindate;
    }

    public Date getConferenceenddate() {
        return conferenceenddate;
    }

    public void setConferenceenddate(Date conferenceenddate) {
        this.conferenceenddate = conferenceenddate;
    }

    public Integer getOperationuserid() {
        return operationuserid;
    }

    public void setOperationuserid(Integer operationuserid) {
        this.operationuserid = operationuserid;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal == null ? null : principal.trim();
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
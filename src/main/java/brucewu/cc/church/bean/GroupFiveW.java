package brucewu.cc.church.bean;

import java.util.Date;

public class GroupFiveW {
    private String id;

    private String weekreportid;

    private String flow;

    private Date begintime;

    private Date endtime;

    private Integer leaderid;

    private Date groupdate;

    private String groupcontent;

    private String contentdetails;

    private Integer introspectionnum;

    private Integer joingroupnum;

    private Integer joinchurchnum;

    private String opinion;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getWeekreportid() {
        return weekreportid;
    }

    public void setWeekreportid(String weekreportid) {
        this.weekreportid = weekreportid == null ? null : weekreportid.trim();
    }

    public String getFlow() {
        return flow;
    }

    public void setFlow(String flow) {
        this.flow = flow == null ? null : flow.trim();
    }

    public Date getBegintime() {
        return begintime;
    }

    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getLeaderid() {
        return leaderid;
    }

    public void setLeaderid(Integer leaderid) {
        this.leaderid = leaderid;
    }

    public Date getGroupdate() {
        return groupdate;
    }

    public void setGroupdate(Date groupdate) {
        this.groupdate = groupdate;
    }

    public String getGroupcontent() {
        return groupcontent;
    }

    public void setGroupcontent(String groupcontent) {
        this.groupcontent = groupcontent == null ? null : groupcontent.trim();
    }

    public String getContentdetails() {
        return contentdetails;
    }

    public void setContentdetails(String contentdetails) {
        this.contentdetails = contentdetails == null ? null : contentdetails.trim();
    }

    public Integer getIntrospectionnum() {
        return introspectionnum;
    }

    public void setIntrospectionnum(Integer introspectionnum) {
        this.introspectionnum = introspectionnum;
    }

    public Integer getJoingroupnum() {
        return joingroupnum;
    }

    public void setJoingroupnum(Integer joingroupnum) {
        this.joingroupnum = joingroupnum;
    }

    public Integer getJoinchurchnum() {
        return joinchurchnum;
    }

    public void setJoinchurchnum(Integer joinchurchnum) {
        this.joinchurchnum = joinchurchnum;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion == null ? null : opinion.trim();
    }
}
package brucewu.cc.church.bean;

import java.util.Date;

public class Attendance {
    private String id;

    private String weekreportid;

    private Integer userid;

    private Integer isgroup;

    private Integer ischurch;

    private Integer isld;

    private Integer iscourse;

    private Integer istd;

    private Integer spiritualgrowth;

    private Integer phonecare;

    private Integer byvisiting;

    private Date createtime;

    private Date weekdate;

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

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getIsgroup() {
        return isgroup;
    }

    public void setIsgroup(Integer isgroup) {
        this.isgroup = isgroup;
    }

    public Integer getIschurch() {
        return ischurch;
    }

    public void setIschurch(Integer ischurch) {
        this.ischurch = ischurch;
    }

    public Integer getIsld() {
        return isld;
    }

    public void setIsld(Integer isld) {
        this.isld = isld;
    }

    public Integer getIscourse() {
        return iscourse;
    }

    public void setIscourse(Integer iscourse) {
        this.iscourse = iscourse;
    }

    public Integer getIstd() {
        return istd;
    }

    public void setIstd(Integer istd) {
        this.istd = istd;
    }

    public Integer getSpiritualgrowth() {
        return spiritualgrowth;
    }

    public void setSpiritualgrowth(Integer spiritualgrowth) {
        this.spiritualgrowth = spiritualgrowth;
    }

    public Integer getPhonecare() {
        return phonecare;
    }

    public void setPhonecare(Integer phonecare) {
        this.phonecare = phonecare;
    }

    public Integer getByvisiting() {
        return byvisiting;
    }

    public void setByvisiting(Integer byvisiting) {
        this.byvisiting = byvisiting;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getWeekdate() {
        return weekdate;
    }

    public void setWeekdate(Date weekdate) {
        this.weekdate = weekdate;
    }
}
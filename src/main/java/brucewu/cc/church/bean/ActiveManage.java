package brucewu.cc.church.bean;

import java.util.Date;

public class ActiveManage {
    private String id;

    private Integer userid;

    private String locationid;

    private String registercategoryid;

    private String registerid;

    private Integer ischeck;

    private Integer ischargestatus;

    private String chargeway;

    private Date createtime;

    private String transactionnumber;

    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getLocationid() {
        return locationid;
    }

    public void setLocationid(String locationid) {
        this.locationid = locationid == null ? null : locationid.trim();
    }

    public String getRegistercategoryid() {
        return registercategoryid;
    }

    public void setRegistercategoryid(String registercategoryid) {
        this.registercategoryid = registercategoryid == null ? null : registercategoryid.trim();
    }

    public String getRegisterid() {
        return registerid;
    }

    public void setRegisterid(String registerid) {
        this.registerid = registerid == null ? null : registerid.trim();
    }

    public Integer getIscheck() {
        return ischeck;
    }

    public void setIscheck(Integer ischeck) {
        this.ischeck = ischeck;
    }

    public Integer getIschargestatus() {
        return ischargestatus;
    }

    public void setIschargestatus(Integer ischargestatus) {
        this.ischargestatus = ischargestatus;
    }

    public String getChargeway() {
        return chargeway;
    }

    public void setChargeway(String chargeway) {
        this.chargeway = chargeway == null ? null : chargeway.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getTransactionnumber() {
        return transactionnumber;
    }

    public void setTransactionnumber(String transactionnumber) {
        this.transactionnumber = transactionnumber == null ? null : transactionnumber.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}
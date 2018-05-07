package brucewu.cc.church.bean;

import java.util.Date;

public class TransferRecord {
    private String id;

    private Integer userid;

    private String churchname;

    private String regionname;

    private String groupname;

    private Date transfertime;

    private Integer operatoruserid;

    private String operatorname;

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

    public String getChurchname() {
        return churchname;
    }

    public void setChurchname(String churchname) {
        this.churchname = churchname == null ? null : churchname.trim();
    }

    public String getRegionname() {
        return regionname;
    }

    public void setRegionname(String regionname) {
        this.regionname = regionname == null ? null : regionname.trim();
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname == null ? null : groupname.trim();
    }

    public Date getTransfertime() {
        return transfertime;
    }

    public void setTransfertime(Date transfertime) {
        this.transfertime = transfertime;
    }

    public Integer getOperatoruserid() {
        return operatoruserid;
    }

    public void setOperatoruserid(Integer operatoruserid) {
        this.operatoruserid = operatoruserid;
    }

    public String getOperatorname() {
        return operatorname;
    }

    public void setOperatorname(String operatorname) {
        this.operatorname = operatorname == null ? null : operatorname.trim();
    }
}
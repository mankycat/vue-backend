package brucewu.cc.church.bean;

public class LeaveInfo {
    private String id;

    private Integer userid;

    private String leavetypeid;

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

    public String getLeavetypeid() {
        return leavetypeid;
    }

    public void setLeavetypeid(String leavetypeid) {
        this.leavetypeid = leavetypeid == null ? null : leavetypeid.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}
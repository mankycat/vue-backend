package brucewu.cc.church.bean;

public class UserDepartment {
    private String id;

    private String departmentid;

    private Integer manageruserid;

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
}
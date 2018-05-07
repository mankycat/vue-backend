package brucewu.cc.church.bean;

public class RoleController {
    private String id;

    private String rolename;

    private String controllername;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getControllername() {
        return controllername;
    }

    public void setControllername(String controllername) {
        this.controllername = controllername == null ? null : controllername.trim();
    }
}
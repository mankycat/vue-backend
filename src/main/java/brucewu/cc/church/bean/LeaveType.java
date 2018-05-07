package brucewu.cc.church.bean;

public class LeaveType {
    private String id;

    private String leavecategory;

    private Integer separate;

    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getLeavecategory() {
        return leavecategory;
    }

    public void setLeavecategory(String leavecategory) {
        this.leavecategory = leavecategory == null ? null : leavecategory.trim();
    }

    public Integer getSeparate() {
        return separate;
    }

    public void setSeparate(Integer separate) {
        this.separate = separate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}
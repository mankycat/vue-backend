package brucewu.cc.church.bean;

public class Member {
    private String id;

    private String membername;

    private Integer primarystatus;

    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMembername() {
        return membername;
    }

    public void setMembername(String membername) {
        this.membername = membername == null ? null : membername.trim();
    }

    public Integer getPrimarystatus() {
        return primarystatus;
    }

    public void setPrimarystatus(Integer primarystatus) {
        this.primarystatus = primarystatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}
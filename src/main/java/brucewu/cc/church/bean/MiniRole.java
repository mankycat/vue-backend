package brucewu.cc.church.bean;

public class MiniRole {
    private String id;

    private String minirolename;

    private Integer separate;

    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMinirolename() {
        return minirolename;
    }

    public void setMinirolename(String minirolename) {
        this.minirolename = minirolename == null ? null : minirolename.trim();
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
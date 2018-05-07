package brucewu.cc.church.bean;

public class Profession {
    private String id;

    private String professionname;

    private Integer separate;

    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getProfessionname() {
        return professionname;
    }

    public void setProfessionname(String professionname) {
        this.professionname = professionname == null ? null : professionname.trim();
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
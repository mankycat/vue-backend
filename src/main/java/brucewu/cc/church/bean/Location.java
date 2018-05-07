package brucewu.cc.church.bean;

public class Location {
    private String id;

    private String locationname;

    private Integer separate;

    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getLocationname() {
        return locationname;
    }

    public void setLocationname(String locationname) {
        this.locationname = locationname == null ? null : locationname.trim();
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
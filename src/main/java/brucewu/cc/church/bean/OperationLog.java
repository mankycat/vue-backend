package brucewu.cc.church.bean;

import java.util.Date;

public class OperationLog {
    private String id;

    private String operationaction;

    private String operationobject;

    private Date createtime;

    private Integer operationuserid;

    private String operationrolename;

    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOperationaction() {
        return operationaction;
    }

    public void setOperationaction(String operationaction) {
        this.operationaction = operationaction == null ? null : operationaction.trim();
    }

    public String getOperationobject() {
        return operationobject;
    }

    public void setOperationobject(String operationobject) {
        this.operationobject = operationobject == null ? null : operationobject.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getOperationuserid() {
        return operationuserid;
    }

    public void setOperationuserid(Integer operationuserid) {
        this.operationuserid = operationuserid;
    }

    public String getOperationrolename() {
        return operationrolename;
    }

    public void setOperationrolename(String operationrolename) {
        this.operationrolename = operationrolename == null ? null : operationrolename.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}
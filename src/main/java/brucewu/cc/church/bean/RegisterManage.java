package brucewu.cc.church.bean;

import java.math.BigDecimal;
import java.util.Date;

public class RegisterManage {
    private String id;

    private String registername;

    private String registerfile;

    private String registersite;

    private Date registerdate;

    private Date finaldate;

    private String registercategoryid;

    private String locationid;

    private String machineno;

    private Integer operator;

    private Date createtime;

    private BigDecimal singlefee;

    private Date begintime;

    private Date endtime;

    private Integer ischargeproject;

    private String alipaytwodimensionalcode;

    private String wechattwodimensionalcode;

    private String bankname;

    private String bankaccount;

    private String freeuserids;

    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRegistername() {
        return registername;
    }

    public void setRegistername(String registername) {
        this.registername = registername == null ? null : registername.trim();
    }

    public String getRegisterfile() {
        return registerfile;
    }

    public void setRegisterfile(String registerfile) {
        this.registerfile = registerfile == null ? null : registerfile.trim();
    }

    public String getRegistersite() {
        return registersite;
    }

    public void setRegistersite(String registersite) {
        this.registersite = registersite == null ? null : registersite.trim();
    }

    public Date getRegisterdate() {
        return registerdate;
    }

    public void setRegisterdate(Date registerdate) {
        this.registerdate = registerdate;
    }

    public Date getFinaldate() {
        return finaldate;
    }

    public void setFinaldate(Date finaldate) {
        this.finaldate = finaldate;
    }

    public String getRegistercategoryid() {
        return registercategoryid;
    }

    public void setRegistercategoryid(String registercategoryid) {
        this.registercategoryid = registercategoryid == null ? null : registercategoryid.trim();
    }

    public String getLocationid() {
        return locationid;
    }

    public void setLocationid(String locationid) {
        this.locationid = locationid == null ? null : locationid.trim();
    }

    public String getMachineno() {
        return machineno;
    }

    public void setMachineno(String machineno) {
        this.machineno = machineno == null ? null : machineno.trim();
    }

    public Integer getOperator() {
        return operator;
    }

    public void setOperator(Integer operator) {
        this.operator = operator;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public BigDecimal getSinglefee() {
        return singlefee;
    }

    public void setSinglefee(BigDecimal singlefee) {
        this.singlefee = singlefee;
    }

    public Date getBegintime() {
        return begintime;
    }

    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getIschargeproject() {
        return ischargeproject;
    }

    public void setIschargeproject(Integer ischargeproject) {
        this.ischargeproject = ischargeproject;
    }

    public String getAlipaytwodimensionalcode() {
        return alipaytwodimensionalcode;
    }

    public void setAlipaytwodimensionalcode(String alipaytwodimensionalcode) {
        this.alipaytwodimensionalcode = alipaytwodimensionalcode == null ? null : alipaytwodimensionalcode.trim();
    }

    public String getWechattwodimensionalcode() {
        return wechattwodimensionalcode;
    }

    public void setWechattwodimensionalcode(String wechattwodimensionalcode) {
        this.wechattwodimensionalcode = wechattwodimensionalcode == null ? null : wechattwodimensionalcode.trim();
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname == null ? null : bankname.trim();
    }

    public String getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(String bankaccount) {
        this.bankaccount = bankaccount == null ? null : bankaccount.trim();
    }

    public String getFreeuserids() {
        return freeuserids;
    }

    public void setFreeuserids(String freeuserids) {
        this.freeuserids = freeuserids == null ? null : freeuserids.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}
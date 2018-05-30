package brucewu.cc.church.common;

import java.util.Map;

public class Response {

    public static final String STATUS_ERROR = "error";
    public static final String STATUS_SUCCESS = "success";
    public static final String MSG_ORG_NOT_FOUND = "找不到成员";
    public static final String MSG_UNAUTORIZED = "权限不足";
    public static final String MSG_NOT_FOUND = "找不到该用户";
    public static final String MSG_UNMATCHED = "用户名或密码输入错误，登录失败";
    public static final String MSG_LOGIN_FAILED = "登录失败!";
    public static final String MSG_TIME_OUT = "超时!请重新登陆!";
    public static final String MSG_ORI_PASSWORD_ERROR = "原始密码错误";
    public static final String MSG_SUCCESS = "操作成功!";

    private String status;

    private String msg;

    private Object data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

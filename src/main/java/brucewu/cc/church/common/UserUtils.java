package brucewu.cc.church.common;

import brucewu.cc.church.bean.UserInfo;
import org.springframework.security.core.context.SecurityContextHolder;

public class UserUtils {

    public static UserInfo getCurrentUser(){
        return (UserInfo) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}

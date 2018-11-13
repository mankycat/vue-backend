package brucewu.cc.church.common;

import brucewu.cc.church.bean.UserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;

public class UserUtils {

    private static Logger logger = LoggerFactory.getLogger(UserUtils.class);

    public static UserInfo getCurrentUser(){
        UserInfo userInfo = null;
        try{
            userInfo =  (UserInfo) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        }catch (Exception e){
            e.printStackTrace();
            logger.error("" + SecurityContextHolder.getContext().getAuthentication().getPrincipal());
        }

        return userInfo;
    }

    public static boolean isCurrentUser(String userId){
        if(getCurrentUser().getUserid() == userId) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validatePassword(String password) {
        if(getCurrentUser().getPassword().equals(CipherUtils.encodeWithBase64(password))){
            return true;
        } else {
            return false;
        }
    }
}

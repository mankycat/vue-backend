package brucewu.cc.church.config;

import brucewu.cc.church.bean.Modules;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;

/**
 * Url filter for the security config
 */
@Component
public class UrlFilterInvocationSecurityMetadataSource implements FilterInvocationSecurityMetadataSource {
    @Override
    public Collection<ConfigAttribute> getAttributes(Object o) throws IllegalArgumentException {
//        String requestUrl = ((FilterInvocation) o).getRequestUrl();
//        if("/login_p".equals(requestUrl)){
//            return null; //登录页无需权限
//        }
//
//        //资源权限设定
//
//        return SecurityConfig.createList("ROLE_LOGIN");//无匹配资源需要登录权限
        return null;
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }
}

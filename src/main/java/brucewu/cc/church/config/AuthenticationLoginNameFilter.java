package brucewu.cc.church.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthenticationLoginNameFilter extends UsernamePasswordAuthenticationFilter {

    private static final Logger logger = LoggerFactory
            .getLogger(AuthenticationLoginNameFilter.class);
    private String extraParameter = "loginname";
    private String delimiter = ":";
    @Override
    public Authentication attemptAuthentication(HttpServletRequest request,
                                                HttpServletResponse response) throws AuthenticationException {
        logger.debug("Attempting for authentication. " + "username = "
                + request.getParameter("username") + ", password = "
                + request.getParameter("password"));
        return super.attemptAuthentication(request, response);
    }
    @Override
    protected String obtainUsername(HttpServletRequest request) {
        String username = request.getParameter(getUsernameParameter());
        logger.debug("username = " + username);
        String extraInput = request.getParameter(getExtraParameter()) == null ? ""
                : request.getParameter(getExtraParameter());
        logger.debug("extraInput = " + extraInput);
        String combinedUsername = "";
        String extParam = extraInput.trim();
        logger.debug("extParam = " + extParam);
        if (extParam.length() == 0) {
            combinedUsername = username;
        } else {
            combinedUsername = username + getDelimiter() + extraInput;
        }
        logger.debug("returning combinedUsername = " + combinedUsername);
        return combinedUsername;
    }
    /**
     * @return The parameter name which will be used to obtain the extra input
     * from the login request
     */
    public String getExtraParameter() {
        return this.extraParameter;
    }

    /**
     * @param extraParameter
     * The parameter name which will be used to obtain the extra
     * input from the login request
     */
    public void setExtraParameter(String extraParameter) {
        this.extraParameter = extraParameter;
    }

    /**
     * @return The delimiter string used to separate the username and extra
     * input values in the string returned by
     * obtainUsername()
     */
    public String getDelimiter() {
        return this.delimiter;
    }

    /**
     * @param delimiter
     * The delimiter string used to separate the username and extra
     * input values in the string returned by
     * obtainUsername()
     */
    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }
}

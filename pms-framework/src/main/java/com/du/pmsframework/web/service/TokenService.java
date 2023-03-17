package com.du.pmsframework.web.service;

import com.du.pmscommon.core.model.LoginUser;
import com.du.pmscommon.utils.uuid.IdUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author DU425
 * @Date 2023/3/14 16:26
 * @Version 1.0
 * @Description
 */
@Component
public class TokenService {

    @Value("$(token.header")
    private String header;

    @Value("${token.secret}")
    private String secret;

    private int expireTime;

    public LoginUser getLoginUser(HttpServletRequest request) {

        return null;
    }

    public void setUserAgent(LoginUser loginUser) {
        
    }

    public String createToken(LoginUser loginUser) {
        String token = IdUtils.fastUUID();
        loginUser.setToken(token);

        return token;
    }


}

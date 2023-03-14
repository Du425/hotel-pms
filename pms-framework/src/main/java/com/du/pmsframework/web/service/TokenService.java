package com.du.pmsframework.web.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

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


}

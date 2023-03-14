package com.du.pmscommon.core.model;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDateTime;
import java.util.Collection;

/**
 * @Author DU425
 * @Date 2023/3/14 16:38
 * @Version 1.0
 * @Description
 */

@Data
public class LoginUser implements UserDetails {

    private int id;

    private String username;

    private String password;

    private String token;

    private LocalDateTime loginTime;

    private Long expireTime;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public LoginUser() {

    }

    public LoginUser(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

}

package com.fb.org.dto;


import java.io.Serializable;
import java.math.BigInteger;

/**
 * 用户
 */
public class UserDto implements Serializable {

    private BigInteger id;

    private String userName;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

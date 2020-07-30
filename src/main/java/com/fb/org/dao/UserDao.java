package com.fb.org.dao;

import com.fb.org.dto.UserDto;

import java.math.BigInteger;

public interface UserDao {


    UserDto findById(BigInteger id);
}

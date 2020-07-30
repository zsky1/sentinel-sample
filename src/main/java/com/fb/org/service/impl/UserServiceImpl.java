package com.fb.org.service.impl;

import com.fb.org.dao.UserDao;
import com.fb.org.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;
    @Override
    public Object findById(BigInteger id) {
        return userDao.findById(id);
    }
}

package com.qm.qmall.user.service.impl;
import com.qm.qmall.user.bean.UmsMember;
import com.qm.qmall.user.mapper.UserMapper;
import com.qm.qmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public List<UmsMember> getAllUser() {
        return userMapper.selectAll();
    }
}

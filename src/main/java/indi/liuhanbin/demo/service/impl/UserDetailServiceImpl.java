package indi.liuhanbin.demo.service.impl;

import indi.liuhanbin.demo.mapper.UserDetailMapper;
import indi.liuhanbin.demo.pojo.UserDetail;
import indi.liuhanbin.demo.service.UserDetailService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDetailServiceImpl implements UserDetailService {

    @Autowired
    private UserDetailMapper userDetailMapper;

    @Override
    public void insert(UserDetail userDetail) {
        userDetailMapper.insert(userDetail);
    }

    @Override
    public void update(UserDetail userDetail) {
        userDetailMapper.updateByPrimaryKey(userDetail);
    }

    @Override
    public UserDetail select(String id) {
        return userDetailMapper.selectByPrimaryKey(id);
    }

    @Override
    public void delete(String id) {
        userDetailMapper.deleteByPrimaryKey(id);
    }
}

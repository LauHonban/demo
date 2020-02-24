package indi.liuhanbin.demo.service.impl;

import indi.liuhanbin.demo.mapper.UserBaseMapper;
import indi.liuhanbin.demo.pojo.UserBase;
import indi.liuhanbin.demo.service.UserBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserBaseServiceImpl implements UserBaseService {

    @Autowired
    private UserBaseMapper userBaseMapper;

    @Override
    public void insert(UserBase userBase) {
        userBaseMapper.insert(userBase);
    }

    @Override
    public void update(UserBase userBase) {
        userBaseMapper.updateByPrimaryKey(userBase);
    }

    @Override
    public UserBase select(String id) {
        return userBaseMapper.selectByPrimaryKey(id);
    }

    @Override
    public void delete(String id) {
        userBaseMapper.deleteByPrimaryKey(id);
    }
}

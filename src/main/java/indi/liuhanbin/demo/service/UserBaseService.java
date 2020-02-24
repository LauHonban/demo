package indi.liuhanbin.demo.service;

import indi.liuhanbin.demo.pojo.UserBase;

public interface UserBaseService {

    void insert(UserBase userBase);

    void update(UserBase userBase);

    UserBase select(String id);

    void delete(String id);

}

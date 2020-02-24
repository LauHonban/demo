package indi.liuhanbin.demo.service;

import indi.liuhanbin.demo.pojo.UserDetail;

public interface UserDetailService {

    void insert(UserDetail userDetail);

    void update(UserDetail userDetail);

    UserDetail select(String id);

    void delete(String id);

}

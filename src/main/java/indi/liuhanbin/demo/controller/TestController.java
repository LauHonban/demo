package indi.liuhanbin.demo.controller;

import indi.liuhanbin.demo.pojo.UserBase;
import indi.liuhanbin.demo.pojo.UserDetail;
import indi.liuhanbin.demo.service.UserBaseService;
import indi.liuhanbin.demo.service.UserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    private UserBaseService userBaseService;
    @Autowired
    private UserDetailService userDetailService;

    @RequestMapping(value = "/insert")
    public Map<String, Object> insert(@RequestParam String email, @RequestParam String password) {
        UserBase userBase = new UserBase();
        userBase.setId(UUID.randomUUID().toString());
        userBase.setEmail(email);
        userBase.setPassword(password);
        UserDetail userDetail = new UserDetail();
        userDetail.setId(userBase.getId());
        userDetail.setName("新建用户");
        userBaseService.insert(userBase);
        userDetailService.insert(userDetail);
        Map<String, Object> result = new LinkedHashMap<>();
        result.put("email", email);
        result.put("password", password);
        return result;
    }

}

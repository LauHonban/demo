package indi.liuhanbin.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/test")
public class TestController {

    @RequestMapping(value = "/insert")
    public Map<String, Object> insert(@RequestParam String email, @RequestParam String password) {
        System.out.println(email);
        System.out.println(password);
        Map<String, Object> result = new LinkedHashMap<>();
        result.put("email", email);
        result.put("password", password);
        return result;
    }

}

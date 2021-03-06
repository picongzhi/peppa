package com.pcz.controller;

import com.pcz.mapper.UserMapper;
import com.pcz.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author picongzhi
 */
@RestController
public class TestController {
    @GetMapping("/hello")
    public Map<String, Object> hello() {
        Map<String, Object> res = new HashMap<>();
        res.put("data", "hello world");

        return res;
    }
}

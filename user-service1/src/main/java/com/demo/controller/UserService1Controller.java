package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author AIOps
 * @ClassName: UserService1Controller
 * @Description:
 * @date: 2021/11/18 14:02
 */

@Controller
@RequestMapping("/service")
public class UserService1Controller {
    @GetMapping(value = "/{id}")
    public @ResponseBody
    String hello(@PathVariable("id") String id) {
        System.out.println(id);
        return "userService1 hello springcloud" + id;
    }
}

package com.demo.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author AIOps
 * @ClassName: UserService2Controller
 * @Description:
 * @date: 2021/11/18 14:02
 */

@RestController
@RequestMapping("/service")
public class UserService2Controller {
    @GetMapping(value = "/{id}")
    public @ResponseBody
    String hello(@PathVariable("id") String id) {
        System.out.println(id);
        return "userService2 hello springCloud" + id;
    }
}

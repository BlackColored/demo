package com.demo.controller;

import com.demo.service.GroupsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author AIOps
 * @ClassName: UserServiceController
 * @Description:
 * @date 10:16:05
 */

@RestController
@RequestMapping("/service")
public class UserServiceController {
    @Autowired
    private GroupsService groupsService;

    @GetMapping(value = "/{id}")
    public @ResponseBody
    String hello(@PathVariable("id") String id) {
        System.out.println(id);
        return "userService hello springCloud" + id;
    }

    @GetMapping("test")
    public Object testMybatisPlus() {
        return groupsService.list();
    }
}

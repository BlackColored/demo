package com.consume.controller;

import com.consume.clients.Userclient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName: ConsumeController
 * @Description:
 * @date: 2021/11/18 15:49
 */
@Slf4j
@RestController
@RequestMapping("/consume")
//@RefreshScope  热部署bootstrap.yaml文件配置,配合@value注解使用
public class ConsumeController {

    @Autowired
    private Userclient userclient;

    @GetMapping(value = "/{id}")
    public @ResponseBody
    String hello(@PathVariable("id") String id) {
        log.info("从consume进来了" + id);
        String result = userclient.getid(id);
        System.out.println(result);
        return result;
    }
}

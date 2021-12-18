package com.consume.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName: Userclient
 * @Description:
 * @date: 2021/11/19 13:01
 */

@FeignClient("user-service")
public interface Userclient {
    @GetMapping("/service/{id}")
    public String getid(@PathVariable("id") String id);
}

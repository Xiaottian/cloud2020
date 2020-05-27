package com.slasher.springcloud.controller;

import com.slasher.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author jit
 * @date 2020/5/27
 */
@RestController
public class MessageController {

    @Resource
    private IMessageProvider provider;

    @GetMapping(value = "/sendMessage")
    public String sendMessage(){
        return provider.send();
    }
}

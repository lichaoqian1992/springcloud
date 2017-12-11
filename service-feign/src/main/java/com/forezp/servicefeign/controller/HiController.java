package com.forezp.servicefeign.controller;

import com.forezp.servicefeign.service.SchedualEurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HiController {
    @Autowired
    SchedualEurekaClient service;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return service.sayHiFromClientOne(name);
    }
}

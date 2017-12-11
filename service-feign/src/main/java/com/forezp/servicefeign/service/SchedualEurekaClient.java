package com.forezp.servicefeign.service;

import com.forezp.servicefeign.utils.SchedualServiceHiHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client",fallback = SchedualServiceHiHystric.class)
public interface SchedualEurekaClient {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public abstract String sayHiFromClientOne(@RequestParam(value = "name") String name);
}

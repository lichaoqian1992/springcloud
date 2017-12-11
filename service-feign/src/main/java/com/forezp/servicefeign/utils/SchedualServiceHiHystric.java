package com.forezp.servicefeign.utils;

import com.forezp.servicefeign.service.SchedualEurekaClient;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualEurekaClient {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}

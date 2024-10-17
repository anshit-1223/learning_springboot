package com.myorganisation.firstSpringBootProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {

    @GetMapping("health")
    public String sayHello(){
        return "Server is live";
    }
}

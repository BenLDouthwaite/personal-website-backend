package com.bendouthwaite;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class HelloController {

    @CrossOrigin
    @RequestMapping(value = "/hello")
    public List<String> hello() {
        return Collections.singletonList("hello");
    }
}

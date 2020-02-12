package com.bendouthwaite.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HealthController {

    @CrossOrigin
    @GetMapping(value = "/status")
    public List<String> status() {
        return Arrays.asList("Status: OK");
    }
}

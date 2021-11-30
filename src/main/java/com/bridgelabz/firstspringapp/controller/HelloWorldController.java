package com.bridgelabz.firstspringapp.controller;

import com.bridgelabz.firstspringapp.dto.EmployeeDto;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping(value = "/hello")
    public String hello(
            @RequestParam(name = "key1") String key1,
            @RequestParam(name = "key2") String key2
    ) {
        return "Hello World " + key1 + " : " + key2;
    }

    @PutMapping(value = "/test1/{id}")
    public String test1(
            @PathVariable(name = "id") int id
    ) {
        return "put ----->" + id;
    }

    @PostMapping(value = "/test2")
    public String test2(@RequestHeader(name = "token") String userToken) {
        return userToken;
    }

    @PostMapping(value = "/test3")
    public String test3(@RequestBody EmployeeDto employeeDto) {
        return employeeDto.toString();
    }
}

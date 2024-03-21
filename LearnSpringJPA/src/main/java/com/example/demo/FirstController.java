package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {

    @PostMapping("/post-order")
    public String post(@RequestBody Order order) {
        return "request" + order;
    }

//    @GetMapping("/order/{userName}")
//    public String pathVar(
//            @PathVariable String userName
//    ) {
//        return userName;
//    }

    @GetMapping("/order")
    public String paramVar(
            @RequestParam("user") String userName,
            @RequestParam("product") String productName

    ) {
        return userName + productName;
    }
}

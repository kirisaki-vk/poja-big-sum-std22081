package com.poja.bigSum.endpoint.rest.controller.bigInt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
public class SumController {
    @GetMapping("/big-sum")
    public String bigSum(@RequestParam("a") String a, @RequestParam("b") String b) {
        return new BigInteger(a).add(new BigInteger(b)).toString();
    }
}
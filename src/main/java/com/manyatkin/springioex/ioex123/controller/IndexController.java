package com.manyatkin.springioex.ioex123.controller;

import com.manyatkin.springioex.ioex123.Scheduller;
import com.manyatkin.springioex.ioex123.model.Quote;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
//@Controller doesn't work
public class IndexController {

    @GetMapping("/")
    public Quote index() {
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        return quote;
    }
}

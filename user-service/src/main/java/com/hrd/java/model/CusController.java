package com.hrd.java.model;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public record CusController(CusService cusService) {
    @PostMapping("cus")
    public Customer add(@RequestBody CusReq cusReq){
        log.info("customer new {}", cusReq);
      return  cusService.add(cusReq);
    }

    @GetMapping("cus")
    public List<Customer> get(){
      return  cusService.findAll();
    }
}

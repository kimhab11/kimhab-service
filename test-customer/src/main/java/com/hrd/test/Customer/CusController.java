package com.hrd.test.Customer;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@AllArgsConstructor
public class CusController {
    private final CusService cusService;
    @PostMapping("cus")
    public void add(@RequestBody CusReq cusReq) {
        log.info("customer new {}", cusReq);
        cusService.add(cusReq);
    }

    @GetMapping("cus")
    public List<Customer> get() {
        return cusService.findAll();
    }
}

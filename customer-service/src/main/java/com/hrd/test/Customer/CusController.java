package com.hrd.test.Customer;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("cus")
public class CusController {
    private final CusService cusService;
    @PostMapping("cus")
    public Customer add(@RequestBody CusReq cusReq) {
        log.info("customer new {}", cusReq);
        return cusService.add(cusReq);
    }

    @GetMapping("cus")
    public List<Customer> get() {
        return cusService.findAll();
    }
}

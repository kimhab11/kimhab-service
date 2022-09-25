package com.hrd.java;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("fraud")
public class FraudController {
    private FraudCheckService fraudCheckService;
    @GetMapping("fraud/{customerId}")
    public FraudCheckResponse isFraudster(@PathVariable Integer customerId){
        Boolean isFraudulentCustomer = fraudCheckService.isFraudulentCustomer(customerId);
        log.info("fraud customer id {}", customerId);
        return new FraudCheckResponse(isFraudulentCustomer);
    }
}

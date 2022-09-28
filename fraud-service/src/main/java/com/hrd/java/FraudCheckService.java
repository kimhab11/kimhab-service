package com.hrd.java;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor

public class FraudCheckService {
    private FraudCheckHistoryRepo fraudCheckHistoryRepo;
    public Boolean isFraudulentCustomer(Integer customerId){
        fraudCheckHistoryRepo.save(
                FraudCheckHistory.builder()
                        .customerId(customerId)
                        .isFraudster(false)
                        .createdAt(LocalDateTime.now())
                        .build()
        );
        return false;
    }
}


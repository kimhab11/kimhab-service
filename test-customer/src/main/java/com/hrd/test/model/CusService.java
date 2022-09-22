package com.hrd.test.model;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record CusService(CusRepo cusRepo) {
    public Customer add(CusReq cusReq) {
        Customer customer = Customer.builder()
                .email(cusReq.email()).build();
        return cusRepo.save(customer);
    }

    public List<Customer> findAll() {
        return cusRepo.findAll();
    }
}

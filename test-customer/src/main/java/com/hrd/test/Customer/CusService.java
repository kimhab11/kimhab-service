package com.hrd.test.Customer;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@AllArgsConstructor
public class CusService {
    private final CusRepo cusRepo;
    private final RestTemplate restTemplate;

    public void add(CusReq cusReq) {
        Customer customer = Customer.builder()
                .email(cusReq.email())
                .name(cusReq.name())
                .build();
        cusRepo.saveAndFlush(customer);

        FraudCheckResponse fraudCheckResponse = restTemplate.getForObject(
                "http://FRAUD/fraud/fraud/{customerId}" ,
                FraudCheckResponse.class ,
                customer.getId()
        );
        if (fraudCheckResponse .isFraudster()){
            throw new IllegalStateException("Error");
        }
    }

    public List<Customer> findAll() {
        return cusRepo.findAll();
    }
}

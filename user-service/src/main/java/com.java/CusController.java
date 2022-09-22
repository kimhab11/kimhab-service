package com.java;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CusController{
    private final CusRepo cusRepo;

    public CusController(CusRepo cusRepo) {
        this.cusRepo = cusRepo;
    }

    @PostMapping("cus")
    public Customer addNew(@RequestBody Customer customer){
        cusRepo.save(customer);
        return customer;
    }

    @GetMapping("cus")
    public List<Customer> get(){
      return cusRepo.findAll();
    }

}

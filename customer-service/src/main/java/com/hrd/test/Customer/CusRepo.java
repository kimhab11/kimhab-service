package com.hrd.test.Customer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CusRepo extends JpaRepository<Customer, Integer> {
}

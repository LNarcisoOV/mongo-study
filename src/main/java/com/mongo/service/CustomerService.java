package com.mongo.service;

import java.util.List;
import com.mongo.model.Customer;

public interface CustomerService {
    List<Customer> getByName(String name);
    Customer save(Customer customer);
    long deleteByName(String name);
}

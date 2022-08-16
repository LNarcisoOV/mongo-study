package com.mongo.service;

import com.mongo.model.Customer;

public interface CustomerService {
    Customer getByName(String name);
}

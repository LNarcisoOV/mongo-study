package com.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.mongo.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String>{

}

package com.mongo.service;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import com.mongo.model.Customer;
import com.mongo.repository.CustomerRepository;
import com.mongodb.client.result.DeleteResult;

@Service
public class CustomerServiceImpl implements CustomerService {
    

    private static final Logger LOGGER = LoggerFactory.getLogger(AddressServiceImpl.class);

    @Autowired
    private CustomerRepository customerRepository;
    
    @Autowired
    private MongoTemplate mongoTemplate;
    
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }
    
    public List<Customer> getByName(String name) {
        LOGGER.info("----- MONGO : FINDING CUSTOMER BY NAME: {} -----", name);
        
        Query query = new Query();
        query.addCriteria(Criteria.where("name").is(name));
        List<Customer> customers = (List<Customer>) mongoTemplate.find(query, Customer.class);
        
        return customers;
    }

    @Override
    public Customer save(Customer customer) {
        LOGGER.info("----- MONGO : SAVING CUSTOMER {} -----", customer);
        
        Customer customerDB = mongoTemplate.save(customer);
        
        return customerDB;
    }
    
    @Override
    public long deleteByName(String name) {
        LOGGER.info("----- MONGO : DELETE CUSTOMERS BY NAME: {} -----", name);
        
        Query query = new Query();
        query.addCriteria(Criteria.where("name").is(name));
        DeleteResult result = mongoTemplate.remove(query, Customer.class);
        
        return result.getDeletedCount();
    }

}

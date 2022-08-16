package com.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.mongo.model.Address;

public interface AddressRepository extends MongoRepository<Address, String>{

}

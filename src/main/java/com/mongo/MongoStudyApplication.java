package com.mongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.mongo.repository")
public class MongoStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoStudyApplication.class, args);
	}

}

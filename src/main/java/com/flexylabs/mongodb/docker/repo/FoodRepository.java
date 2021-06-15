package com.flexylabs.mongodb.docker.repo;

import com.flexylabs.mongodb.docker.model.Food;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface FoodRepository extends MongoRepository<Food, Integer> {

}

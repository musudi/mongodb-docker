package com.flexylabs.mongodb.docker.controller;

import java.util.List;

import com.flexylabs.mongodb.docker.model.Food;
import com.flexylabs.mongodb.docker.repo.FoodRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodController {

    @Autowired
    private FoodRepository foodRepository;

    @PostMapping("/addFood")
    public String saveFood(@RequestBody Food food) {
        foodRepository.save(food);
        return "Food added successfully::" + food.getId();

    }

    @GetMapping("/findAllFoods")
    public List<Food> getFoods() {
        return foodRepository.findAll();
    }
}

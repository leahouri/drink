package com.example.drink.controller;

import com.example.drink.models.Info;
import com.example.drink.models.TestModel;
import com.example.drink.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping
public class TestController {

    @Autowired
    TestRepository testRepository;

    @RequestMapping(value = "/get/{id}")
    public TestModel getDrinkById(@PathVariable int id) throws Exception {

        return testRepository.findById(id)
                .orElseThrow(() -> new Exception());
    }

    @RequestMapping(value = "/getAll")
    public List<TestModel> getAllToys(){
        List<TestModel> drinks = new ArrayList<TestModel>();
        testRepository.findAll().forEach(drink -> drinks.add(drink));
        return drinks;
    }

    @RequestMapping(value = "/totalprice")
    public double getTotalPrice(){
        List<TestModel> drinks = new ArrayList<TestModel>();
        testRepository.findAll().forEach(drink -> drinks.add(drink));
        double price = 0.00;
        for(int i = 0; i< drinks.toArray().length; i++){
            price = price + drinks.get(i).getPrice();
        }
        return price;
    }

    @RequestMapping(value = "/info")
    public Info InfogetInfo(){
        Info inf = new Info("Lea Houri", "62489", 10, " 26/04/2022");

        return inf;
    }
}

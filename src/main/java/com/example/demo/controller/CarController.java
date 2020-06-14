package com.example.demo.controller;

import com.example.demo.Dao.CarDao;
import com.example.demo.Model.CarItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    @Autowired
    CarDao carDao;

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping("/cars")
    public Iterable<CarItem> getCars(){
        return  carDao.findAll();
    }
}

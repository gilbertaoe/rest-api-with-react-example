package com.example.restapi.controllers;

import java.util.List;

import com.example.restapi.models.RealEstate;
import com.example.restapi.repositories.RealEstateRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RealEstateController {

    @Autowired
    private RealEstateRepository repository;

    @GetMapping("/employees")
    List<RealEstate> all() {
        return repository.findAll();
    }
}

package com.example.restapi.controllers;

import java.util.List;

import com.example.restapi.models.Flower;
import com.example.restapi.repositories.FlowersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/flowers")
public class FlowersController {

    @Autowired
    private FlowersRepository repository;

    @GetMapping()
    List<Flower> getAll() {
        return repository.findAll();
    }

    @PutMapping()
    ResponseEntity<Flower> addFlower(@RequestBody(required = true) Flower newFlower) {
        if(newFlower != null && newFlower.Name != null) {
            Flower saveResult = repository.save(newFlower);

            return new ResponseEntity<Flower>(saveResult, HttpStatus.OK);
        }

        return new ResponseEntity<Flower>(HttpStatus.BAD_REQUEST); 
    }
}
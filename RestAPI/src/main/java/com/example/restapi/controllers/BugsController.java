package com.example.restapi.controllers;

import java.util.List;

import com.example.restapi.models.Bug;
import com.example.restapi.repositories.BugsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bugs")
public class BugsController {

    @Autowired
    private BugsRepository repository;

    @GetMapping()
    List<Bug> getAll() {
        return repository.findAll();
    }

    @PutMapping()
    ResponseEntity<Bug> addBug(@RequestBody(required = true) Bug newBug) {
        if(newBug != null && newBug.Name != null) {
            Bug saveResult = repository.save(newBug);

            return new ResponseEntity<Bug>(saveResult, HttpStatus.OK);
        }

        return new ResponseEntity<Bug>(HttpStatus.BAD_REQUEST); 
    }
}
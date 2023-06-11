package com.example.restapi.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Flowers")
public class Flower {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    
    public String Name;
    public String Description;
    public String ImagePath;
}
package com.nishkarsh.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.nishkarsh.restapi.model.Credentials;
import com.nishkarsh.restapi.repository.ManagerRepo;

import org.springframework.http.ResponseEntity;
import javax.validation.Valid;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    ManagerRepo managerepo;

// Get All Notes
    @GetMapping("/app/sites/list")
    public List<Credentials> getAllNotes() {
        return managerepo.findAll();
    }

// Create a new Note
    @PostMapping("/app/sites")
    public Credentials createNote( @RequestBody Credentials book) {
        return managerepo.save(book);
    }



}
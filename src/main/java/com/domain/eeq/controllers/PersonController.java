package com.domain.eeq.controllers;

import com.domain.eeq.models.entities.Person;
import com.domain.eeq.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping
    public Person create(@RequestBody Person person){
        return personService.save(person);
    }

    @GetMapping
    public Iterable<Person> findAll() {
        return personService.findAll();
    }

    //searchById
    @GetMapping("/{id}")
    public Person findOne(@PathVariable("id") Long id){
        return personService.findOne(id);
    }

    //update
    @PutMapping
    public Person update(@RequestBody Person person) {
        return personService.save(person);
    }

    @DeleteMapping("/{id}")
    public void removeOne(@PathVariable("id") Long id) {
        personService.removeOne(id);
    }

}

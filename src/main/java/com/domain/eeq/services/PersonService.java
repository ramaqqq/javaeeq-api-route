package com.domain.eeq.services;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.eeq.models.entities.Person;
import com.domain.eeq.models.repos.PersonRepo;

import java.util.List;


@Service
@Transactional
public class PersonService {

    @Autowired
    private PersonRepo personRepo;

    public Person save(Person person) {
        return personRepo.save(person);
    }

    public Person findOne(Long id) {
        return personRepo.findById(id).get();
    }

    public Iterable<Person> findAll() {
        return personRepo.findAll();
    }

    public void removeOne(Long id){
        personRepo.deleteById(id);
    }

    //search
    public List<Person> findByName(String username){
        return personRepo.findByUsernameContains(username);
    }


}

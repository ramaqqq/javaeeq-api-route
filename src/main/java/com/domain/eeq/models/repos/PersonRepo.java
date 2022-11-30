package com.domain.eeq.models.repos;

import com.domain.eeq.models.entities.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepo extends CrudRepository<Person, Long> {

    List<Person> findByUsernameContains(String username);

}

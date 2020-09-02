package com.example.mongodbcrud.services;

import com.example.mongodbcrud.model.Person;
import com.example.mongodbcrud.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    // Create opreation
    public Person create(String firstName, String lastName, int age) {
        return personRepository.save(new Person(firstName, lastName, age));
    }

    // Get single person
    public Person getByFirstName(String firstName) {
        return personRepository.findByFirstName(firstName);
    }

    // Get list of persons
    public List<Person> getAll() {
        return personRepository.findAll();
    }

    public Person update(String firstName, String newLastName, int newAge) {
        Person p = personRepository.findByFirstName(firstName);
        p.setLastName(newLastName);
        p.setAge(newAge);
        return personRepository.save(p);
    }

    // Delete operation
    public void deleteAll() {
        personRepository.deleteAll();
    }

    public void delete(String firstName) {
        Person p = personRepository.findByFirstName(firstName);
        personRepository.delete(p);
    }
}

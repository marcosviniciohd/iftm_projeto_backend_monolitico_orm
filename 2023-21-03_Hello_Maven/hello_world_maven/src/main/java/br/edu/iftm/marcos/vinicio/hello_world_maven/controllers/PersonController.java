package br.edu.iftm.marcos.vinicio.hello_world_maven.controllers;

import br.edu.iftm.marcos.vinicio.hello_world_maven.models.Person;
import br.edu.iftm.marcos.vinicio.hello_world_maven.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping("persons")
    public List<Person> findyAll(){
        return personService.findAll();
    }

    @GetMapping("persons/{id}")
    public Optional<Person> find(@PathVariable("id") Long id){
        return personService.findById(id);
    }

    @PostMapping("person")
    public Person save(@RequestBody Person person){
        return personService.save(person);
    }

    @PutMapping("person")
    public Person update(@RequestBody Person person){
        return personService.update(person);
    }

    @DeleteMapping("person/{id}")
    public String delete(@PathVariable("id") Long id){
        return personService.delete(id);
    }

}

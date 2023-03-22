package br.edu.iftm.marcos.vinicio.hello_world_maven.services;

import br.edu.iftm.marcos.vinicio.hello_world_maven.models.Person;
import br.edu.iftm.marcos.vinicio.hello_world_maven.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> findAll(){
        return personRepository.findAll();
    }

    public Optional<Person> findById(Long id){
        return personRepository.findById(id);
    }

    public Person save(Person person){
        if (!person.getFirstName().isBlank() && !person.getFirstName().isEmpty()){
            return personRepository.save(person);
        }
        return null;
    }

    public Person update(Person person){
        var dbPerson = personRepository.findById(person.getId());
        if (dbPerson != null){
            return personRepository.save(person);
        }
        return null;
    }

    public String delete(Long id){
        var dbPerson = personRepository.findById(id);
        if (dbPerson != null){
            personRepository.deleteById(id);
            return "Person id " + id + "has been deleted";
        }
        return "Person id não encontrado";
    }
}

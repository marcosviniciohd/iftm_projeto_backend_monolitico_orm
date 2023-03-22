package br.edu.iftm.marcos.vinicio.hello_world_maven.repositories;

import br.edu.iftm.marcos.vinicio.hello_world_maven.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}

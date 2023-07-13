package br.edu.iftm.marcos.restapiatividade2.repositories;

import br.edu.iftm.marcos.restapiatividade2.model.Email;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<Email, Long> {
}

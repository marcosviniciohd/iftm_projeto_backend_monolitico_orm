package br.edu.iftm.marcos.restapiatividade2.services;

import br.edu.iftm.marcos.restapiatividade2.model.Email;
import br.edu.iftm.marcos.restapiatividade2.repositories.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmailService {

    @Autowired
    private EmailRepository emailRepository;

    public List<Email> findAll() {
        return emailRepository.findAll();
    }

    public Optional<Email> findById(Long id) {
        return emailRepository.findById(id);
    }

    public Email save(Email email) {
        if (!email.getFrom().isBlank() && !email.getFrom().isEmpty()){
            return emailRepository.save(email);
        }
        return null;
    }

    public Email update(Email email) {
        var emailOptional = emailRepository.findById(email.getId());
        if (emailOptional.isPresent()) {
            var emailUpdate = emailOptional.get();
            emailUpdate.setFrom(email.getFrom());
            emailUpdate.setTo(email.getTo());
            emailUpdate.setSubject(email.getSubject());
            emailUpdate.setBody(email.getBody());
            return emailRepository.save(emailUpdate);
        }
        return null;
    }

    public String delete(Long id) {
        var emailOptional = emailRepository.findById(id);
        if (emailOptional.isPresent()) {
            emailRepository.deleteById(id);
            return "Email deletado com sucesso!";
        }
        return "Email não encontrado!";
    }


}

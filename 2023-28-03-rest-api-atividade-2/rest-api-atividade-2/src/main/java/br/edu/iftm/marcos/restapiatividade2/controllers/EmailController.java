package br.edu.iftm.marcos.restapiatividade2.controllers;

import br.edu.iftm.marcos.restapiatividade2.model.Email;
import br.edu.iftm.marcos.restapiatividade2.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class EmailController {
    @Autowired
    private EmailService emailService;

    @GetMapping("/email")
    public List<Email> findAll() {
        return emailService.findAll();
    }

    @GetMapping("/email/{id}")
    public Email findById(@PathVariable("id") Long id) {
        return emailService.findById(id).get();
    }

    @PostMapping("/email")
    public Email save(@RequestBody Email email) {
        return emailService.save(email);
    }

    @PutMapping("/email")
    public Email update(@RequestBody Email email) {
        return emailService.update(email);
    }

    @DeleteMapping("/email/{id}")
    public String delete(@PathVariable("id") Long id) {
        return emailService.delete(id);
    }
}

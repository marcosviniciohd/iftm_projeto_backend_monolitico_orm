package br.edu.iftm.marcos.restapiatividade2.controllers;

import br.edu.iftm.marcos.restapiatividade2.model.User;
import br.edu.iftm.marcos.restapiatividade2.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    private List<User> findyAll() {
        return userService.findAll();
    }

    @GetMapping("/user/{id}")
    public Optional<User> findById(@PathVariable("id") Long id) {
        return userService.findById(id);
    }

    @PostMapping("/user")
    public User save(@RequestBody User user) {
        return userService.save(user);
    }

    @PutMapping("/user")
    public User update(@RequestBody User user) {
        return userService.update(user);
    }

    @DeleteMapping("/user/{id}")
    public String delete(@PathVariable("id") Long id) {
        return userService.delete(id);
    }

}

package br.edu.iftm.marcos.restapiatividade2.services;

import br.edu.iftm.marcos.restapiatividade2.model.User;
import br.edu.iftm.marcos.restapiatividade2.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User save(User user) {
        if (!user.getUserName().isBlank() && !user.getUserName().isEmpty()){
            return userRepository.save(user);
        }
        return null;
    }

    public User findByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }

    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    public User update(User user) {
        var userOptional = userRepository.findById(user.getId());
        if (userOptional.isPresent()) {
            var userUpdate = userOptional.get();
            userUpdate.setFirstName(user.getFirstName());
            userUpdate.setLastName(user.getLastName());
            userUpdate.setUserName(user.getUserName());
            userUpdate.setPassword(user.getPassword());
            userUpdate.setPhone(user.getPhone());
            userUpdate.setSocialNetwork(user.getSocialNetwork());
            return userRepository.save(userUpdate);
        }
        return null;
    }

    public String delete(Long id) {
        var userOptional = userRepository.findById(id);
        if (userOptional.isPresent()) {
            userRepository.deleteById(id);
            return "User deletado com sucesso!";
        }
        return "User não encontrado!";
    }
}

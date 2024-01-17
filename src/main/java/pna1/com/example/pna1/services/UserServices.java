package pna1.com.example.pna1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pna1.com.example.pna1.entities.User;
import pna1.com.example.pna1.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserServices {
    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    /*Procurar o Usuário pelo ID*/
    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }
}

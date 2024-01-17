package pna1.com.example.pna1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pna1.com.example.pna1.entities.Order;
import pna1.com.example.pna1.entities.User;
import pna1.com.example.pna1.repositories.OrderRepository;
import pna1.com.example.pna1.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServices {
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    /*Procurar o Usuário pelo ID*/
    public Order findById(Long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}

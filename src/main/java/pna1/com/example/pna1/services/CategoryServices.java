package pna1.com.example.pna1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pna1.com.example.pna1.entities.Category;
import pna1.com.example.pna1.repositories.CategoryRepository;


import java.util.List;
import java.util.Optional;

@Service
public class CategoryServices {
    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    /*Procurar o Usuário pelo ID*/
    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}

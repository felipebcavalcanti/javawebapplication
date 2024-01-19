package pna1.com.example.pna1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pna1.com.example.pna1.entities.Category;
import pna1.com.example.pna1.entities.Product;
import pna1.com.example.pna1.repositories.CategoryRepository;
import pna1.com.example.pna1.repositories.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServices {
    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    /*Procurar o Usuário pelo ID*/
    public Product findById(Long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}

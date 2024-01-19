package pna1.com.example.pna1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pna1.com.example.pna1.entities.Category;
import pna1.com.example.pna1.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
}

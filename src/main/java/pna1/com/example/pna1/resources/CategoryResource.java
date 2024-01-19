package pna1.com.example.pna1.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pna1.com.example.pna1.entities.Category;
import pna1.com.example.pna1.entities.User;
import pna1.com.example.pna1.services.CategoryServices;

import java.util.List;

/*Classe que vai me disponibilizar um recurso WEB para a classe USER*/
/*classe feita para obter a Resposta da Entidade. no caso USER*/
@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
    @Autowired
    private CategoryServices service;
    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
    /*Vai aceitar que dentro da URL tem um ID*/
    /*Pra a funcao aceitar o ID tem que passar no paramentro o @pathvariable*/
    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id) {
        Category obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}

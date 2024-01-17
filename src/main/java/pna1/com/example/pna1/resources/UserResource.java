package pna1.com.example.pna1.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pna1.com.example.pna1.entities.User;
import pna1.com.example.pna1.services.UserServices;

import java.util.List;

/*Classe que vai me disponibilizar um recurso WEB para a classe USER*/
/*classe feita para obter a Resposta da Entidade. no caso USER*/
@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @Autowired
    private UserServices service;
    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
    /*Vai aceitar que dentro da URL tem um ID*/
    /*Pra a funcao aceitar o ID tem que passar no paramentro o @pathvariable*/
    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        User obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}

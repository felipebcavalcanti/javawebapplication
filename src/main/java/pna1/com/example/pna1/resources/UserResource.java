package pna1.com.example.pna1.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pna1.com.example.pna1.entities.User;

/*Classe que vai me disponibilizar um recurso WEB para a classe USER*/
/*classe feita para obter a Resposta da Entidade. no caso USER*/
@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Maria","maria@gmail.com","999999", "12345");
        return ResponseEntity.ok().body(u);

    }
}

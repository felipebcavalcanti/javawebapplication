package pna1.com.example.pna1.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import pna1.com.example.pna1.entities.User;
import pna1.com.example.pna1.repositories.UserRepository;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    /*A aplicação precisa saber quando começar a rodar quando vai usar esse metodos, entao implementa o COMANDLINERUNNER
    * e depois implementa o metodo abaixo, tudo que tiver dentro dele vai rodar.*/
    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}

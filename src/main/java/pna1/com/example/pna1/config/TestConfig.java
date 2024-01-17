package pna1.com.example.pna1.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import pna1.com.example.pna1.entities.Order;
import pna1.com.example.pna1.entities.User;
import pna1.com.example.pna1.entities.enums.OrderStatus;
import pna1.com.example.pna1.repositories.OrderRepository;
import pna1.com.example.pna1.repositories.UserRepository;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderRepository orderRepository;
    /*A aplicação precisa saber quando começar a rodar quando vai usar esse metodos, entao implementa o COMANDLINERUNNER
    * e depois implementa o metodo abaixo, tudo que tiver dentro dele vai rodar.*/
    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1, OrderStatus.PAID);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2, OrderStatus.DELIVERED);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1, OrderStatus.PAID);

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}

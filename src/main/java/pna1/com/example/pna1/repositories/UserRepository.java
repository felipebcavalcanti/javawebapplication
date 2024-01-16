package pna1.com.example.pna1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pna1.com.example.pna1.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}

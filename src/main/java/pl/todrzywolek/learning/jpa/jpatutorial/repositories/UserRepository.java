package pl.todrzywolek.learning.jpa.jpatutorial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.todrzywolek.learning.jpa.jpatutorial.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}

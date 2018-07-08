package pl.todrzywolek.learning.jpa.jpatutorial.helpers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.todrzywolek.learning.jpa.jpatutorial.entities.User;
import pl.todrzywolek.learning.jpa.jpatutorial.repositories.UserRepository;

import java.util.List;
import java.util.Optional;


@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

    private static final Logger log =
            LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jeremy", "User");
        userRepository.save(user);
        log.info("New user created by UserRepository: " + user);

//        spring data find user with id=1
        Optional<User> userWithIdOne = userRepository.findById(1L);
        log.info("User with id one is retrieved: " + userWithIdOne);

//        find all users
        List<User> users = userRepository.findAll();
        log.info("Number of users in database: " + users.size());

    }
}

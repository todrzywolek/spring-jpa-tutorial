package pl.todrzywolek.learning.jpa.jpatutorial.helpers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.todrzywolek.learning.jpa.jpatutorial.entities.User;
import pl.todrzywolek.learning.jpa.jpatutorial.services.UserService;

// This class inserts an user entity to the database after Spring context launches

@Component
public class UserServiceCommandLineRunner implements CommandLineRunner {

    private static final Logger log =
            LoggerFactory.getLogger(UserServiceCommandLineRunner.class);

    @Autowired
    private UserService userService;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jack", "Admin");
        User user1 = new User("Jill", "User");
        userService.insert(user);
        userService.insert(user1);
        log.info("New User is created: " + user);
        log.info("New User is created: " + user1);

    }
}

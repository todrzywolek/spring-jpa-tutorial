package pl.todrzywolek.learning.jpa.jpatutorial.services;


import org.springframework.stereotype.Repository;
import pl.todrzywolek.learning.jpa.jpatutorial.entities.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional // each method in class with be in transaction
public class UserService {

    @PersistenceContext
    private EntityManager entityManager;

    public long insert(User user) {
        entityManager.persist(user);
        return user.getId();
    }
}

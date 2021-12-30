package com.maximKachan.englishCards.repository;

import com.maximKachan.englishCards.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional(readOnly = true)
public class UserRepositoryImpl implements UserRepository{

    private final JpaUser jpaUser;

    @PersistenceContext
    private EntityManager entityManager;

    public UserRepositoryImpl(JpaUser jpaUser){
        this.jpaUser = jpaUser;
    }

    @Override
    public User findUserByEmail(String email) {
        return jpaUser.findUserByEmail(email);
    }

    @Override
    @Transactional()
    public void addUser(User user) {
        jpaUser.save(user);
    }
}

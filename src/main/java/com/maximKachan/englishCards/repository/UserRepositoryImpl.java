package com.maximKachan.englishCards.repository;

import com.maximKachan.englishCards.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository{

    private final JpaUser jpaUser;

    public UserRepositoryImpl(JpaUser jpaUser){
        this.jpaUser = jpaUser;
    }

    @Override
    public User findUserByEmail(String email) {
        return jpaUser.findUserByEmail(email);
    }

    @Override
    public void addUser(User user) {
        jpaUser.save(user);
    }
}

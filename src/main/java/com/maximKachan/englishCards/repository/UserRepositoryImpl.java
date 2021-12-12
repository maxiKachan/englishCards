package com.maximKachan.englishCards.repository;

import com.maximKachan.englishCards.model.User;

public class UserRepositoryImpl implements UserRepository{

    private JpaUser jpaUser;

    @Override
    public User findUserByEmail(String email) {
        return jpaUser.findUserByEmail(email);
    }
}

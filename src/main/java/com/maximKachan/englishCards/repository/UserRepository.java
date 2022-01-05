package com.maximKachan.englishCards.repository;

import com.maximKachan.englishCards.model.User;

public interface UserRepository{
    User findUserByEmail(String email);

    User findUserById(Integer id);

    void addUser(User user);
}

package com.maximKachan.englishCards.service;

import com.maximKachan.englishCards.model.User;

public interface UserService {
    User findUserByEmail(String email);

    void addUser(User user);
}

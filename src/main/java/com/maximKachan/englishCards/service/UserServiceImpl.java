package com.maximKachan.englishCards.service;

import com.maximKachan.englishCards.model.User;
import com.maximKachan.englishCards.repository.UserRepository;

public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findUserByEmail(String email) {
        return null;
    }

    @Override
    public void addUser(User user) {

    }
}

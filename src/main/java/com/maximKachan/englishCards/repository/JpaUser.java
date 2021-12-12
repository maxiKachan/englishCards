package com.maximKachan.englishCards.repository;

import com.maximKachan.englishCards.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUser extends JpaRepository<User, Integer> {

    User findUserByEmail(String email);
}

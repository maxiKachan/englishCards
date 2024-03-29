package com.maximKachan.englishCards.repository;

import com.maximKachan.englishCards.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface JpaUser extends JpaRepository<User, Integer> {

    User findUserByEmail(String email);

    User findUserById(int id);

    @Override
    @Transactional
    <S extends User> S save(S entity);
}

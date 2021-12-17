package com.maximKachan.englishCards.repository;

import com.maximKachan.englishCards.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

public interface JpaUser extends JpaRepository<User, Integer> {

    User findUserByEmail(String email);

    @Override
    @Transactional
    <S extends User> S save(S entity);
}

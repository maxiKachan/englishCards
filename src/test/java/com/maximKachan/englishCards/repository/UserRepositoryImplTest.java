package com.maximKachan.englishCards.repository;

import com.maximKachan.englishCards.model.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ContextConfiguration({"classpath:spring/spring-context.xml", "classpath:spring/spring-db.xml"})
@ExtendWith(SpringExtension.class)
@Sql(scripts = {"classpath:database/create-tables.sql", "classpath:database/populate-database.sql"},
        config = @SqlConfig(encoding = "UTF-8"))
class UserRepositoryImplTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void findUserByEmail() {
        User user = userRepository.findUserByEmail("ivanov@gmail.com");
        System.out.println(user);
    }

    @Test
    void addUser() {
    }
}
package com.maximKachan.englishCards.repository;

import com.maximKachan.englishCards.model.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static com.maximKachan.englishCards.util.TestHelper.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@ContextConfiguration({"classpath:spring/spring-context.xml", "classpath:spring/spring-db.xml"})
@ExtendWith(SpringExtension.class)
@Sql(scripts = {"classpath:database/create-tables.sql", "classpath:database/populate-database.sql"},
        config = @SqlConfig(encoding = "UTF-8"))
class UserRepositoryImplTest {

    private static final Logger log = LoggerFactory.getLogger(UserRepositoryImplTest.class);

    @Autowired
    private UserRepository userRepository;

    @Test
    void findUserByEmail() {
        log.info("<**********     Start Test     **********>");
        User user = userRepository.findUserByEmail("ivanov@gmail.com");
        System.out.println(user);
        assertEquals(TEST_USER_BY_EMAIL, user);
        log.info("<**********     Finished Test     **********>");
    }

    @Test
    void findUserByWrongEmail(){
        log.info("<**********     Start Test     **********>");
        User user = userRepository.findUserByEmail("sidorov@gmail.com");
        assertNull(user);
        log.info("<**********     Finished Test     **********>");
    }

    @Test
    void addUser() {
        log.info("<**********     Start Test     **********>");
        userRepository.addUser(TEST_USER_SAVE);
        assertEquals(TEST_USER_SAVED, userRepository.findUserByEmail(TEST_USER_SAVE.getEmail()));
        log.info("<**********     Finished Test     **********>");
    }
}
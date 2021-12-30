DROP TABLE IF EXISTS ec_card;
DROP TABLE IF EXISTS ec_word;
DROP TABLE IF EXISTS ec_user;

CREATE TABLE ec_user
(
    user_id SERIAL,
    email VARCHAR(100) NOT NULL,
    user_name VARCHAR(100) NOT NULL,
    password VARCHAR(255) NOT NULL,
    name VARCHAR(100),
    surname VARCHAR(100),
    birthday DATE NOT NULL,
    PRIMARY KEY (user_id)
);

CREATE TABLE ec_word
(
    word_id SERIAL,
    english VARCHAR(100) NOT NULL,
    russian VARCHAR(100) NOT NULL,
    transcription VARCHAR(100),
    type VARCHAR(50) NOT NULL,
    level VARCHAR(50) NOT NULL,
    PRIMARY KEY (word_id)
);

CREATE TABLE ec_card
(
    card_id SERIAL,
    user_id INT NOT NULL,
    word_id INT NOT NULL,
    create_date DATE NOT NULL,
    repeat_date DATE NOT NULL,
    attempt INT NOT NULL,
    streak INT NOT NULL,
    learned boolean NOT NULL,
    PRIMARY KEY (card_id),
    FOREIGN KEY (user_id) REFERENCES ec_user (user_id) ON DELETE RESTRICT,
    FOREIGN KEY (word_id) REFERENCES ec_word (word_id) ON DELETE RESTRICT
);
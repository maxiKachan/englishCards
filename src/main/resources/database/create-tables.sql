DROP TABLE IF EXISTS ec_user;

CREATE TABLE ec_user (
    user_id SERIAL,
    email VARCHAR(100),
    user_name VARCHAR(100),
    password VARCHAR(255),
    name VARCHAR(100),
    surname VARCHAR(100),
    birthday DATE
);

CREATE TABLE ec_word (
    word_id SERIAL,
    english VARCHAR(100),
    russian VARCHAR(100),
    transcription VARCHAR(100),
    type VARCHAR(30),
    english_level VARCHAR(10)
);
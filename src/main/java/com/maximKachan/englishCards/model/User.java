package com.maximKachan.englishCards.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class User {
    private Integer id;
    private String email;
    private String username;
    private String password;
    private String name;
    private String surname;
    private LocalDate birthday;
    private List<Word> words;
    private List<Card> cards;

    public User() {
    }

    public User(Integer id, String email, String username, String password, LocalDate birthday) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.password = password;
        this.birthday = birthday;
    }

    public User(Integer id, String email, String username, String password, String name, String surname, LocalDate birthday, List<Word> words, List<Card> cards) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.words = words;
        this.cards = cards;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday=" + birthday +
                ", words=" + words +
                ", cards=" + cards +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id.equals(user.id) && email.equals(user.email) && username.equals(user.username) &&
                password.equals(user.password) && Objects.equals(name, user.name) &&
                Objects.equals(surname, user.surname) && birthday.equals(user.birthday) &&
                Objects.equals(words, user.words) && Objects.equals(cards, user.cards);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, username, password, birthday);
    }
}

package com.maximKachan.englishCards.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ec_word")
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "word_id")
    private Integer id;
    @Column(name = "english")
    private String english;
    @Column(name = "russian")
    private String russian;
    @Column(name = "transcription")
    private String transcription;
    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private Type type;
    @Column(name = "level")
    @Enumerated(EnumType.STRING)
    private EnglishLevel englishLevel;

    public Word() {
    }

    public Word(Integer id, String english, String russian) {
        this.id = id;
        this.english = english;
        this.russian = russian;
    }

    public Word( String english, String russian, String transcription, Type type, EnglishLevel level) {
        this.english = english;
        this.russian = russian;
        this.transcription = transcription;
        this.type = type;
        this.englishLevel = level;
    }

    public Word(Integer id, String english, String russian, String transcription, Type type, EnglishLevel level) {
        this.id = id;
        this.english = english;
        this.russian = russian;
        this.transcription = transcription;
        this.type = type;
        this.englishLevel = level;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getRussian() {
        return russian;
    }

    public void setRussian(String russian) {
        this.russian = russian;
    }

    public String getTranscription() {
        return transcription;
    }

    public void setTranscription(String transcription) {
        this.transcription = transcription;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public EnglishLevel getEnglishLevel() {
        return englishLevel;
    }

    public void setEnglishLevel(EnglishLevel englishLevel) {
        this.englishLevel = englishLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return id.equals(word.id) && english.equals(word.english) && russian.equals(word.russian) &&
                Objects.equals(transcription, word.transcription) && type == word.type && englishLevel == word.englishLevel;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Word{" +
                "id=" + id +
                ", english='" + english + '\'' +
                ", russian='" + russian + '\'' +
                ", transcription='" + transcription + '\'' +
                ", type=" + type +
                ", englishLevel=" + englishLevel +
                '}';
    }
}

package com.maximKachan.englishCards.model;

import java.util.Objects;

public class Word {
    private Integer id;
    private String english;
    private String russian;
    private String transcription;
    private Type type;
    private Level level;

    public Word() {
    }

    public Word(Integer id, String english, String russian) {
        this.id = id;
        this.english = english;
        this.russian = russian;
    }

    public Word(Integer id, String english, String russian, String transcription, Type type, Level level) {
        this.id = id;
        this.english = english;
        this.russian = russian;
        this.transcription = transcription;
        this.type = type;
        this.level = level;
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

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return id.equals(word.id) && english.equals(word.english) && russian.equals(word.russian) &&
                Objects.equals(transcription, word.transcription) && type == word.type && level == word.level;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, english, russian, transcription, type, level);
    }
}

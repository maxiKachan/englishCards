package com.maximKachan.englishCards.model;

public enum EnglishLevel {
    A1("Elementary"),
    A2("Pre-Intermediate"),
    B1("Intermediate"),
    B2("Upper-Intermediate"),
    C1("Advanced"),
    C2("Proficiency"),
    UNDEFINED("-");

    private final String description;

    EnglishLevel(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}

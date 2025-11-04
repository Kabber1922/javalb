package org.example;

abstract class Language {
    protected String name;

    public Language(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
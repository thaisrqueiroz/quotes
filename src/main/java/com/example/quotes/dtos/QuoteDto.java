package com.example.quotes.dtos;

public class QuoteDto {
    private String phrase;
    private String author;

    public QuoteDto(String phrase, String author) {
        this.phrase = phrase;
        this.author = author;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
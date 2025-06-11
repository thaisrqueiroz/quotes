package com.example.quotes.controllers;

import com.example.quotes.models.Quote;
import com.example.quotes.services.QuoteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuoteController {
    private final QuoteService quoteService;

    public QuoteController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @GetMapping("/quotes")
    public ResponseEntity<List<Quote>> getAllQuotes(){
        List<Quote> quotes = quoteService.getAllQuotes();
        return new ResponseEntity<List<Quote>>(quotes, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Quote> addQuote(@RequestBody Quote newQuote){
        Quote createdQuote = quoteService.addQuote(newQuote);
        return new ResponseEntity<Quote>(createdQuote, HttpStatus.CREATED);
    }
}
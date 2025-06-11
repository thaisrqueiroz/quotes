package com.example.quotes.controllers;

import com.example.quotes.models.Quote;
import com.example.quotes.services.QuoteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuoteController {
    private final QuoteService quoteService;

    public QuoteController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @GetMapping("/quotes")
    public List<Quote> getAllQuotes(){
        return quoteService.getAllQuotes();
    }
}

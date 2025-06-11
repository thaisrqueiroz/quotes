package com.example.quotes.controllers;

import com.example.quotes.models.Quote;
import com.example.quotes.services.QuoteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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

    @PostMapping("/quotes")
    public ResponseEntity<Quote> addQuote(@RequestBody Quote newQuote){
        Quote createdQuote = quoteService.addQuote(newQuote);
        return new ResponseEntity<Quote>(createdQuote, HttpStatus.CREATED);
    }

    @PutMapping("/quotes/{id}")
    public ResponseEntity<Quote> updateQuote(@PathVariable Long id, @RequestBody Quote updatedQuote){
        Quote updated = quoteService.updateQuote(id, updatedQuote);
        return new ResponseEntity<Quote>(updated, HttpStatus.OK);
    }

    @GetMapping("/quotes/{id}")
    public ResponseEntity<Quote> getQuotebyId(@PathVariable Long id) {
        Quote gotQuote = quoteService.getQuoteById(id);
        return new ResponseEntity<Quote>(gotQuote, HttpStatus.OK);
    }

    @DeleteMapping("/quotes/{id}")
    public ResponseEntity<Quote> deleteQuote(@PathVariable Long id){
        Quote deleteQuote = quoteService.getQuoteById(id);
        quoteService.deleteQuoteById(id);
        return new ResponseEntity<Quote>(deleteQuote, HttpStatus.NO_CONTENT);
    }
}
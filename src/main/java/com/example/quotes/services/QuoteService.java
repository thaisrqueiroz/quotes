package com.example.quotes.services;

import com.example.quotes.models.Quote;
import com.example.quotes.repositories.QuoteRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class QuoteService {
    private final QuoteRepository quoteRepository;

    public QuoteService(QuoteRepository quoteRepository) {
        this.quoteRepository = quoteRepository;
    }

    public List<Quote> getAllQuotes(){
        return quoteRepository.findAll();
    }

    public Quote addQuote(Quote newQuote) {
        return quoteRepository.save(newQuote);
    }
}
package com.example.quotes.services;

import com.example.quotes.dtos.QuoteDto;
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

    public Quote getQuoteById(Long id) {
        return quoteRepository.findById(id).orElse(null);
    }

    public Quote addQuote(Quote newQuote) {
        quoteRepository.save(newQuote);
        return newQuote;
    }

    public Quote updateQuote (Long id, Quote updatedQuote){
        Quote existingQuote = getQuoteById(id);
        existingQuote.setPhrase(updatedQuote.getPhrase());
        existingQuote.setAuthor(updatedQuote.getAuthor());
        return quoteRepository.save(existingQuote);
    }

    public Quote updateQuotePartial(Long id, QuoteDto updateDto) {
        Quote existingQuote = getQuoteById(id);

        if (updateDto.getPhrase() != null) {
            existingQuote.setPhrase(updateDto.getPhrase());
        }
        if (updateDto.getAuthor() != null) {
            existingQuote.setAuthor(updateDto.getAuthor());
        }

        return quoteRepository.save(existingQuote);
    }

    public void deleteQuoteById(Long id) {
        quoteRepository.deleteById(id);
    }
}
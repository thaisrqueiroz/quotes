package com.example.quotes.repositories;

import com.example.quotes.models.Quote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuoteRepository extends JpaRepository<Quote, Long> {

    List<Quote> findAll();
    Quote save(Quote quote);

}

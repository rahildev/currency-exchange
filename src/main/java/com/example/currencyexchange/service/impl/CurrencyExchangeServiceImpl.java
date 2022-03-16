package com.example.currencyexchange.service.impl;

import com.example.currencyexchange.domain.CurrencyExchange;
import com.example.currencyexchange.repository.CurrencyExchangeRepo;
import com.example.currencyexchange.service.CurrencyExchangeService;
import org.springframework.stereotype.Service;

@Service
public class CurrencyExchangeServiceImpl implements CurrencyExchangeService {
    private final CurrencyExchangeRepo repository;

    public CurrencyExchangeServiceImpl(CurrencyExchangeRepo repository) {
        this.repository = repository;
    }


    @Override
    public CurrencyExchange change(String from, String to) {
        return repository.findByFromAndTo(from , to);
    }

    @Override
    public CurrencyExchange exchangeCreate(CurrencyExchange currencyExchange) {
        return repository.save(currencyExchange);
    }
}

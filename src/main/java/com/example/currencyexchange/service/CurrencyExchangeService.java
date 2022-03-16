package com.example.currencyexchange.service;

import com.example.currencyexchange.domain.CurrencyExchange;

public interface CurrencyExchangeService {


    CurrencyExchange change(String from,String to);
    CurrencyExchange exchangeCreate(CurrencyExchange currencyExchange);
}

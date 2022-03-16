package com.example.currencyexchange.controller;

import com.example.currencyexchange.domain.CurrencyExchange;
import com.example.currencyexchange.service.CurrencyExchangeService;
import org.springframework.web.bind.annotation.*;

@RestController
public class CurrencyExchangeController {

    private final CurrencyExchangeService service;

    public CurrencyExchangeController(CurrencyExchangeService service) {
        this.service = service;
    }

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange retireveExchange(@PathVariable String from,
                                             @PathVariable String to) {
        return service.change(from, to);
    }

    @GetMapping("/")
    public String someMethod(@RequestParam String name, @RequestParam String surname) {
        return new String("Got" + name + surname);
    }

    @PostMapping("/currency-exchange")
    public CurrencyExchange creatExchange(@RequestBody CurrencyExchange currencyExchange){
        return service.exchangeCreate(currencyExchange);
    }

}

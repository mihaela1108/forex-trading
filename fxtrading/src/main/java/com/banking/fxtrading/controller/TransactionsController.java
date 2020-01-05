package com.banking.fxtrading.controller;

import com.banking.fxtrading.entity.TransactionsEntity;
import com.banking.fxtrading.repository.TransactionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

@RestController
public class TransactionsController {

    @Autowired
    TransactionsRepository transactionsRepository;

    @RequestMapping("/transactions")
    public void populateDB() {
        TransactionsEntity transactionsEntity= new TransactionsEntity();
        transactionsEntity.setUsername("mihaela");
        transactionsEntity.setPrimaryCurrency("EUR");
        transactionsEntity.setSecondaryCurrency("USD");
        transactionsEntity.setAction("BUY");
        transactionsEntity.setTransaction(1000);
        transactionsEntity.setDate(new Timestamp(System.currentTimeMillis()));
        transactionsRepository.save(transactionsEntity);
    }
}

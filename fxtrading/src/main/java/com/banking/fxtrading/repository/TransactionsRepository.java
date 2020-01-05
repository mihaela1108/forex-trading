package com.banking.fxtrading.repository;

import com.banking.fxtrading.entity.TransactionsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionsRepository extends CrudRepository<TransactionsEntity, Integer> {


}

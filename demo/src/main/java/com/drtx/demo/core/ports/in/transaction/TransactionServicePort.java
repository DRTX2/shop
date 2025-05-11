package com.drtx.demo.core.ports.in.transaction;

import com.drtx.demo.core.model.transaction.PaymentMethodType;
import com.drtx.demo.core.model.transaction.Transaction;

import java.time.LocalDateTime;
import java.util.List;

public interface TransactionServicePort {
    Transaction createTransaction(Transaction transaction);
    Transaction findTransactionById(Long id);
    List<Transaction> findAllByUser(Long userId);
    List<Transaction> findTransactionsBetweenDates(Long userId, LocalDateTime from, LocalDateTime to);
    void cancelTransaction(Long transactionId);
}

package com.drtx.demo.core.ports.out.transaction;

import com.drtx.demo.core.model.transaction.Transaction;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface TransactionRepositoryPort {
    Transaction save(Transaction transaction);
    Optional<Transaction> findById(Long id);
    List<Transaction> findAllByUserId(Long userId);
    List<Transaction> findByUserIdBetweenDates(Long userId, LocalDateTime from, LocalDateTime to);
    void deleteById(Long id);
    void updateStateToCanceled(Long transactionId);
}

package com.drtx.demo.core.model.transaction;

import com.drtx.demo.core.model.catalog.Publication;
import com.drtx.demo.core.model.user.User;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {
    private Long id;
    private LocalDateTime date;
    private BigDecimal amount;
    private Currency originalCurrency;
    private BigDecimal exchangeRate;
    private TransactionState state;

    private User buyer;
    private Publication publication;
    private PaymentMethod paymentMethod;
}

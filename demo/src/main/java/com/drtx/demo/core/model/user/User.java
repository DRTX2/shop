package com.drtx.demo.core.model.user;

import com.drtx.demo.core.model.transaction.Currency;
import com.drtx.demo.core.model.catalog.Publication;
import com.drtx.demo.core.model.rating.Rating;
import com.drtx.demo.core.model.transaction.Transaction;

import java.math.BigDecimal;
import java.util.List;

public class User { // has publications, transactions, ratings, address, messages
    private Long id;
    private String name;
    private String email;
    private String password;
    private Currency preferedCurrency;
    private BigDecimal balance;

    private List<Publication> publications;
    private List<Transaction> transactions;
    private List<Rating> ratings;
    private List<Address> addresses;
    private List<Message> messagesSent;
    private List<Message> messagesReceived;
}

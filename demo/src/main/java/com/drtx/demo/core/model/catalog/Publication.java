package com.drtx.demo.core.model.catalog;

import com.drtx.demo.core.model.rating.Rating;
import com.drtx.demo.core.model.transaction.Transaction;
import com.drtx.demo.core.model.user.User;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Publication { // has many ratings, images, transactions
    private Long id;
    private String title;
    private String description;
    private PublicationType type;
    private BigDecimal price;
    private boolean available;
    private LocalDateTime publicationDate;

    private User salesperson;
    private Category category;
    private List<Rating> ratings;
    private List<Image> images;
    private List<Transaction> transactions;
}

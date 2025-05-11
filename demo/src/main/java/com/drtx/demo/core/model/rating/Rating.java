package com.drtx.demo.core.model.rating;

import com.drtx.demo.core.model.catalog.Publication;
import com.drtx.demo.core.model.user.User;

import java.time.LocalDateTime;

public class Rating {
    private Long id;
    private String comment;
    private byte rate;
    private LocalDateTime time;

    private User author;
    private Publication publication;
    private User receiver;// destinatario

    public RatingLevel getLevel(){
        return RatingLevel.fromValue(rate);
    }
}

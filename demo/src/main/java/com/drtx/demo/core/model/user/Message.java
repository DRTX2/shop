package com.drtx.demo.core.model.user;

import java.time.LocalDateTime;

public class Message {
    private Long id;
    private String content;
    private LocalDateTime shipmentDate;

    private User from;
    private User to;
    private MessageStatus status;
}

package com.drtx.demo.core.ports.out.user;

import com.drtx.demo.core.model.user.Message;

import java.util.List;
import java.util.Optional;

public interface MessageRepositoryPort {
    Message save(Message message);
    Optional<Message> findById(Long id);
    List<Message> findByUserId(Long userId, int page, int size);
    Message update(Message message);
    void delete(Message message);
    void deleteAllByRecipientId(Long userId);
    void deleteAllBySenderId(Long userId);
}

package com.drtx.demo.core.ports.in.user;

import com.drtx.demo.core.model.user.Message;

import java.util.List;
import java.util.Optional;

public interface MessageServicePort {
    Message createMessage(Message message);
    List<Message> findMessagesByUserId(Long userId, int page, int size);//retornaria como con paginacion los mensajes para no buscar todos
    Message updateMessage(Message message);
    void deleteMessage(Message message);
    void deleteMessagesToUser(Long userId);
    void deleteUserMessages(Long userId);//eliminar todos los mensajes hechos
}

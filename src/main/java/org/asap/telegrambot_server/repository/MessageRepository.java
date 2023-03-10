package org.asap.telegrambot_server.repository;

import org.asap.telegrambot_server.model.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface MessageRepository extends JpaRepository<Message, UUID> {

    Optional<Message> findByUsername(String username);

    List<Message> getAllByChatIdIsNotNull();
}

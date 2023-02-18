package com.simple.app.authentication.service;

import com.simple.app.authentication.model.Message;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

  public Message getPublicMessage() {
    final var text = "This is a public message.";

    return Message.from(text);
  }

  public Message getProtectedMessage() {
    final var text = "This is a protected message.";

    return Message.from(text);
  }

  public Message getAdminMessage() {
    final var text = "This is an admin message.";

    return Message.from(text);
  }
}

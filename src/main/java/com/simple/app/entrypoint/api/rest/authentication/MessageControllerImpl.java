package com.simple.app.entrypoint.api.rest.authentication;

import com.simple.app.authentication.model.Message;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.simple.app.authentication.service.MessageService;


@RestController
@CrossOrigin(origins = "http://localhost:4040")
public class MessageControllerImpl implements MessageController{

  private final MessageService messageService;

  public MessageControllerImpl(MessageService messageService) {
    this.messageService = messageService;
  }

  public Message getPublic() {
    return messageService.getPublicMessage();
  }

  public Message getProtected() {
    return messageService.getProtectedMessage();
  }

  public Message getAdmin() {
    return messageService.getAdminMessage();
  }
}

package com.simple.app.entrypoint.api.rest.authentication;

import com.simple.app.authentication.model.Message;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/messages")
public interface MessageController {

    @GetMapping("/public")
    public Message getPublic();

    @GetMapping("/protected")
    public Message getProtected();

    @GetMapping("/admin")
    @PreAuthorize("hasAuthority('read:admin-messages')")
    public Message getAdmin();
}

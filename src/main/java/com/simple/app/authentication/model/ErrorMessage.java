package com.simple.app.authentication.model;

import lombok.Value;

@Value
public class ErrorMessage {

  private String message;

  public static ErrorMessage from(final String message) {
    return new ErrorMessage(message);
  }
}

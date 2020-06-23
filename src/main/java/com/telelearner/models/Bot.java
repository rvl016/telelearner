package com.telelearner.models;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Bot {
  
  private final UUID user_id;
  private final boolean is_bot;

  public Bot( @JsonProperty( "user_id") UUID user_id, 
    @JsonProperty( "is_bot") boolean is_bot) {
    this.user_id = user_id;
    this.is_bot = is_bot;
  }

  public UUID getUser_id() {
    return user_id;
  }

  public boolean getIs_bot() {
    return is_bot;
  }
}
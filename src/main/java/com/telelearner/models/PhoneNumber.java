package com.telelearner.models;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PhoneNumber {
  
  private final UUID id; 
  private final int number;
  private final String role;

  public PhoneNumber( @JsonProperty( "id") UUID id, 
    @JsonProperty( "number") int number, 
    @JsonProperty( "role") String role) {
    this.id = id;
    this.number = number;
    this.role = role;
  }

  public UUID getId() {
    return id;
  }

  public int getNumber() {
    return number;
  }

  public String getRole() {
    return role;
  }
}
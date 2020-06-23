package com.telelearner.models;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Skill {
  
  private final UUID id;
  private final String name;
  private final float scarcity;
  
  public Skill( @JsonProperty( "id") UUID id, @JsonProperty( "name") String name, 
    @JsonProperty( "scarcity") float scarcity) {
    this.id = id;
    this.name = name;
    this.scarcity = scarcity;
  }

  public UUID getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public float getScarcity() {
    return scarcity;
  }
}
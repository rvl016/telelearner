package com.telelearner.models;

import java.math.BigDecimal;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

  private final UUID id;
  private final UUID job_id;
  private final UUID house_id;
  private final BigDecimal remuneration;
  private final int hungry;
  private final int energy;

  public User( @JsonProperty( "id") UUID id, 
    @JsonProperty( "job_id") UUID job_id, 
    @JsonProperty( "house") UUID house_id, 
    @JsonProperty( "remuneration") BigDecimal remuneration,
    @JsonProperty( "hungry") int hungry, @JsonProperty( "energy") int energy) {
    this.id = id;
    this.job_id = job_id;
    this.house_id = house_id;
    this.remuneration = remuneration;
    this.hungry = hungry;
    this.energy = energy;
  }
  
}
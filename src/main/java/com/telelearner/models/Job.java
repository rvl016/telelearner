package com.telelearner.models;

import java.math.BigDecimal;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Job {

  private final UUID id;
  private final String name;
  private final BigDecimal base_remuneration;
  private final float demand;

  public Job( @JsonProperty( "id") UUID id, @JsonProperty( "name") String name, 
    @JsonProperty( "base_remuneration") BigDecimal base_remuneration, 
    @JsonProperty( "demand") float demand) {
    this.id = id;
    this.name = name;
    this.base_remuneration = base_remuneration;
    this.demand = demand;
  }

  public UUID getId() {
    return id;
  }
  
  public String getName() {
    return name;
  }

  public BigDecimal getBaseRemuneration() {
    return base_remuneration;
  }

  public float getDemand() {
    return demand;   
  }

}
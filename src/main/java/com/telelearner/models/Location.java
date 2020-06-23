package com.telelearner.models;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Location {
  
  private final float MAX_DISTANCE_TO_BE_NEXT = 10.f;

  private final UUID user_id;
  private final float latitude;
  private final float longitude;

  public Location( @JsonProperty( "user_id") UUID user_id, 
    @JsonProperty( "latitude") float latitude, 
    @JsonProperty( "longitude") float longitude) {
    this.user_id = user_id;
    this.latitude = latitude;
    this.longitude = longitude;  
  }

  public UUID getUserId() {
    return user_id;
  }

  public float getLatitude() {
    return latitude;
  }

  public float getLongitude() {
    return longitude;
  }

  public boolean isThisNextToThat( Location that) {
    return Math.sqrt( Math.pow( this.latitude - that.latitude, 2) +
      Math.pow( this.longitude - that.longitude, 2)) < MAX_DISTANCE_TO_BE_NEXT; 
  }
}
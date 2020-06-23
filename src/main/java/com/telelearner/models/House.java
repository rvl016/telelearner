package com.telelearner.models;

import java.util.UUID;
import java.util.HashMap;

import com.fasterxml.jackson.annotation.JsonProperty;

public class House {

  private final UUID id;
  private final UUID user_id;
  private final float latitude;
  private final float longitude;

  public House( UUID id, UUID user_id, int region) {
    HashMap<String,Float> coordinates = getCoordinatesFromRegion( region);
    this.id = id;
    this.user_id = user_id;
    this.latitude = coordinates.get( "latitude");
    this.longitude = coordinates.get( "longitude");
  }
  
  private HashMap<String,Float> getCoordinatesFromRegion( int region) {
    return new HashMap<>();
  }
}
package com.telelearner.models;

import java.math.BigDecimal;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BankAccount {
  
  private final UUID id;
  private final UUID user_id;
  private final BigDecimal money;

  public BankAccount( @JsonProperty( "id") UUID id, 
    @JsonProperty( "user_id") UUID user_id, 
    @JsonProperty( "money") BigDecimal money) {
    this.id = id;
    this.user_id = user_id;
    this.money = money;
  }

  public BigDecimal getMoney() {
    return money;
  }

  public UUID getUserId() {
    return user_id;
  }
  
  public UUID getId() {
    return id;
  }

  public boolean canWithdrawQuantity( BigDecimal quantity) {
    return this.money.compareTo( quantity) != -1;
  }

  public void makeTransferenceTransactionOfTo( BigDecimal quantity, 
    BankAccount recipient) {
    this.money.subtract( quantity);
    recipient.money.add( quantity);
  }
    
}
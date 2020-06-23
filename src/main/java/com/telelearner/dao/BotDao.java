package com.telelearner.dao;

import java.util.UUID;

import com.telelearner.models.Bot;

public interface BotDao {

  int insertBot( UUID user_id, Bot bot);

  default int addBot( Bot bot) {
    UUID user_id = UUID.randomUUID();
    return insertBot( user_id, bot);
  }
}
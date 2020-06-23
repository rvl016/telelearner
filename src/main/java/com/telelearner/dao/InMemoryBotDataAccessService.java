package com.telelearner.dao;

import java.util.List;
import java.util.UUID;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.telelearner.models.Bot;


@Repository( "inMemoryDao")
public class InMemoryBotDataAccessService implements BotDao {
  
  private static List<Bot> DB = new ArrayList<Bot>();

  @Override
  public int insertBot( UUID user_id, Bot bot) {
    DB.add( new Bot( user_id, bot.getIs_bot()));
    return 1;
  }
}
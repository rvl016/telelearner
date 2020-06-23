package com.telelearner.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.telelearner.models.Bot;
import com.telelearner.dao.BotDao;

@Service
public class BotService {

  private final BotDao botDao;

  @Autowired 
  public BotService( @Qualifier( "inMemoryDao") BotDao botDao) {
    this.botDao = botDao;
  }

  public int addBot( Bot bot) {
    return botDao.addBot( bot);
  }
  
}
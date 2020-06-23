package com.telelearner.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telelearner.models.Bot;
import com.telelearner.service.BotService;

@RequestMapping( "api/v1/bot")
@RestController
public class BotController {
  
  private final BotService botService;

  @Autowired
  public BotController( BotService botService) {
    this.botService = botService;
  }

  @PostMapping
  public void addBot( @RequestBody Bot bot) {
    botService.addBot( bot);
  }
}
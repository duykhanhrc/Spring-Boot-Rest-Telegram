package com.staxrt.tutorial.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import com.staxrt.tutorial.model.TelegramMsg;

import java.util.HashMap;
import java.util.Map;

/**
 * The type Telegram controller.
 *
 * @author Khanh Pham
 */
@RestController
@RequestMapping("/api/v1")
public class TelegramController {

  /**
   * Send message to Telegram.
   *
   * @return json
   */
  @PostMapping("/telegramBotSendtext")
  public Map<String, String> sendTelegramMessage(@RequestBody TelegramMsg telegramMsg) {
    
    System.out.println(telegramMsg.getBotMessage());
    String botToken = "bottoken"; // give your bot token here
    String botChatID = telegramMsg.getChatID();
    String botMessage = telegramMsg.getBotMessage();
    String sendText = "https://api.telegram.org/bot" + botToken + "/sendMessage?chat_id=" + botChatID + "&parse_mode=Markdown&text=" + botMessage;

    RestTemplate restTemplate = new RestTemplate();
    String result = restTemplate.getForObject(sendText, String.class);
    System.out.println(result);

    Map<String, String> response = new HashMap<>();
    response.put("sent", "ok");
    // response.put("details", result);
    return response;

  }
}

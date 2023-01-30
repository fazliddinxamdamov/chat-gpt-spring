package com.example.chatgpt.controller;

import com.example.chatgpt.payload.req.BotRequest;
import com.example.chatgpt.payload.resp.ChatGPTResponse;
import com.example.chatgpt.service.BotService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Fazliddin
 * @date 30.01.2023
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/bot")
public class ChatController {

    public final BotService botService;

    @PostMapping("/send")
    public ChatGPTResponse sendMessage(@RequestBody BotRequest request){
        return botService.askQuestion(request);
    }
}

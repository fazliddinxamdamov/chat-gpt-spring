package com.example.chatgpt.service;

import com.example.chatgpt.payload.req.BotRequest;
import com.example.chatgpt.payload.resp.ChatGPTResponse;

/**
 * @author Fazliddin
 * @date 30.01.2023
 */

public interface BotService {
    public ChatGPTResponse askQuestion(BotRequest botRequest);

}

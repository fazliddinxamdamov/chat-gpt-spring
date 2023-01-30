package com.example.chatgpt.service.impl;

import com.example.chatgpt.config.ChatGPTConfig;
import com.example.chatgpt.payload.req.BotRequest;
import com.example.chatgpt.payload.req.ChatGPTRequest;
import com.example.chatgpt.payload.resp.ChatGPTResponse;
import com.example.chatgpt.service.BotService;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Fazliddin
 * @date 30.01.2023
 */
@Service
public class BotServiceImpl implements BotService {
    private static final RestTemplate restTemplate = new RestTemplate();

    public HttpEntity<ChatGPTRequest> buildHttpEntity(ChatGPTRequest chatGPTRequest) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.parseMediaType(ChatGPTConfig.MODEL_TYPE));
        httpHeaders.add(ChatGPTConfig.AUTHORIZATION, ChatGPTConfig.BEARER + ChatGPTConfig.API_KEY);
        return new HttpEntity<>(chatGPTRequest, httpHeaders);
    }

    public ChatGPTResponse getResponse(HttpEntity<ChatGPTRequest> chatGPTRequestHttpEntity) {
        ResponseEntity<ChatGPTResponse> response = restTemplate.postForEntity(
                ChatGPTConfig.URL,
                chatGPTRequestHttpEntity,
                ChatGPTResponse.class
        );
        return response.getBody();
    }
    @Override
    public ChatGPTResponse askQuestion(BotRequest botRequest) {
        return this.getResponse(
                this.buildHttpEntity(
                        new ChatGPTRequest(
                                ChatGPTConfig.MODEL,
                                botRequest.getMessage(),
                                ChatGPTConfig.MAX_TOKEN,
                                ChatGPTConfig.TEMPERATURE,
                                ChatGPTConfig.TOP_P
                        )
                )
        );
    }

}

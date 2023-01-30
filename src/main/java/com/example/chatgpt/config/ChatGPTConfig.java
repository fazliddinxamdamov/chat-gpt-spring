package com.example.chatgpt.config;

/**
 * @author Fazliddin
 * @date 30.01.2023
 */
public interface ChatGPTConfig {
    String AUTHORIZATION = "Authorization";
    String BEARER = "Bearer";
    String API_KEY = "";
    String MODEL = "text-davinchi-003";
    Integer MAX_TOKEN = 300;
    Double TEMPERATURE = 0.0;
    Double TOP_P = 1.0;
    String MODEL_TYPE = "application/json; charset=UTF-8";
    String URL = "https://api.openai.com/v1/completion";
}

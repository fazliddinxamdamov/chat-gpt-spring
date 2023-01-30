package com.example.chatgpt.payload.resp;

import com.example.chatgpt.payload.Choice;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Fazliddin
 * @date 30.01.2023
 */
@Data
public class ChatGPTResponse {
    private String id;
    private String object;
    private LocalDate created;
    private String model;
    private List<Choice> choices;
}

package com.example.chatgpt.payload.req;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Fazliddin
 * @date 30.01.2023
 */
@Data
public class BotRequest implements Serializable {
    private String message;
}

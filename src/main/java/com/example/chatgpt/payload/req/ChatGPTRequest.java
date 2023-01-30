package com.example.chatgpt.payload.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Fazliddin
 * @date 30.01.2023
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatGPTRequest implements Serializable {
    private String model;
    private String prompt;
    @JsonProperty("max_tokens")
    private Integer maxTokens;
    private Double temperature;
    @JsonProperty("top_p")
    private Double topP;
}

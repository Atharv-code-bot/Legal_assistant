package com.Legal_assistant.assistant.Services;

import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OpenAIService {

    private final String apiKey = "YOUR_OPENAI_API_KEY";
    private final String apiUrl = "https://api.openai.com/v1/completions";
    private final RestTemplate restTemplate = new RestTemplate();

    public String generateResponse(String prompt) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + apiKey);
        headers.set("Content-Type", "application/json");

        String requestBody = "{ \"model\": \"text-davinci-003\", \"prompt\": \"" + prompt + "\", \"max_tokens\": 100 }";
        HttpEntity<String> entity = new HttpEntity<>(requestBody, headers);

        ResponseEntity<String> response = restTemplate.exchange(apiUrl, HttpMethod.POST, entity, String.class);

        return response.getBody();
    }
}

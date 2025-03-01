package com.Legal_assistant.assistant.Controller;

import com.Legal_assistant.assistant.Model.UserPrompt;
import com.Legal_assistant.assistant.Services.OpenAIService;
import com.Legal_assistant.assistant.Services.seviceforAimodel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
@RestController
@RequestMapping("/api/assistant")
public class AssistantController {
    @Autowired
    public  seviceforAimodel seviceforAimodel;
    @Autowired
     public OpenAIService openAIService;

    @PostMapping("/ask")
    public String  getResponse(@RequestBody UserPrompt request) {

         return openAIService.generateResponse(request.getPrompt());

        // Here, you would integrate with an AI model, database, or predefined logic
    }



}

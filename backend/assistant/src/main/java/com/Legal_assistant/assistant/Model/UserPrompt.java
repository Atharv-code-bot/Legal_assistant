package com.Legal_assistant.assistant.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="UserPrompt" )
public class UserPrompt {
    @Id
    private int ID;
    private String prompt;


}

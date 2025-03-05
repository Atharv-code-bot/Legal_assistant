package com.Legal_assistant.assistant.Model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "Name")
    @NotNull(message = "not null")
    private String name;
    @NotNull(message = "Mobile number cannot be null")
    @Pattern(regexp = "^[0-9]{10}$", message = "Mobile number must be 10 digits")
    private String mobileNumber;
    @NotNull(message = "Address cannot be null")
    @Size(min = 5, max = 255, message = "Address must be between 5 and 255 characters")
    private String address;
    private String village;
    @NotNull(message = "Quantity of plants purchased cannot be null")
    private int quantityOfPlantsPurchased;

}


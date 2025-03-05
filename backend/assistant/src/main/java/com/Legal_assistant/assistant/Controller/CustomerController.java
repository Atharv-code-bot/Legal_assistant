package com.Legal_assistant.assistant.Controller;

import com.Legal_assistant.assistant.Model.Customer;
import com.Legal_assistant.assistant.Services.CustomerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    // Save customer
    @PostMapping("/save")
    public Customer saveCustomer(@Valid @RequestBody Customer customer, BindingResult bindingResult) {
        // If there are validation errors, return a bad request response
        if (bindingResult.hasErrors()) {
            // You can return error messages to the client based on validation failures
            StringBuilder errorMessage = new StringBuilder();
            bindingResult.getAllErrors().forEach(error -> errorMessage.append(error.getDefaultMessage()).append("\n"));
            throw new IllegalArgumentException(errorMessage.toString());
        }
        return customerService.saveCustomer(customer);
    }

    // Get all customers
    @GetMapping("/")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    // Get customer by ID
    @GetMapping("/{id}")
    public Optional<Customer> getCustomerById(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }
}


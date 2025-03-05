package com.Legal_assistant.assistant.Repo;


import com.Legal_assistant.assistant.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // Custom query methods if needed can go here
}

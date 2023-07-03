package org.example.approval.modelvalidation;

import org.approvaltests.Approvals;
import org.example.approval.model.Customer;
import org.example.approval.service.CustomerService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CustomerServiceTest {

    private final CustomerService customerService = new CustomerService();

    @Test
    public void traditionTesting() {
        Customer customer = customerService.createCustomer();

        assertEquals(1L, customer.getId());
        assertEquals(30, customer.getAge());
        assertEquals("vinod", customer.getFirstName());
        assertEquals("madubashana", customer.getLastName());
        assertEquals("test@gmail.com", customer.getEmail());
        assertEquals("Sri Lanka", customer.getCountry());
        assertEquals("address", customer.getAddress());
        assertEquals("vinod", customer.getUserName());
        assertTrue(customer.isActive());
    }

    @Test
    public void approvalTestingUsingTextRepresentation() {
        Customer customer = customerService.createCustomer();

        Approvals.verify(customer);
    }

}

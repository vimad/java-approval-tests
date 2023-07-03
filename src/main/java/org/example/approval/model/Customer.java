package org.example.approval.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class Customer {
    private Long id;
    private int age;
    private String firstName;
    private String lastName;
    private String country;
    private String email;
    private String userName;
    private String address;
    private boolean isActive;
}

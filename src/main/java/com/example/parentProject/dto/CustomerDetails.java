package com.example.parentProject.dto;

import org.springframework.stereotype.Component;

@Component
public class CustomerDetails {
    private String customerName;
    private String location;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "CustomerDetails{" +
                "customerName='" + customerName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}

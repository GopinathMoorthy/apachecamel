package com.example.parentProject.dto;

import org.springframework.stereotype.Component;

@Component
public class CustomerDetails {
    private String responseCode;
    private String responseData;

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseData() {
        return responseData;
    }

    public void setResponseData(String responseData) {
        this.responseData = responseData;
    }

    @Override
    public String toString() {
        return "CustomerDetails{" +
                "responseCode='" + responseCode + '\'' +
                ", responseData='" + responseData + '\'' +
                '}';
    }
}

package com.example.parentProject;

import com.example.parentProject.dto.CustomerDetails;
import org.apache.camel.Exchange;
import org.apache.camel.ExchangeProperties;
import org.apache.camel.Processor;

import java.util.HashMap;
import java.util.Map;

public class PojoResponseProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        System.out.println("Inside PojoResponseProcessor");
        CustomerDetails customerDetails = exchange.getIn().getBody(CustomerDetails.class);
        Map<String,Object> headerMap = new HashMap<>();
        if(customerDetails.getResponseCode().equals("200")) {
            headerMap.put(Exchange.HTTP_RESPONSE_CODE, customerDetails.getResponseCode());
            exchange.getMessage().setHeaders(headerMap);
            exchange.getMessage().setBody(customerDetails.getResponseData());
        }else
        {
            if(customerDetails.getResponseCode().equals("503")){
                headerMap.put(Exchange.HTTP_RESPONSE_CODE, "500");
                exchange.getMessage().setHeaders(headerMap);
                exchange.getMessage().setBody("Internal error in the child");
            }

        }

    }
}

package com.example.parentProject;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.util.HashMap;
import java.util.Map;

public class FinalResponseProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        System.out.println("Inside FinalResponseProcessor");
        System.out.println(exchange.getIn().getBody(String.class));
        Map<String,String> responseMap= (Map<String, String>) exchange.getProperty("exchangeMap");
        System.out.println(responseMap.get("firstResponse"));

    }
}

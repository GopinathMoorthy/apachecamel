package com.example.parentProject;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.util.HashMap;
import java.util.Map;

public class ResponseProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        System.out.println("Inside ResponseProcessor");
        String firstResponse=exchange.getIn().getBody(String.class);
        System.out.println(firstResponse);

        Map<String,String> responseMap=new HashMap<>();
        responseMap.put("firstResponse",firstResponse);
        exchange.setProperty("exchangeMap",responseMap);

    }
}

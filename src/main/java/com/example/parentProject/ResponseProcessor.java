package com.example.parentProject;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class ResponseProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        System.out.println("Inside ResponseProcessor");
        System.out.println(exchange.getIn().getBody(String.class));
    }
}

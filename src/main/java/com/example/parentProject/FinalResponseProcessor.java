package com.example.parentProject;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class FinalResponseProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        System.out.println("Inside FinalResponseProcessor");
        System.out.println(exchange.getIn().getBody(String.class));
    }
}

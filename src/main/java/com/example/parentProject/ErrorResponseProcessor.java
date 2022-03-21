package com.example.parentProject;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class ErrorResponseProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        System.out.println("Inside ErrorResponseProcessor");
        //exchange.set.setBody("Hello " + body);
        // copy headers from IN to OUT to propagate them
        exchange.getMessage().setHeaders(exchange.getIn().getHeaders());
        String response=exchange.getIn().getBody(String.class);
        System.out.println(response);
        exchange.getMessage().setBody(response);
    }
}

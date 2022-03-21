package com.example.parentProject;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.util.Map;

public class PojoResponseProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        System.out.println("Inside PojoResponseProcessor");
        Object obj = exchange.getIn().getBody(String.class);
        exchange.getMessage().setBody(obj);
    }
}

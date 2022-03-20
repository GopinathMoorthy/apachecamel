package com.example.parentProject;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.util.HashMap;
import java.util.Map;

public class InitProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        System.out.println("Inside InitProcessor");
        String contentType = exchange.getIn().getHeader(Exchange.CONTENT_TYPE, String.class);
        System.out.println(contentType);
        String queryParam = exchange.getIn().getHeader("queryParameter1").toString();
        System.out.println(queryParam);

    }
}

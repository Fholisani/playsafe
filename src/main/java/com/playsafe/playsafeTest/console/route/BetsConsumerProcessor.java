package com.playsafe.playsafeTest.console.route;

import com.playsafe.playsafeTest.console.rules.PlaySafeMainProcessor;
import org.apache.camel.builder.RouteBuilder;

public class BetsConsumerProcessor extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        //Process the ame rules
        from("direct:output")
                .process(new PlaySafeMainProcessor())
                .log("===Processed===\n")
                .end();
    }
}

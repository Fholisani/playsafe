package com.playsafe.playsafeTest.console.route;

import com.playsafe.playsafeTest.console.model.BetsModel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.bindy.csv.BindyCsvDataFormat;
import org.apache.camel.spi.DataFormat;

public class ReadCsvFileRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        //Read from the file and erase it - Them keep checking for a new file every 30 seconds
        DataFormat bindyBets = new BindyCsvDataFormat(BetsModel.class);
        from("file:data/csv/input?fileName=bet.txt&delay=30000")
                .log("Received Message is ${body}")
                .unmarshal(bindyBets)
                .to("direct:output");

    }
}

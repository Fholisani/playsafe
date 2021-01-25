package com.playsafe.playsafeTest;

import com.playsafe.playsafeTest.console.route.ReadCsvFileRoute;
import com.playsafe.playsafeTest.console.model.BetsModel;
import org.apache.camel.Exchange;
import org.apache.camel.RoutesBuilder;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;
import java.util.List;

public class ReadCsvFileRouteTest  extends CamelTestSupport {

    @Override
    protected RoutesBuilder createRouteBuilder() throws Exception {
        return new ReadCsvFileRoute();
    }

    @Test
    public void CSVMarshalfileRouteTest() throws InterruptedException {
//        Exchange exchange = consumer.receive("direct:output");
//        Thread.sleep(5000);
//
//
//        List<BetsModel> betsCsvs = (List<BetsModel>) exchange.getIn().getBody();
//        assertEquals("Tiki_Monkey", betsCsvs.get(0).getPlayerName());
    }
}

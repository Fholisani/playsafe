package com.playsafe.playsafeTest.console;

import com.playsafe.playsafeTest.console.route.BetsConsumerProcessor;
import com.playsafe.playsafeTest.console.route.ReadCsvFileRoute;
import org.apache.camel.main.Main;
import org.apache.camel.spi.PropertiesComponent;


public class playSafeMain  {
    private playSafeMain() {
    }

    public static void main(String[] args) throws Exception {
        // use Camels Main class
        Main main = new Main();
        // add the routes (you can specify multiple classes)
        main.configure().addRoutesBuilder(ReadCsvFileRoute.class);
        main.configure().addRoutesBuilder(BetsConsumerProcessor.class);
        // now keep the application running until the JVM is terminated (ctrl + c or sigterm)
        main.run(args);
        PropertiesComponent pc = main.getCamelContext().getPropertiesComponent();
        pc.setLocation("classpath:com/playsafe/playsafeTest/console/log4j.properties");

    }
}

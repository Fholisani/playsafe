package com.playsafe.playsafeTest.conversions.controller;

import com.playsafe.playsafeTest.conversions.service.ConversionsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ktoc")
public class KtocController {

    private Logger logger = LoggerFactory.getLogger(KtocController.class);
    @Autowired
    private ConversionsService conversionsService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Float> ktoc
            (@RequestParam("celsius") float celsius) throws Exception{

        long startTime = System.nanoTime();
        long endTime =0;
        try {
            float results =  conversionsService.convertKtoC(celsius);
            endTime =  System.nanoTime();
            logger.info("ktoc Response took : " + (endTime - startTime) + " nanoseconds");
            return ResponseEntity.ok().body(results);
        }catch (Exception e){
            endTime =  System.nanoTime();
            logger.info("ktoc Response took : " + (endTime - startTime) + " nanoseconds");
            throw new Exception(e);
        }

    }
}

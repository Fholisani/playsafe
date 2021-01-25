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
@RequestMapping("/ctok")
public class CtokController {

    private Logger logger = LoggerFactory.getLogger(CtokController.class);
    @Autowired
    private ConversionsService conversionsService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Float> ctok
            (@RequestParam("kelvin") float kelvin) throws Exception{

        long startTime = System.nanoTime();
        long endTime =0;
        try {
            float results =  conversionsService.convertCtoK(kelvin);
            endTime =  System.nanoTime();
            logger.info("CtoK Response took : " + (endTime - startTime) + " nanoseconds");
            return ResponseEntity.ok().body(results);
        }catch (Exception e){
            endTime =  System.nanoTime();
            logger.info("CtoK Response took : " + (endTime - startTime) + " nanoseconds");
            throw new Exception(e);
        }

    }


}

package com.playsafe.playsafeTest.conversions.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ConversionsService implements IconversionsService {

    private static Logger logger = LoggerFactory.getLogger(ConversionsService.class);
    @Override
    public float convertKtoC(float kelvin) throws Exception {
        try{
            return (float) (kelvin - 273.15);
        }catch (Exception e){
            throw new Exception("failed to convert from Kelvin to celsius " + e);
        }
    }

    @Override
    public float convertCtoK(float celsius) throws Exception {
        try{
            return (float) (celsius + 273.15);
        }catch (Exception e){
            throw new Exception("failed to convert from celsius to Kelvin " + e);
        }
    }

    @Override
    public double convertMtoK(double miles) throws Exception {
        try {
            return 1.609 * miles;
        }catch (Exception e){
            throw new Exception("Failed to convert from miles to KM" +e );
        }
    }

    @Override
    public double convertKtoM(double km) throws Exception {
        try {
            return km /1.609;
        }catch (Exception e){
            throw new Exception("Failed to convert from KM to miles" +e );
        }
    }
}

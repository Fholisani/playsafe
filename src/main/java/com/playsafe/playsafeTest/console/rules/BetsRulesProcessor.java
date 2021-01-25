package com.playsafe.playsafeTest.console.rules;

import com.playsafe.playsafeTest.console.model.BetEnum;
import com.playsafe.playsafeTest.console.model.BetResultsModel;


import java.util.Random;

public class BetsRulesProcessor {

    public static int chooseRandomNumber(){
        Random random = new Random();
        int min = 0;
        int max = 37;
        return random.nextInt(max - min) + min;
    }

    public static  BetResultsModel betsRules(String bet, String gameNumber, Double amount){

        BetResultsModel betResultsModel = new BetResultsModel();
        if(bet != null && bet.equalsIgnoreCase(gameNumber)){
            //Return results *36 amount - Number for betting is the same as the game number
            betResultsModel.setOutCome(BetEnum.WIN.getBetType());
            betResultsModel.setWinnings(amount * 36);
            return betResultsModel;
        }
        if(bet != null && bet.equalsIgnoreCase(betType(gameNumber))){
            // Return results * 2 amount -EVEN or ODD
            betResultsModel.setOutCome(BetEnum.WIN.getBetType());
            betResultsModel.setWinnings(amount * 2);
            return betResultsModel;
        }
        //All of the above rules fails then return rules
        betResultsModel.setOutCome(BetEnum.LOSE.getBetType());
        betResultsModel.setWinnings(0.0);
        return betResultsModel;
    }

    public static String betType(String gameNumber){

        if(gameNumber != null && Integer.parseInt(gameNumber) % 2 == 0){
            return BetEnum.EVEN.getBetType();
        }
        if(gameNumber != null && Integer.parseInt(gameNumber) % 2 != 0){
            return BetEnum.ODD.getBetType();
        }
        return BetEnum.FAILED.getBetType();
    }


}

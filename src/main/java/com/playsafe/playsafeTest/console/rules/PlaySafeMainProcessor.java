package com.playsafe.playsafeTest.console.rules;

import com.playsafe.playsafeTest.console.model.BetResultsModel;
import com.playsafe.playsafeTest.console.model.BetsModel;
import org.apache.camel.Exchange;

import java.util.List;

public class PlaySafeMainProcessor  implements org.apache.camel.Processor{
    @Override
    public void process(Exchange exchange) throws Exception {
        List<BetsModel> betsCsvs = (List<BetsModel>) exchange.getIn().getBody();
        System.out.println("\n\n\n\n\n");

        System.out.println("========================= Start : Play Safe ==============================\n\n\n");
        System.out.println("                 Console input 1 \n" );

        //Print List of the player's name, what they want to bet and how much they want to bet
        betsCsvs.forEach(betsModel ->
                System.out.println(betsModel.getPlayerName() + "  " +
                        betsModel.getBet() + "  " +
                        betsModel.getAmount() +"\n"));

        //Output 1
        int randomNumber = BetsRulesProcessor.chooseRandomNumber();
        System.out.println("                Output 1 \n\n"
                + "Number: " + randomNumber +"\n"
                +"Player           Bet   Outcome   Winnings\n ---");
        betsCsvs.forEach(betsModel -> {
            BetResultsModel betResultsModel = BetsRulesProcessor.betsRules(betsModel.getBet(), String.valueOf(randomNumber), betsModel.getAmount());
            System.out.println(betsModel.getPlayerName() + "      "
                    +  betsModel.getBet() + "    "
                    +  betResultsModel.getOutCome() + "      "
                    +  betResultsModel.getWinnings() );


        });
        System.out.println("\n\n\n\n");
    }
}

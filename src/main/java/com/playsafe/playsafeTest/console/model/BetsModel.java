package com.playsafe.playsafeTest.console.model;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

import java.io.Serializable;
import java.util.Objects;

@CsvRecord(separator = ",", skipFirstLine = true, generateHeaderColumns = true)
public class BetsModel implements Serializable {

    @DataField(pos =  1)
    private String playerName;
    @DataField(pos =  2)
    private String bet;
    @DataField(pos =  3)
    private Double amount;

    public BetsModel() {
    }

    public BetsModel(String playerName, String bet, Double amount) {
        this.playerName = playerName;
        this.bet = bet;
        this.amount = amount;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getBet() {
        return bet;
    }

    public void setBet(String bet) {
        this.bet = bet;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "BetsModel{" +
                "playerName='" + playerName + '\'' +
                ", bet='" + bet + '\'' +
                ", amount=" + amount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BetsModel)) return false;
        BetsModel betsModel = (BetsModel) o;
        return getPlayerName().equals(betsModel.getPlayerName()) &&
                getBet().equals(betsModel.getBet()) &&
                getAmount().equals(betsModel.getAmount());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPlayerName(), getBet(), getAmount());
    }
}

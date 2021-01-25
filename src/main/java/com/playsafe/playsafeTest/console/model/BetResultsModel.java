package com.playsafe.playsafeTest.console.model;

import java.io.Serializable;
import java.util.Objects;

public class BetResultsModel implements Serializable {

    private String outCome;
    private Double winnings;

    public BetResultsModel() {
    }

    public BetResultsModel(String outCome, Double winnings) {
        this.outCome = outCome;
        this.winnings = winnings;
    }

    public String getOutCome() {
        return outCome;
    }

    public void setOutCome(String outCome) {
        this.outCome = outCome;
    }

    public Double getWinnings() {
        return winnings;
    }

    public void setWinnings(Double winnings) {
        this.winnings = winnings;
    }

    @Override
    public String toString() {
        return "BetResultsModel{" +
                "outCome='" + outCome + '\'' +
                ", winnings=" + winnings +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BetResultsModel)) return false;
        BetResultsModel that = (BetResultsModel) o;
        return Objects.equals(getOutCome(), that.getOutCome()) &&
                Objects.equals(getWinnings(), that.getWinnings());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOutCome(), getWinnings());
    }
}

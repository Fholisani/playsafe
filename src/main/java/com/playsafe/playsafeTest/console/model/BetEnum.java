package com.playsafe.playsafeTest.console.model;

public enum BetEnum {
    EVEN("EVEN"),
    ODD("ODD"),
    FAILED("FAILED"),
    WIN("WIN"),
    LOSE("LOSE");

    private final String betType;

    private BetEnum(String betType){
        this.betType = betType;
    }

    public String getBetType() {
        return betType;
    }
}

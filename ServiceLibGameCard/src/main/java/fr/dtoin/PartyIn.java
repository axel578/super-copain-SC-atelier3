package fr.dtoin;

import jakarta.persistence.*;

public class PartyIn {


    public PartyIn(Integer userIdA, Integer userIdB, String partyCode, Boolean started, Integer winnerId, Integer currentPlayerId, Integer cardPlayerA, Integer cardPlayerB) {
        this.userIdA = userIdA;
        this.userIdB = userIdB;
        this.partyCode = partyCode;
        this.started = started;
        this.winnerId = winnerId;
        this.currentPlayerId = currentPlayerId;
        this.cardPlayerA = cardPlayerA;
        this.cardPlayerB = cardPlayerB;
    }

    public PartyIn() {
    }

    public Integer getUserIdA() {
        return userIdA;
    }

    public void setUserIdA(Integer userIdA) {
        this.userIdA = userIdA;
    }

    public Integer getUserIdB() {
        return userIdB;
    }

    public void setUserIdB(Integer userIdB) {
        this.userIdB = userIdB;
    }

    public String getPartyCode() {
        return partyCode;
    }

    public void setPartyCode(String partyCode) {
        this.partyCode = partyCode;
    }


    private Integer userIdA;


    private Integer userIdB;

    private String partyCode;

    public Boolean getStarted() {
        return started;
    }

    public void setStarted(Boolean started) {
        this.started = started;
    }

    public Integer getWinnerId() {
        return winnerId;
    }

    public void setWinnerId(Integer winnerId) {
        this.winnerId = winnerId;
    }

    public Integer getCurrentPlayerId() {
        return currentPlayerId;
    }

    public void setCurrentPlayerId(Integer currentPlayerId) {
        this.currentPlayerId = currentPlayerId;
    }

    public Integer getCardPlayerA() {
        return cardPlayerA;
    }

    public void setCardPlayerA(Integer cardPlayerA) {
        this.cardPlayerA = cardPlayerA;
    }

    public Integer getCardPlayerB() {
        return cardPlayerB;
    }

    public void setCardPlayerB(Integer cardPlayerB) {
        this.cardPlayerB = cardPlayerB;
    }

    private Boolean started;


    private Integer winnerId;


    private Integer currentPlayerId;


    private Integer cardPlayerA;


    private Integer cardPlayerB;

    public Double getMise() {
        return mise;
    }

    public void setMise(Double mise) {
        this.mise = mise;
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    private Double mise;

    private String partyName;


}
package com.devCakeAB;

public class Card {
    private int rank;
    private String suit;

    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }

    public int getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }
}

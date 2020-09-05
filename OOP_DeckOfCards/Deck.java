package com.devCakeAB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    // All suits
    private String[] allSuits = {"Hearts", "Diamonds", "Spades", "Clubs"};
    // Cards
    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        // Loop through all suits
        for (String suit: allSuits) {
            // For every suit. Loop through all ranks
            for (int rank = 1; rank < 14; rank++) {
                // Create a card based on suit and rank
                Card card = new Card(rank, suit);
                // Add card to deck
                cards.add(card);
            }
        }
        // Shuffle cards
        shuffleCards();
        // Print all cards
        for(Card c: cards) {
            System.out.println(c);
        }
    }
    // draw a random card
    // TODO: Be able to use the drawn card
    public void drawRandomCard() {
        Random r = new Random();
        Card randomCard = cards.get(r.nextInt(cards.size()));
        cards.remove(randomCard);
        System.out.println("Random card: " + randomCard);
    }
    // draw top card
    // shuffle
    public void shuffleCards() {
        Collections.shuffle(cards);
    }

}

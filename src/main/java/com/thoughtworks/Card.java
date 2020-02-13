package com.thoughtworks;

public class Card {
    private Suit suit;
    private Num num;

    public Card() {
    }

    public Card(Suit suit, Num num) {
        this.suit = suit;
        this.num = num;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Num getNum() {
        return num;
    }

    public void setNum(Num num) {
        this.num = num;
    }
}

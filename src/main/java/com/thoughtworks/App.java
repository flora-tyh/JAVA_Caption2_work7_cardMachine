package com.thoughtworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        ArrayList<Card> cards = cardMachine();

        Scanner sc = new Scanner(System.in);
        int chooesCardNum = sc.nextInt();

        if (chooesCardNum > 52 || chooesCardNum < 0) {
          System.out.println("请选择0-52张牌");
        } else {
            drawCards(cards, chooesCardNum);
        }
    }

    public static ArrayList<Card> cardMachine() {
        ArrayList<Card> cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Num num : Num.values()) {
                cards.add(new Card(suit, num));
            }
        }
        return cards;
    }

    public static void drawCards (ArrayList<Card> cards, int chooesCardNum) {
        Collections.shuffle(cards);
        for (int i = 0; i < chooesCardNum; i++) {
            System.out.print(cards.get(i).getSuit().getValue() + cards.get(i).getNum().getValue() + " ");
        }
    }
}

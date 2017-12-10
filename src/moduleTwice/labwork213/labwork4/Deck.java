package moduleTwice.labwork213.labwork4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Deck {

    List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }


    public void sort() {
        Collections.sort(cards, new Card.CardCompararator() {
        });
    };

    public void printAll() {
        int number = 0;
        for (Card card : cards) {
//            if(number%13==0){
//                System.out.println();
//            }
            System.out.print(card + " ");
            number++;
        }
    }
}
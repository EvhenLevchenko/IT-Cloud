package moduleTwice.labwork213.labwork4;

import java.util.Comparator;

public class Card implements Comparable<Card> {

public  static class CardCompararator implements Comparator<Card> {
    @Override
    public int compare(Card o1,Card o2) {
        if (o1 != null && o2 != null) {
            int result = o1.suit.compareTo(o2.suit);
            if (result == 0) {
                return o1.rank.compareTo(o2.rank);
            } else {
                return result;
            }
        }
        return 0;
    }
}
    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return String.format("%s%s", rank, suit);
    }

    @Override
    public int compareTo(Card o) {
        if (o != null) {
            int result = this.suit.compareTo(o.suit);
            if (result == 0) {
                return this.rank.compareTo(o.rank);
            } else {
                return result;
            }
        }
        return 0;
    }
}

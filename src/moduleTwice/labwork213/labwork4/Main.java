package moduleTwice.labwork213.labwork4;

public class Main {
    public static void main(String[] args) {
       Deck deck=new Deck();
       deck.shuffle();
       deck.printAll();
        System.out.println();
       deck.sort();
       deck.printAll();
    }
}

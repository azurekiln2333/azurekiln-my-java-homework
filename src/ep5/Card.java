package ep5;

public class Card {
    private char suit;
    private String rank;

    public Card(char suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String toString() {
        return this.suit + this.rank;
    }

    public static void main(String[] args) {
        Card c = new Card('红', "10");
        System.out.println(c);
    }
}

public class Card {
    char suit;
    String rank;
    public Card( String rank, char suit ) {
        this.suit = suit;
        this.rank = rank;
    }

    public String toString() {
        return   suit+rank;
    }
    public static void main(String[] args){
        Card c=new Card("10",'红');
        System.out.println(c);
    }
}

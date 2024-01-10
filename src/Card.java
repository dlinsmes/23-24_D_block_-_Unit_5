public class Card {

    private String rank;
    private int value;
    private String suit;

    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
        if (value <= 10 && value >= 2)
            rank = "" + value;
        else if (value == 1)
            rank = "Ace";
        else if (value == 11)
            rank = "Jack";
        else if (value == 12)
            rank = "Queen";
        else
            rank = "King";
    }

    public String getRank() {
        return rank;
    }
    public String getSuit() {
        return suit;
    }
    public int getValue() {
        return value;
    }

    public String toString() {
        return rank + " of " + suit;
    }
}

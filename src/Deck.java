public class Deck {

    //objects and arrays can be instance
    //variables
    //-this is a composition - this class
    //is made up of objects of a different
    //class
    private Card [] cards;

    private int top;

    public Deck() {
        top = 0;
        //initialize values of all Card
        //objects in the array to be an
        //unshuffled deck
        //Ace of spades, 2 of spades, ...
        //Ace of hearts, ... etc

        //need to initialize array first
        cards = new Card[52];

        int index = 0;
        for (int i = 1; i <= 13; i++) {
            cards[index] = new Card("Spades", i);
            index++;
        }
        for (int i = 1; i <= 13; i++) {
            cards[index] = new Card("Clubs", i);
            index++;
        }
        for (int i = 1; i <= 13; i++) {
            cards[index] = new Card("Diamonds", i);
            index++;
        }
        for (int i = 1; i <= 13; i++) {
            cards[index] = new Card("Hearts", i);
            index++;
        }
    }

    //outputs every card in the deck as one single string
    public String toString() {
        String output = "";
        for (int i = 0; i < cards.length; i++) {
            output += cards[i].toString() + "\n";
        }
        return output;
    }

    public void shuffle() {
        //shuffle the card objects in the cards array
        for (int i = 0; i < cards.length; i++) {
            int rand = (int)(Math.random() * 52);

            //swap the card objects at position i and position rand
            Card temp = cards[i];
            cards[i] = cards[rand];
            cards[rand] = temp;
        }
    }

    public Card draw() {

        Card topCard = cards[top];
        top++;
        return topCard;
    }



}

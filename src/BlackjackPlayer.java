import java.util.ArrayList;

public class BlackjackPlayer {
    private String name;
    private ArrayList<Card> hand;

    public BlackjackPlayer(String name) {
        this.name = name;
        hand = new ArrayList<Card>();
    }

    public String getName() {
        return name;
    }

    public void addCard(Card c) {
        hand.add(c);
    }

    //calculate and return the player's score based on
    //the cards in their hand
    //-calculate the optimal score by figuring out the
    //best situation for any ace cards
    public int getScore() {
        //iterate through each card
        //get each card's value
        //add to score based on value
        //aces?

        for (int i = 0; i < hand.size(); i++) {
            Card current = hand.get(i);
            int val = current.getValue();
            //equivalent to:
            int value = hand.get(i).getValue();

        }

        return 0;
    }
}

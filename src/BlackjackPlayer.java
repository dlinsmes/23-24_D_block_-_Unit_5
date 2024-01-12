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

        int score = 0;
        int nAces = 0;

        for (int i = 0; i < hand.size(); i++) {
            Card current = hand.get(i);
            int val = current.getValue();
            //equivalent to:
            int value = hand.get(i).getValue();

            if (value >=2 && value <= 10)
                score += value;
            if (value >= 11)
                score += 10;
            if (value == 1)
                nAces++;
        }

        //at most, one ace counts for 11, the rest count for 1
        while (nAces > 1) {
            score++;
            nAces--;
        }

        //if there's one ace, figure out if it should be 11 or 1
        //based on the rest of the score
        if (nAces == 1) {
            if (score <= 10)
                score += 11;
            else
                score++;
        }

        return score;
    }

    public String toString() {
        return "Name: " + name + "\nScore: " + getScore() +
                "\nHand: " + hand;
    }
}

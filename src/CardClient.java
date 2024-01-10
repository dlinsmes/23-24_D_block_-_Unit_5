public class CardClient {
    public static void main(String [] args) {
        Card c1 = new Card("Hearts", 12);
        System.out.println(c1.getRank());

        System.out.println(c1);
        //you don't NEED to call toString()
        System.out.println(c1.toString());

        System.out.println();

        Deck d = new Deck();
        System.out.println(d);
        System.out.println();

        d.shuffle();
        System.out.println(d);
    }
}

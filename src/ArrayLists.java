import java.util.ArrayList;
public class ArrayLists {
    public static void main(String [] args) {
        //arrays - have a fixed length - can't dynamically remove or add items to an array

        //ArrayLists can only hold objects, not primitive

        //the list starts as empty when it's initialized
        ArrayList<String> words = new ArrayList<String> ();

        //general format:
        //ArrayList<ObjType> name = new ArrayList<ObjType> ();

        words.add("bamboo");
        words.add("oreo");
        words.add("help");

        //arraylists don't use square brackets
        //.get(index) will return the value at that index
        System.out.println(words.get(1));
        System.out.println();


        //size() instead of length
        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }

        System.out.println();

        for (String word: words)
            System.out.println(word);

        System.out.println();

        //can directly print arraylists
        System.out.println(words);

        //overloaded add() accepts an index and will insert the value at that position
        words.add(1, "cup");
        System.out.println(words);

        //set() will replace a value with a new one
        words.set(3, "dog");
        System.out.println(words);

        //remove() takes out the thing at the index provided
        words.remove(2);
        System.out.println(words);

        //remove() will also return the value that's taken out
        String removed = words.remove(2);
        System.out.println(words);
        System.out.println(removed);

        words.add("computer");
        words.add("plate");
        System.out.println(words);


        //use a loop to remove everything from the list

        //doesn't work bc indexing shifts as you add or remove from a list
        //so that the first value always has index 0 and the last is always size - 1
        //once the item at index 0 is removed, what WAS at index 1 now becomes index 0,
        //but i increments to 1. So the new index 0 item doesn't get removed
//        for (int i = 0; i < words.size(); i++) {
//            words.remove(i);
//        }

        //this works - as each item is removed from the back, the other item indices
        //don't get changed
//        for (int i = words.size()-1; i >= 0; i--) {
//            words.remove(i);
//        }

        //also works - but you need to save the initial size first
        int size = words.size();
        for (int i = 0; i < size; i++) {
            words.remove(0);
        }

        System.out.println(words);

        BlackjackPlayer p = new BlackjackPlayer("bill");
        Card c1 = new Card("Spades", 1);
        Card c2 = new Card("Hearts", 7);
        Card c3 = new Card("Spades", 11);
        p.addCard(c1);
        p.addCard(c2);
        p.addCard(c3);

        System.out.println(p.getScore());
    }
}

import java.util.Vector;
import java.util.Collections;
import java.util.Random;

public class DeckOfCards {

    public static void main(String []args) {
        Vector<String> suits = new Vector<>(4);
        suits.add("hearts"); suits.add("spades"); suits.add("clubs"); suits.add("diamonds");

        Vector<String> faceValue = new Vector<>(13);
        faceValue.add("Ace"); faceValue.add("2"); faceValue.add("3"); faceValue.add("4");
        faceValue.add("5"); faceValue.add("6"); faceValue.add("7"); faceValue.add("8");
        faceValue.add("9"); faceValue.add("10"); faceValue.add("Jack"); faceValue.add("Queen");
        faceValue.add("King");

        Vector<String> deck = new Vector<>(52);

        //Initialise deck.
        int i = 0, j = 0;
        while(i < 4){
            while(j < 13){
                deck.add(faceValue.elementAt(j) + " of " + suits.elementAt(i));
                j++;
            }
            j=0;
            i++;
        }

        shuffle(deck);

        int count = 0;
        while(count < 52) {
            dealOneCard(deck);
            count++;
        }

        dealOneCard(deck);

    }

    public static void shuffle(Vector<String> deck){
        Collections.shuffle(deck);
    }



    public static void dealOneCard(Vector<String> deck){
        Random r = new Random();
        int currentDeckSize = deck.size() - 1;
        if(currentDeckSize >= 0) {

            if(currentDeckSize>0) {
                int random = r.nextInt(currentDeckSize);
                System.out.println(deck.elementAt(random));
                deck.remove(random);
            }
            else{
                System.out.println(deck.elementAt(0));
                deck.remove(0);
            }

        }

        else{
            System.out.println("DECK IS EMPTY");
        }
    }

}

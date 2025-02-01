import java.util.Iterator;
import java.util.NoSuchElementException;

class CardIterator implements Iterator<String> {
    private static final String[] CARDS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    private int currentIndex = 0;

    
    public boolean hasNext() {
        return currentIndex < CARDS.length;
    }

    
    public String next() {
        if (!hasNext()) {
          //  throw new NoSuchElementException();
          System.out.println("no cards");
        }
        return CARDS[currentIndex++];
    }

    public static void main(String[] args) {
        CardIterator cardIterator = new CardIterator();
        while (cardIterator.hasNext()) {
            System.out.println(cardIterator.next());
        }
    }
}

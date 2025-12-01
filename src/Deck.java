import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {

    private List<Card> deck;
    private List<Card> discardPile =  new ArrayList<>();

    public Deck(){
        this.deck = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for (String suit : suits) {
            for (String rank : ranks) {
                this.deck.add(new Card(rank, suit));
            }
        }
    }

    public Integer getDeckSize() {
        return this.deck.size();
    }

    public void shuffleDeck() {
        Collections.shuffle(deck);
    }

    public Card dealCard() {
        Card c = deck.removeFirst();
        discardPile.add(c);
        return c;
    }

    public void refreshDeck() {
        deck.addAll(discardPile);
        Collections.shuffle(deck);
    }

    @Override
    public String toString() {
        StringBuilder toReturn = new StringBuilder();
        for(Card card : deck){
            toReturn.append(card.toString());
        }
        return toReturn.toString();
    }
}

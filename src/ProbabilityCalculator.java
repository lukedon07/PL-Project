import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProbabilityCalculator {

    private Integer deckSize;
    private List<Card> hand;

    public ProbabilityCalculator(Deck deck,Player player) {
        this.deckSize = deck.getDeckSize();
        this.hand = player.getHand();
    }



}

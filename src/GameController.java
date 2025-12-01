import java.util.ArrayList;
import java.util.List;

public class GameController {

    public static void main(String[] args){


        Deck deck = new Deck();
        Player Luke = new Player("Luke", 100);

        deck.shuffleDeck();
        //System.out.println(deck);

        List<Card> hand = new ArrayList<Card>();
        hand.add(deck.dealCard());
        hand.add(deck.dealCard());
        Luke.setHand(hand);
        List<Card> a = Luke.getHand();
        System.out.println(a);



        ProbabilityCalculator tester = new ProbabilityCalculator(deck,Luke);

    }

}

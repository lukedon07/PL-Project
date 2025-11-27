public class GameController {

    public static void main(String[] args){


        /*
        Deck deck = new Deck();
        System.out.println(deck.toString());
        deck.shuffleDeck();
        System.out.println(deck);
        */



        DiceProbability tester = new DiceProbability(3, 6, 3);

        /*
        boolean answer = tester.sideOfDice();
        System.out.println("Does one of these three rolls show at least a 1 or a 5 " + answer);
        */


        int isTrueTotal = 0;
        int totalRolls = 10000000;
        for(int i = 0; i < totalRolls; i++){
            if(tester.sideOfDice()){
                isTrueTotal += 1;
            }
        }

        double percent = ((double) isTrueTotal / totalRolls) * 100;
        System.out.println("Percent chance you will see at least a one or a five when rolling three dice is " + percent + "%");

    }

}

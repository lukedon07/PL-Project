import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DiceProbability {

    int numOfDice;
    int numOfRolls;
    int numOfSides;

    public DiceProbability(int numOfDice, int numOfSides, int numOfRolls) {
        this.numOfDice = numOfDice;
        this.numOfRolls = numOfRolls;
        this.numOfSides = numOfSides;
    }


    public boolean sideOfDice() {

        Random rand = new Random();

        for (int i = 0; i < numOfDice; i++) {// go through each dice roll
            int die = rand.nextInt(1,(numOfSides + 1));// randomly assigns the die value to a 1-6
            //System.out.println(die);//check we are within 1,6 both inclusive
            if((die == 1) || (die == 5)) {//if die is a 1 or 5
                return true;//return true
            }
        }

        return false;//no ones or five, return false
    }

    public int getPercentOfOnesAndOrFives() {
        //List<Integer> results = new ArrayList<>();
        int oneOrFive = 0;
        Random rand = new Random();
        int die;

        for (int i = 0; i < numOfRolls; i++) {
            die = rand.nextInt(1,(numOfSides + 1));
            if((die == 1) || (die == 5)) {
                //results.add(die);
                oneOrFive += 1;
            }
        }

        return (oneOrFive / numOfRolls);
    }




}

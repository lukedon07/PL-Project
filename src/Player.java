import java.util.ArrayList;
import java.util.List;

public class Player {

    private final String name;
    private Integer chipCount;
    private List<Card> hand;


    public Player(String name, Integer chipCount) {
        this.name = name;
        this.chipCount = chipCount;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

    public List<Card> getHand() {
        return hand;
    }

    public String getName() {
        return name;
    }

    public Integer getChipCount() {
        return chipCount;
    }

    public void increaseChipCount(Integer numToAdd) {
        this.chipCount += numToAdd;
    }

    public void decreaseChipCount(Integer numToDecrease) {
        this.chipCount -= numToDecrease;
    }
}

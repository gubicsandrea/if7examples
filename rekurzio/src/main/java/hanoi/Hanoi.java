package hanoi;

public class Hanoi {

    private String result = "";

    public void moveDisks(int numberOfDisk, char from, char to, char helper) {
        if (numberOfDisk == 1) {
            result += from + "->" + to;
        } else {
            moveDisks(numberOfDisk - 1, from, helper, to);
            result += from + "->" + to;
            moveDisks(numberOfDisk - 1, helper, to, from);
        }
    }

    public String getResultOfGame() {
        return result;
    }

}

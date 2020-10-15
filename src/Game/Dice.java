package Game;

public class Dice {

    private int MAX = 6; // max value of a die
    private int faceValue; // value of the die

    // constructor for retrieval of the value of a die
    public Dice(int value) {
        faceValue = value;
    }
    //Raffle Cup, probably
    public int rollDice() {
        faceValue = (int)(Math.random() * MAX) +1;
        return faceValue;
    }
    public void setMAX(int n)
    {
        MAX = n;
    }
    public int getMAX()
    {
        return MAX;
    }
    //setter
    public void setFaceValue (int value) {
        faceValue = value;
    }
    //getter
    public int getFaceValue() {
        return faceValue;
    }

}


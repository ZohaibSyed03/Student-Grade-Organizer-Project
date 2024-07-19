package driver;

import java.util.Arrays;

public class Student{
    private int ID;
    private int[] scores = new int[5];


    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int[] getScores() {

        return this.scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    public void print(){
        System.out.printf(ID + " " + Arrays.toString(scores));
    }
}
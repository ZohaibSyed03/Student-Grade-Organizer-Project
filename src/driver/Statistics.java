package driver;
import java.util.Arrays;

public class Statistics {
    private int[] lowScores = new int[5];
    private int[] highScores = new int[5];
    private double[] averageScores = new double[5];
    
    public void findLow(Student[] students){
        for(int i = 0; i < lowScores.length; i++){
            lowScores[i] = 1000;
            for(Student studentElement : students){
                if((studentElement.getScores())[i] < lowScores[i]){
                    lowScores[i] = studentElement.getScores()[i];
                }
            }

        }
    }

    public void findHigh(Student[] students){
        for(int i = 0; i < highScores.length; i++){
            highScores[i] = 0;
            for(Student studentElement : students){
                if(studentElement.getScores()[i] > highScores[i]){
                    highScores[i] = studentElement.getScores()[i];
                }
            }

        }
    }

    public void findAverage(Student[] students){
        for(int i = 0; i < averageScores.length; i++){
            averageScores[i] = 0;
            for(Student studentElement : students){
                averageScores[i] += studentElement.getScores()[i];
            }
            averageScores[i] /= students.length;
        }
    }

    public void print(int option){
        switch(option){
            case(1):
                System.out.printf("High: " + Arrays.toString(highScores) + '\n');
                break;
            case(2):
                System.out.printf("Low: " + Arrays.toString(lowScores) + '\n');
                break;
            case(3):
                System.out.printf("Avg: " + Arrays.toString(averageScores) + '\n');
                break;
            case(4):
                System.out.printf("High: " + Arrays.toString(highScores) + '\n');
                System.out.printf("Low: " + Arrays.toString(lowScores) + '\n');
                System.out.printf("Avg: " + Arrays.toString(averageScores) + '\n');
                break;
            default:
                System.out.printf("No valid option selected. Please run program agaain");
        }
    }
}
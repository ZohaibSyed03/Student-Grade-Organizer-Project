package driver;
import util.*;

public class Driver2{
	public static void main(String[] args) {
		int[] scores = {30, 40, 50, 56, 60};
		int id = 1235;
		StudentGrade grade = new StudentGrade();
		grade.setScores(scores);
		grade.setID(id);
		FileIO.serializesGrade(grade, "C:\\Users\\Zohai\\eclipse-workspace\\Assignment 6\\src\\driver\\studentGrade.ser");
	}
}
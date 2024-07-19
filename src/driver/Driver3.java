package driver;
import java.io.*;
import java.util.Scanner;
import adapter.StudentAPI;
import adapter.StudentAPIImp;

public class Driver3{
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner input = new Scanner(System.in);
		int numOfStudents;
		System.out.printf("How many students is there data for: ");
		numOfStudents = input.nextInt();
		StudentAPI APItest = new StudentAPIImp(numOfStudents);
		int studentID;
		System.out.printf("Enter desired student's ID: ");
		studentID = input.nextInt();
		APItest.printStatistics();
		System.out.printf("Scores of student ID ");
		APItest.printStudentScores(studentID);
	}
}
package adapter;
import driver.Student;
import util.FileIO;

import java.io.FileNotFoundException;
import java.io.IOException;

import driver.Statistics;

public class StudentAPIImp implements StudentAPI{
	private Student[] students;
	
	public StudentAPIImp(int numStudents) throws FileNotFoundException, IOException {
		students = new Student[numStudents];
		students = FileIO.ReadFromFile(students, "C:\\Users\\Zohai\\eclipse-workspace\\Assignment 6\\src\\adapter\\studentData.txt");
	}
	
	public void printStatistics() {
		Statistics stats = new Statistics();
		stats.findLow(students);
		stats.findHigh(students);
		stats.findAverage(students);
		stats.print(4);
	}
	
	public void printStudentScores(int ID) {
		for(Student student : students) {
			if(student.getID() == ID) {
				student.print();
				return;
			}
		}
	}
}

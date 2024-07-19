package util;
import java.io.*;
import driver.Student;
import java.util.StringTokenizer;

public class FileIO{

	public static void serializesGrade(StudentGrade grade, String filename){
		try {
			FileOutputStream fileO = new FileOutputStream(filename);
			ObjectOutputStream objectO = new ObjectOutputStream(fileO);
			objectO.writeObject(grade);
			objectO.close();
			System.out.println("Serialized data saved at: " + filename);
		}catch(IOException e){
			System.err.println(e.toString());
		}
	}

	
	static int studentCount;

	public static Student[] ReadFromFile(Student[] stu, String filename) {

		int i = 0;
	
		try {
		FileReader file = new FileReader(filename);
		BufferedReader buff = new BufferedReader(file);
		boolean eof = false;
		boolean firstLineSkipped = false;
		while (!eof){
			String line = buff.readLine();
			if (line == null) {
				eof = true;
			} else{
		
				if (!firstLineSkipped){
					firstLineSkipped = true;
					continue;
				}
				stu[i] = new Student();
				StringTokenizer st = new StringTokenizer(line);
				while (st.hasMoreTokens()) {	
					stu[i].setID(Integer.parseInt(st.nextToken()));
					int[] arr = new int[5];
					for (int j = 0; j < 5; j++){
						arr[j] = Integer.parseInt(st.nextToken());
					}
				stu[i].setScores(arr);
				}
			}
	
			i++;
		}
		buff.close();
		}catch (IOException e) {
			System.out.println("Error -- " + e.toString());
		}
		studentCount = i-1;
		return stu;

	}

}
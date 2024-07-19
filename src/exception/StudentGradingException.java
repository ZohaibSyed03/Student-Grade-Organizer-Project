package exception;
import java.io.*;

public class StudentGradingException extends Exception{
	public StudentGradingException(String message) {
		super(message);
	}
	
	public void logException(){
		try {
				FileWriter f = new FileWriter("LogExceptions.txt");
				BufferedWriter bw = new BufferedWriter(f);
				bw.write(getMessage());
				bw.close();
		}catch(IOException e) {
			System.err.println("Error: " + e.toString());
		}
	}
}
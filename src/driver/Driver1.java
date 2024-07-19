package driver;
import exception.StudentGradingException;

public class Driver1{
	public static void main(String[] args) {
		try {
			throw new StudentGradingException("test exception");
		}catch(StudentGradingException e){
			e.logException();
			System.err.println("Exception logged");
		}
	}
}
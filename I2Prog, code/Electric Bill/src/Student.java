
public class Student {

	public String name; // Student's name.
	public double test1, test2, test3; // Grades on three tests.
	
	public double getAverage() {  // Compute average test grade.
		return (test1 + test2 + test3) / 3;
	}
		public String toString() {
			 return name + ": test1 = " + test1 + ", test2 = " + test2 
			 + ", test3 = " + test3;
			 }

	
}

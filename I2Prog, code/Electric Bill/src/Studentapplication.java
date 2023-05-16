import BinaryMenu.TextIO;


public class Studentapplication {
	public static void main(String[] args) {
	      final int MAX_SIZE = 5;
	      Student[] register = new Student[MAX_SIZE];
	      int count = 0;
	      TextIO.put("Enter student name " +
	         "or press <Enter> to quit: ");
	      String name = TextIO.getln();
	      while (name.length() > 0 && count < MAX_SIZE) {
	         register[count] = new Student();
	         register[count].name = name;
	         count++;
	         TextIO.put("Enter next student name " +
	            "or press <Enter> to quit: ");
	         name = TextIO.getln();
	         
	      }
	      for (int student = 0; student < count; student++) {
	    	  TextIO.put("Enter the mark for test1 for " +
	    	  register[student].name + ": ");
	    	  register[student].test1 = TextIO.getDouble();
	    	  }

	      displayStudents(register,count);
	}
	      // code here to use the array
	 public static void displayStudents(Student[] moduleList, int count){
	    TextIO.putln("The class has these " + count +
	    " students and their marks are:");
	    for (int i=0; i < count; i++) {
	    TextIO.putln(moduleList[i]);
	    	  }
	    	 } 
	   
}

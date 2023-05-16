import BinaryMenu.TextIO;


public class averages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char temp;
		
		TextIO.putln("1:Find the average of two numbers");
		TextIO.putln("2:Find the average of three numbers");
		TextIO.putln("3:Find the average of four numbers");
		TextIO.putln("4:Quit");
		TextIO.putln(" ");
		TextIO.putln("enter your choice 1-4");
		temp = TextIO.getChar();
		
		if(temp == '1'){
			calculateaverage(double.class,double.class);
		}
		if(temp == '2'){
			calculateaverage(double.class,double.class,double.class);
		}
		if(temp == '3'){
		}	
		
	}

	
	public static double calculateaverage(Class<Double> class1,Class<Double> class2) {
		int inputno;
		int count = 0;
		int sum = 0;
		double average;
		
		for(count=1; count<=2;count++) {
			TextIO.putln("Please enter the "+ count +" number");
			inputno = TextIO.getInt();
			sum = sum + inputno;
		}
		
		average = sum/2;
		TextIO.putln("the average is " + average);
             
         return average;
	}
	
	public static double calculateaverage(Class<Double> class1, Class<Double> class2, Class<Double> class3) {
		int inputno;
		int count = 0;
		int sum = 0;
		double average;
		
		for(count=1; count<=3;count++) {
			TextIO.putln("Please enter the " + count + " number");
			inputno = TextIO.getInt();
			sum = sum + inputno;
		}
		
		average = sum/3;
		TextIO.putln("the average is " + average);
             
         return average;
	}
	public static double calulateaverage(double one3, double two3,double three2, double four) {
		int inputno;
		int count = 0;
		int sum = 0;
		double average;
		
		for(count=1; count<=4;count++) {
			TextIO.putln("Please enter the number");
			inputno = TextIO.getInt();
			sum = sum + inputno;
		}
		
		average = sum/4;
		TextIO.putln("the average is " + average);
             
         return average;
	}
}
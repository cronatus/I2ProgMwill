import BinaryMenu.TextIO;


public class reverse {
/*Write a program which reads six numbers into an array and prints them out in
	reverse order i.e. the number entered last should be printed first, and so on.*/ 
	public static void main(String[] args) {
		double[] numbers = new double[6];
		int selector = 1;
		
		TextIO.putln("please enter the first number.");
		numbers[0] = TextIO.getlnDouble();
		do{
			TextIO.putln("please enter the next number.");
			numbers[selector] = TextIO.getlnDouble();
			selector++;
		}while(selector != 6);
		
		for(selector = numbers.length-1; selector >= 0; selector--){
			TextIO.putln("the number entered in position " + selector + " is " + numbers[selector]);
		}
		
	}
}

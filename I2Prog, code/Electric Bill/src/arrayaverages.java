import BinaryMenu.TextIO;


public class arrayaverages {
/*Write a program which reads in ten numbers and stores these in an array. It should
then calculate the average and print out each number together with the difference
between the number and the average. */
	public static void main(String[] args) {
		double[] numbers = new double[10];
		int selector = 1;
		double average;
		double sum;
		
		TextIO.putln("please enter the first number.");
		numbers[selector] = TextIO.getlnDouble();
		do{
			TextIO.putln("please enter the next number.");
			numbers[selector] = TextIO.getlnDouble();
			selector++;
		}while(selector != 10);
		
		sum = numbers[0] + numbers [1] + numbers[2] + numbers[3] + numbers[4] + numbers[5] + numbers[6] + numbers[7] + numbers[8] + numbers[9];//sum of all values of the array
		average = sum/10; // average of the above sum
		
		TextIO.putln("The average of the numbers entered is " + average);
		
	}
}

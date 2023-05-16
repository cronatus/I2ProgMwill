import BinaryMenu.TextIO;


public class average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputno;
		int count = 0;
		int sum = 0;
		double average;
		
		
		for(count=1; count<=5;count++) {
			TextIO.putln("Please enter a number");
			inputno = TextIO.getInt();
			sum = sum + inputno;
		}
		
		average = sum/5;
		TextIO.putln("the average is " + average);
		
		 for(int i=1; i<11; i++){
             TextIO.put(i*5 + " , ");
        }
		
	}

}

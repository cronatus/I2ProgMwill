import BinaryMenu.TextIO;


public class countup {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int sum =0;
		Double Average;
		int looped=0;
		
		
		TextIO.putln("Please enter a number (Enter 0 to end)");
		int i = TextIO.getInt();
		
		while (i != 0) {
			sum=sum + i;
			TextIO.putln("total=" + sum + ", number=" + i + ", count=" + looped);
			TextIO.putln("Please enter another number (Enter 0 to End)");
			i = TextIO.getInt();
			looped++;
		}
		
		Average = (double)sum/(looped - 1);
		TextIO.putln("The Average is " + Average);
	}

	
}

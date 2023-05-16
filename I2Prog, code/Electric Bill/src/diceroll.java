import BinaryMenu.TextIO;


public class diceroll {

	public static void main(String[] args) {
		int roll1;
		int roll2;
		int total;
		char temp;
		
		roll1 = (int)(Math.random()*6) + 1;
		TextIO.putln("Your first roll came up " + roll1);
		
		roll2 = (int)(Math.random()*6) + 1;
		TextIO.putln("Your second roll came up " + roll2);
		
		total = roll1 + roll2;
		TextIO.putln("Your total score was " + total);
		
		TextIO.put("Would you like to try again? y/n : ");
		temp = TextIO.getChar();
		if (temp == 'y') {
			main(null);	
		}
	}    
}

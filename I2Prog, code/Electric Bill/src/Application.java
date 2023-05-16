import BinaryMenu.TextIO;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char temp;
	    
		TextIO.put("Are you converting from C or F:");
		temp = TextIO.getChar();
		
		if (temp == 'f') {
		   F();
		}
		if (temp == 'F') {
		   F();
		}
		if (temp == 'c') {
			C();
		}
		if (temp == 'C') {
			C();
		}
		else {
			TextIO.putln("Please enter C or F for which one you are converting");
			main(null);
		}
		
	}
		
	 public static float FtoC(float F){
		
		 return (F-32) * 5 / 9;
	}
	
	 public static float CtoF(float C) {
		 
		 return 32 + (9 * C / 5);
		 
	 }
	 
	  public static void F() {
		  
		float TempF;
		TextIO.put("Enter temperature in F:");
		TempF = TextIO.getlnFloat();
		TextIO.putln("Temperature in C is: " + FtoC(TempF));
		main(null);
	  }
	  
	   public static void C() {
		   
		 float TempC;
		 TextIO.put("Enter temperature in C:");
		 TempC = TextIO.getlnFloat();
		 TextIO.putln("Temperature in F is:" + CtoF(TempC));
		 main(null);
	   }
		
	}

package BinaryMenu;

public class Logic_Gates {

	public static void Logic(){
		int selection = 0;
		
		do{
			
		TextIO.putln("");
		TextIO.putln("Please choose A Gate to operate");
		TextIO.putln("1: AND Gate");
		TextIO.putln("2: OR Gate");
		TextIO.putln("3: NOR Gate");
		TextIO.putln("4: NAND Gate");
		TextIO.putln("5: XOR Gate");
		TextIO.putln("6: NXOR Gate");
		TextIO.putln("7: Return to main menu");
			
		selection = TextIO.getInt();
		TextIO.getln();
		
		switch(selection){
			case 1:{ 
				ANDGate();
				break;
				}
			case 2:{ 
				ORGate();
				break;
			}
			case 3:	{
				NORGate();
				break;
			}
			case 4:{	
				NANDGate();
				break;
			}
			case 5:{
				XORGate();
				break;
			}
			case 6:{
				NXORGate();
				break;
			}
			case 7:{
				return;
			}
		}
		}while(selection != 7);
	}
	
	
	
	public static void ANDGate(){
		int A = 2;
		int B = 2;
		int outofbounds = 0;
		
		TextIO.putln("");
		TextIO.putln("Please enter the value of the first value being entered into the gate");
		
		do{
			
			if (outofbounds == 1){
				TextIO.putln("");
				TextIO.putln("The Value entered is out of bounds please enter 1 or 0");		
			}
			
			A = TextIO.getInt();
			outofbounds = 1;
		}while(A > 1);
		
		outofbounds = 0;
		
		TextIO.putln("");
		TextIO.putln("Please enter the value of the second value being entered into the gate");
		
		do{
			
			if (outofbounds == 1){
				TextIO.putln("");
				TextIO.putln("The value entered is out of bounds please enter 1 or 0");
			}
			
		B = TextIO.getInt();
		outofbounds = 1;
		}while(B > 1);
		
		if(A == B){
			TextIO.putln("");
			TextIO.putln("The value leaving the gate is " + A);
		}else if(A != B){
			TextIO.putln("");
			TextIO.putln("The Value leaving the gate is 0");
		}
		
		return;
	}
	
	public static void ORGate(){
		int A = 2;
		int B = 2;
		int outofbounds = 0;
		
		TextIO.putln("");
		TextIO.putln("Please enter the value of the first value being entered into the gate");
		
		do{
			
			if (outofbounds == 1){
				TextIO.putln("");
				TextIO.putln("The Value entered is out of bounds please enter 1 or 0");		
			}
			
			A = TextIO.getInt();
			outofbounds = 1;
		}while(A > 1);
		
		outofbounds = 0;
		
		TextIO.putln("");
		TextIO.putln("Please enter the value of the second value being entered into the gate");
		
		do{
			
			if (outofbounds == 1){
				TextIO.putln("");
				TextIO.putln("The value entered is out of bounds please enter 1 or 0");
			}
			
		B = TextIO.getInt();
		outofbounds = 1;
		}while(B > 1);
		
		if(A == B){
			TextIO.putln("");
			TextIO.putln("The value leaving the gate is " + A);
		}else if(A != B){
			TextIO.putln("");
			TextIO.putln("The Value leaving the gate is 1");
		}
		
		return;
	}
	
	public static void NORGate(){
		int A = 2;
		int B = 2;
		int outofbounds = 0;
		
		TextIO.putln("");
		TextIO.putln("Please enter the value of the first value being entered into the gate");
		
		do{
			
			if (outofbounds == 1){
				TextIO.putln("");
				TextIO.putln("The Value entered is out of bounds please enter 1 or 0");		
			}
			
			A = TextIO.getInt();
			outofbounds = 1;
		}while(A > 1);
		
		outofbounds = 0;
		
		TextIO.putln("");
		TextIO.putln("Please enter the value of the second value being entered into the gate");
		
		do{
			
			if (outofbounds == 1){
				TextIO.putln("");
				TextIO.putln("The value entered is out of bounds please enter 1 or 0");
			}
			
		B = TextIO.getInt();
		outofbounds = 1;
		}while(B > 1);
		
		
		
		if(A == B){
			if(A == 0){
				TextIO.putln("");
				TextIO.putln("The value leaving the gate is 1");
			}else if(A == 1){
				TextIO.putln("");
				TextIO.putln("The value leaving the gate is 0");
			}
		}else if(A != B){
			TextIO.putln("");
			TextIO.putln("The Value leaving the gate is 0");
		}
		
		return;
	}
	
	public static void NANDGate (){
		int A = 2;
		int B = 2;
		int outofbounds = 0;
		TextIO.putln("");
		TextIO.putln("Please enter the value of the first value being entered into the gate");
		
		do{
			
			if (outofbounds == 1){
				TextIO.putln("");
				TextIO.putln("The Value entered is out of bounds please enter 1 or 0");		
			}
			
			A = TextIO.getInt();
			outofbounds = 1;
		}while(A > 1);
		
		outofbounds = 0;
		
		TextIO.putln("");
		TextIO.putln("Please enter the value of the second value being entered into the gate");
		
		do{
			
			if (outofbounds == 1){
				TextIO.putln("");
				TextIO.putln("The value entered is out of bounds please enter 1 or 0");
			}
			
		B = TextIO.getInt();
		outofbounds = 1;
		}while(B > 1);
		
		
		
		if(A == B){
			if(A == 0){
				TextIO.putln("");
				TextIO.putln("The value leaving the gate is 1");
			}else if(A == 1){
				TextIO.putln("");
				TextIO.putln("The value leaving the gate is 0");
			}
		}else if(A != B){
			TextIO.putln("");
			TextIO.putln("The Value leaving the gate is 1");
		}
		
		return;
	}
	
	public static void XORGate(){
		int A = 2;
		int B = 2;
		int outofbounds = 0;
		
		TextIO.putln("");
		TextIO.putln("Please enter the value of the first value being entered into the gate");
		
		do{
			
			if (outofbounds == 1){
				TextIO.putln("");
				TextIO.putln("The Value entered is out of bounds please enter 1 or 0");		
			}
			
			A = TextIO.getInt();
			outofbounds = 1;
		}while(A > 1);
		
		outofbounds = 0;
		
		TextIO.putln("");
		TextIO.putln("Please enter the value of the second value being entered into the gate");
		
		do{
			
			if (outofbounds == 1){
				TextIO.putln("");
				TextIO.putln("The value entered is out of bounds please enter 1 or 0");
			}
			
		B = TextIO.getInt();
		outofbounds = 1;
		}while(B > 1);
		
		
		
		if(A == B){
			TextIO.putln("");
			TextIO.putln("The Value leaving the gate is 0");
		}else if(A != B){
			TextIO.putln("");
			TextIO.putln("The Value leaving the gate is 1");
		}
		
		return;
	}
	
	public static void NXORGate(){
		int A = 2;
		int B = 2;
		int outofbounds = 0;
		
		TextIO.putln("");
		TextIO.putln("Please enter the value of the first value being entered into the gate");
		
		do{
			
			if (outofbounds == 1){
				TextIO.putln("");
				TextIO.putln("The Value entered is out of bounds please enter 1 or 0");		
			}
			
			A = TextIO.getInt();
			outofbounds = 1;
		}while(A > 1);
		
		outofbounds = 0;
		
		TextIO.putln("");
		TextIO.putln("Please enter the value of the second value being entered into the gate");
		
		do{
			
			if (outofbounds == 1){
				TextIO.putln("");
				TextIO.putln("The value entered is out of bounds please enter 1 or 0");
			}
			
		B = TextIO.getInt();
		outofbounds = 1;
		}while(B > 1);
		
		
		
		if(A == B){
			TextIO.putln("");
			TextIO.putln("The Value leaving the gate is 1");
		}else if(A != B){
			TextIO.putln("");
			TextIO.putln("The Value leaving the gate is 0");
		}
		
		return;
	
}
}

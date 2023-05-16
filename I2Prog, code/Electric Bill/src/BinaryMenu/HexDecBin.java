package BinaryMenu;

public class HexDecBin {
	
	public static void HexDecBinConvert(){
		
		int selection = 0;
		
		do{
		
		TextIO.putln("");
		TextIO.putln("Please choose what you are converting and what to.");
		TextIO.putln("1: Hex to Binary");
		TextIO.putln("2: Hex to Decimal");
		TextIO.putln("3: Decimal to Binary(not implemented)");
		TextIO.putln("4: Decimal to Hex(not implemented)");
		TextIO.putln("5: Binary to Hex(not implemented)");
		TextIO.putln("6: Binary to Decimal(not implemented)");
		TextIO.putln("7: Return to main menu");
			
		selection = TextIO.getInt();
		TextIO.getln();
		
		switch(selection){
			case 1:{ 
				Hex2Bin();
				break;
				}
			case 2:{ 
				Hex2Dec();
				break;
			}
			case 3:	{
				Dec2Bin();
				break;
			}
			case 4:{	
				Dec2Hex();
				break;
			}
			case 5:{
				Bin2Hex();
				break;
			}
			case 6:{
				Bin2Dec();
				break;
			}
			case 7:{
				return;
			}
		}
		}while(selection != 7);
	}

//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-	
	
	public static void Hex2Bin(){
	
		char Hex = 0;
		String Bin = "null";
		
		TextIO.putln("Please enter the Hexidecimal Value to be converted");
		Hex = TextIO.getChar();
		
		
		do{
		switch(Hex){
		case '0':{
			Bin = "0000";
			break;
		}
		case '1':{
			Bin = "0001";
			break;
		}
		case '2':{
			Bin = "0010";
			break;
		}
		case '3':{
			Bin = "0011";
			break;
		}
		case '4':{
			Bin = "0100";
			break;
		}
		case '5':{
			Bin = "0101";
			break;
		}
		case '6':{
			Bin = "0110";
			break;
		}
		case '7':{
			Bin = "0111";
			break;
		}
		case '8':{
			Bin = "1000";
			break;
		}
		case '9':{
			Bin = "1001";
			break;
		}
		case 'a':
		case 'A':{
			Bin = "1010";
			break;
		}
		case 'b':
		case 'B':{
			Bin = "1011";
			break;
		}
		case 'c':
		case 'C':{
			Bin = "1100";
			break;
		}
		case 'd':
		case 'D':{
			Bin = "1101";
			break;
		}
		case 'e':
		case 'E':{
			Bin = "1110";
			break;
		}
		case 'f':
		case 'F':{
			Bin = "1111";
			break;
		}
		case 'g':{
			TextIO.putln("");
			TextIO.putln("The Value entered is not a valid Hexidecimal Value");
			Bin = "null";
			break;
		}
		}
	}while(Bin == "null");
		
		if(Bin != "null"){
			
			TextIO.putln("The Binary conversion is equal to: "  + Bin);
			
		}
		return;
	}

//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-	
	
	public static void Hex2Dec(){
		
		char Hex = 0;
		int Dec = -1;
		
		TextIO.putln("Please enter the Hexidecimal Value to be converted");
		Hex = TextIO.getChar();
		
		
		do{
		switch(Hex){
		case '0':{
			Dec = 0;
			break;
		}
		case '1':{
			Dec = 1;
			break;
		}
		case '2':{
			Dec = 2;
			break;
		}
		case '3':{
			Dec = 3;
			break;
		}
		case '4':{
			Dec = 4;
			break;
		}
		case '5':{
			Dec = 5;
			break;
		}
		case '6':{
			Dec = 6;
			break;
		}
		case '7':{
			Dec = 7;
			break;
		}
		case '8':{
			Dec = 8;
			break;
		}
		case '9':{
			Dec = 9;
			break;
		}
		case 'a':
		case 'A':{
			Dec = 10;
			break;
		}
		case 'b':
		case 'B':{
			Dec = 11;
			break;
		}
		case 'c':
		case 'C':{
			Dec = 12;
			break;
		}
		case 'd':
		case 'D':{
			Dec = 13;
			break;
		}
		case 'e':
		case 'E':{
			Dec = 14;
			break;
		}
		case 'f':
		case 'F':{
			Dec = 15;
			break;
		}
		case 'g':{
			TextIO.putln("");
			TextIO.putln("The Value entered is not a valid Hexidecimal Value");
			Dec = -1;
			break;
		}
		}
	}while(Dec == -1);
		
		if(Dec != -1){
			
			TextIO.putln("The Binary conversion is equal to: "  + Dec);
			
		}
		return;
		
	}

//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-	
	
	public static void Dec2Bin(){
		
		
		int Dec = -1;
		String Bin = "null";
		
		TextIO.putln("Please enter the Hexidecimal Value to be converted");
		Dec = TextIO.getInt();
		
		do{
			switch(Dec){
			case 0:
				Bin = "0000";
				break;
			case 1:
				Bin = "0001";
				break;
			case 2:
				Bin = "0010";
				break;
			case 3:
				Bin = "0011";
				break;
			case 4:
				Bin = "0100";
				break;
			case 5:
				Bin = "0101";
				break;
			case 6:
				Bin = "0110";
				break;
			case 7:
				Bin = "0111";
				break;
			case 8:
				Bin = "1000";
				break;
			case 9:
				Bin = "1001";
				break;
			case 10:
				Bin = "1010";
				break;
			case 11:
				Bin = "1011";
				break;
			case 12: 
				Bin = "1111";
				break;
			case 13:
				TextIO.putln("");
				TextIO.putln("The number entered is too high to be converted please try again");
				Bin = "null";
				break;
			}
		}while(Bin == "null");
		
		TextIO.putln("");
		TextIO.putln("The Binary Conversion is equal to: " + Bin);
	}
	
//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
	
	public static void Dec2Hex(){
		
	}
	
//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
	
	public static void Bin2Hex(){
		
	}

//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
	
	public static void Bin2Dec(){
		
	}
}

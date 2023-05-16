package BinaryMenu;


public class BinaryMenu {
/*
 * String str = "Hello";
 * String a = str.substring(2, 4);  // a is "ll" (not "llo")
 * String b = str.substring(0, 3);  // b is "Hel"
 * String c = str.substring(4, 5);  // c is "o" -- the last char  ----- Basics of substrings in java
 * 
 * --Project Idea--
 * Produce a program capable of the tasks tasks performed during the computing systems classes.
 * 
 *  Check-list
 * -=-=-=-=-=-=-
 * 1 -=- Logic gates - implemented
 * 2 -=- Twos compliment - Implemented (upto 8 bit)
 * 3 -=- Hexidecimal, Decimal, Binary conversion - In progress
 * 4 -=- Structure - in progress
 * 5 -=- Main menu system - implemented
 * 
 */

	public static void main(String[] args) {
		
		int selection = 0;
		
		do{
		
		TextIO.putln("");
		TextIO.putln("please choose one of the following options");
		TextIO.putln("1: Logic Gates");
		TextIO.putln("2: Twos complement");
		TextIO.putln("3: Hex Decimal Binary Conversion(Partial implementation)");
		TextIO.putln("4: Exit");

			
		selection = TextIO.getInt();
		TextIO.getln();
		
		switch(selection){
			case 1:{ 
				Logic_Gates.Logic();
				break;
				}
			case 2:{ 
				Compliments.compliment();
				break;
			}
			case 3:	{
				HexDecBin.HexDecBinConvert();
				break;
			}
			case 4:{	
				System.exit(0);
				break;
			}
			case 5:{
				TextIO.putln("");
				TextIO.putln("The entered menu item does not exist. Please Try Again.");
				break;
			}
		}
		}while(selection != 4);
	}
	
	
}

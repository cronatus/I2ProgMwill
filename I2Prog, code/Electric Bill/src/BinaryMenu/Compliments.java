package BinaryMenu;

public class Compliments {

public static void compliment(){
		
		int selection = 0;
		
		do{
			
		TextIO.putln("");
		TextIO.putln("Please choose the data size");
		TextIO.putln("1: 4Bit Twos compliment");
		TextIO.putln("2: 8Bit Twos compliment");
		TextIO.putln("3: 16Bit Twos compliment(not implemented)");
		TextIO.putln("4: 32Bit Twos compliment(not implemented)");
		TextIO.putln("5: 64Bit Twos compliment(not implemented)");
		TextIO.putln("6: Return to Main Menu");
			
		selection = TextIO.getInt();
		TextIO.getln();
		
		switch(selection){
			case 1:{ 
				FourBitTwos();
				break;
				}
			case 2:{ 
				EightBitTwos();
				break;
			}
			case 3:	{
				
				break;
			}
			case 4:{	
				
				break;
			}
			case 5:{
				
				break;
			}
			case 6:{
				return;
			}
		}
		}while(selection != 6);
	}
	
public static void FourBitTwos(){
	String data;
	String[] binarystring = new String[4];
	int[] binaryint = new int[4];
	int counter = 0;
	
	TextIO.putln("");
	TextIO.putln("Please enter the four digit data piece to be calculated(note if you enter more than 4 numbers this will only accept the first 4)");
	data = TextIO.getln();
	
	do{
		
		binarystring[counter] = data.substring(counter , counter+1);
		counter++;
		
	}while(counter <=3);
	
	counter = 0;
	
	do{
		
		switch(binarystring[counter]){
			case "0":							//realisation from other work shows that a Char would work more efficiently here instead of as string
				binaryint[counter] = 0;
				break;
			case "1":
				binaryint[counter] = 1;
				break;
		}
		
		counter++;
		
	}while(counter <=3);
	
	if (binaryint[0] == 1){
		counter = 3;
		do{
			
			switch(binaryint[counter]){
				case 0:
					binaryint[counter] = 1;
					break;
				case 1:
					binaryint[counter] = 0;
					break;
			}
			
			counter--;
		}while(counter>=0);			
	}
	
	counter = 0;
	TextIO.putln("");
	TextIO.put("final binary value is: ");		
	do{
		TextIO.put(binaryint[counter]);
		counter++;
	}while(counter <=3);
	TextIO.putln();
	return;
}

public static void EightBitTwos(){
	String data;
	String[] binarystring = new String[8];
	int[] binaryint = new int[8];
	int counter = 0;
	
	TextIO.putln("");
	TextIO.putln("Please enter the eight digit data piece to be calculated");
	TextIO.putln("(note if you enter more than 8 numbers this will only accept the first 8)");
	data = TextIO.getln();
	
	do{
		
		binarystring[counter] = data.substring(counter , counter+1);
		counter++;
		
	}while(counter <=7);
	
	counter = 0;
	
	do{
		
		switch(binarystring[counter]){
			case "0":
				binaryint[counter] = 0;
				break;
			case "1":
				binaryint[counter] = 1;
				break;
		}
		
		counter++;
		
	}while(counter <=7);
	
	if (binaryint[0] == 1){
		counter = 7;
		do{
			
			switch(binaryint[counter]){
				case 0:
					binaryint[counter] = 1;
					break;
				case 1:
					binaryint[counter] = 0;
					break;
			}
			
			counter--;
		}while(counter>=0);			
	}
	
	counter = 0;
	TextIO.putln("");
	TextIO.put("final binary value is: ");		
	do{
		TextIO.put(binaryint[counter]);
		counter++;
	}while(counter <=7);
	TextIO.putln();
	return;
}

public static void SixteentBitTwos(){
	String data;
	String[] binarystring = new String[16];
	int[] binaryint = new int[16];
	int counter = 0;
	
	TextIO.putln("");
	TextIO.putln("Please enter the 16 digit data piece to be calculated");
	TextIO.putln("(note if you enter more than 16 numbers, I will only accept the first 16)");
	data = TextIO.getln();
	
	do{
		
		binarystring[counter] = data.substring(counter , counter+1);
		counter++;
		
	}while(counter <=15);
	
	counter = 0;
	
	do{
		
		switch(binarystring[counter]){
			case "0":
				binaryint[counter] = 0;
				break;
			case "1":
				binaryint[counter] = 1;
				break;
		}
		
		counter++;
		
	}while(counter <=15);
	
	if (binaryint[0] == 1){
		counter = 15;
		do{
			
			switch(binaryint[counter]){
				case 0:
					binaryint[counter] = 1;
					break;
				case 1:
					binaryint[counter] = 0;
					break;
			}
			
			counter--;
		}while(counter>=0);			
	}
	
	counter = 0;
	TextIO.putln("");
	TextIO.put("final binary value is: ");		
	do{
		TextIO.put(binaryint[counter]);
		counter++;
	}while(counter <=15);
	TextIO.putln();
	return;
}

}

import BinaryMenu.TextIO;

/**
 *  B00265222 - Mark J M Williams
 *  Mini Towers of Hanoi
 *  Intro to programming Java Practice Project
 *
 */
public class TowersofHanoi {

	private static int Disk1 = 1; //large disk
	private static int Disk2 = 1; // medium disk
	private static int Disk3 = 1; // small disk
	private static int intro = 1; //set intro 
	private static int moves = 0; //set moves counter
	private static int highscore = 10000; // set highscore variable
	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean reset = true;
		
		if (intro == 1){
			TextIO.putln("");
			TextIO.putln("	Welcome to the Pillars of Hanoi, this game gives you the task of ");       // Introduction paragraph
			TextIO.putln("helping the monks of the temple in Hanoi to move the disks of Kaio");		   // Explanation of the game
			TextIO.putln("from the lefternmost pillar of Hanoi to the furtherst right.");			   // and how it works
			TextIO.putln("");
			TextIO.putln("	However there are rules that must be followed. there are three disks");
			TextIO.putln("and also three pillars, you must get the disks from left to right without");
			TextIO.putln("putting a disk on another disk which is smaller than it, and you may only");
			TextIO.putln("move one of the disks at a time. meaning you cannot move the largest when");
			TextIO.putln("the smallest or middle sized disk is on top of it.");
			TextIO.putln("");
			intro = 0;
		}
		
		char temp1;

		while(Disk3 != 3 || Disk2 != 3 || Disk1 != 3){
			TextIO.putln("");
			TextIO.putln("The Large disk is on Pole " + Disk1 );
			TextIO.putln("The Medium disk is on Pole " + Disk2 );
			TextIO.putln("The Small disk is on Pole " + Disk3 );
			TextIO.putln("");
					
			TextIO.putln("Which disk would you like to move? (Large = 1, Medium = 2, Small = 3)");
			TextIO.putln("Currently it is move: " + moves);
			TextIO.putln("");
			temp1 = TextIO.getChar();
					
			if (temp1 == '1'){
				moves++;
				one();
			}
			if (temp1 == '2'){
				moves++;
				two();
			}
			if (temp1 == '3'){
				
				moves++;
				three();
			}
			else {
				TextIO.putln("");
				TextIO.putln("ERROR, ERROR, DOES NOT COMPUTE. Try Again!");	
				TextIO.putln("");
			}
			
		}
		
		if (moves < highscore) {
			highscore = moves;
		}
		
		TextIO.putln("");
		TextIO.putln("Congratulations, you solved the puzzle for the monks");
		TextIO.putln("");
		TextIO.putln("It took you " + moves + " moves to finish the puzzle");
		TextIO.putln("");
		TextIO.putln("The least amount of moves is 7");
		TextIO.putln("");
		TextIO.putln("Your Current Highscore is: " + highscore);
		TextIO.putln("");
		TextIO.putln("Would you like to go again?(yes/no)");
		reset = TextIO.getBoolean();
		
		if (reset == true){
			intro = 1;
			Disk1 = 1;
			Disk2 = 1;
			Disk3 = 1;
			moves = 0;
			main(null);
		} else {
			System.exit(0);
		}
		
		
	}
	
	public static void one(){
		int temp2;
		if (Disk1 == 1){
			if (Disk2 == 1){
				TextIO.putln("Cannot move the large disk as there is another disk on top of it");
				main(null);
			}
			else if (Disk3 == 1){
				TextIO.putln("Cannot move the large disk as there is another disk on top of it");
				main(null);
			}
			else{
				TextIO.putln("Which Tower would you like to move the large disk to?(Pole 1, Pole 2 or Pole3)");
				temp2 = TextIO.getChar();
				if (temp2 == '1'){
					TextIO.putln("This Disk is already there!");
					main(null);
				}
				if (temp2 == '2'){
					if (Disk2 == 2){
						TextIO.putln("Cannot move this disk there a smaller disk is already there");
						main(null);
					}
					else if (Disk3 == 2){
						TextIO.putln("Cannot move this disk there a smaller disk is already there");
						main(null);
					}
					else{
						TextIO.putln("The Monks have moved the large disk to the second pole");
						Disk1 = 2;
						main(null);
					}
				}
				if (temp2 == '3'){
					if (Disk2 == 3){
						TextIO.putln("Cannot move this disk there is a smaller disk is already there");
						main(null);
					}
					else if (Disk3 == 3){
						TextIO.putln("Cannot move this disk there is a smaller disk is already there");
						main(null);
					}
					else{
						TextIO.putln("The Monks have moved the large disk to the Last pole");
						Disk1 = 3;
						main(null);
						}
								}
				}
		}
		
		if (Disk1 == 2){
			if (Disk2 == 2){
				TextIO.putln("Cannot move the large disk as there is another disk on top of it");
				main(null);
			}
			else if (Disk3 == 2){
				TextIO.putln("Cannot move the large disk as there is another disk on top of it");
				main(null);
			}
			else{
				TextIO.putln("Which Tower would you like to move the large disk to?(Pole 1, Pole 2 or Pole3)");
				temp2 = TextIO.getChar();
				if (temp2 == '1'){
					if (Disk2 == 1){
						TextIO.putln("Cannot move this disk there a smaller disk is already there");
						main(null);
					}
					else if (Disk3 == 1){
						TextIO.putln("Cannot move this disk there a smaller disk is already there");
						main(null);
					}
					else{
						TextIO.putln("The Monks have moved the large disk to the first pole");
						Disk1 = 1;
						main(null);
				}
				if (temp2 == '2'){
					TextIO.putln("This Disk is already there!");
					main(null);
					}
				}
				if (temp2 == '3'){
					if (Disk2 == 3){
						TextIO.putln("Cannot move this disk there is a smaller disk is already there");
						main(null);
					}
					else if (Disk3 == 3){
						TextIO.putln("Cannot move this disk there is a smaller disk is already there");
						main(null);
					}
					else{
						TextIO.putln("The Monks have moved the large disk to the Last pole");
						Disk1 = 3;
						main(null);
						}
								}
				}
		}
		if (Disk1 == 3){
			if (Disk2 == 3){
				TextIO.putln("Cannot move the large disk as there is another disk on top of it");
				main(null);
			}
			else if (Disk3 == 3){
				TextIO.putln("Cannot move the large disk as there is another disk on top of it");
				main(null);
			}
			else{
				TextIO.putln("Which Tower would you like to move the large disk to?(Pole 1, Pole 2 or Pole3)");
				temp2 = TextIO.getChar();
				if (temp2 == '1'){
					if (Disk2 == 1){
						TextIO.putln("Cannot move this disk there a smaller disk is already there");
						main(null);
					}
					else if (Disk3 == 1){
						TextIO.putln("Cannot move this disk there a smaller disk is already there");
						main(null);
					}
					else{
						TextIO.putln("The Monks have moved the large disk to the first pole");
						Disk1 = 1;
						main(null);
				}
				if (temp2 == '2'){
					if (Disk2 == 2){
						TextIO.putln("Cannot move this disk there a smaller disk is already there");
						main(null);
					}
					else if (Disk3 == 2){
						TextIO.putln("Cannot move this disk there a smaller disk is already there");
						main(null);
					}
					else{
						TextIO.putln("The Monks have moved the large disk to the first pole");
						Disk1 = 1;
						main(null);
					}
				}
				if (temp2 == '3'){
					TextIO.putln("This Disk is already there!");
					main(null);
					
						}
								}
				}
		}
	}
	
	public static void two(){
		int temp2;
		if (Disk2 == 1){
			if(Disk3 == 1){
				TextIO.putln("Cannot move the Medium disk as there is another disk on top of it");
			}
			else{
				TextIO.putln("Which Tower would you like to move the Medium disk to?(Pillar 1, Pillar 2 or Pillar 3)");
				temp2 = TextIO.getChar();
				if (temp2 == '1'){
					TextIO.putln("this Disk is already there");
					main(null);
					}
				if (temp2 == '2'){
					if (Disk3 == 2){
						TextIO.putln("cannot move there, a smaller disk is already there");
						main(null);
					}
					else{
						TextIO.putln("The monks have moved the medium disk to the middle pillar");
						Disk2 = 2;
						main(null);
					}
				}
				if (temp2 == '3'){
					if (Disk3 == 3){
						TextIO.putln("cannot move there, a smaller disk is already there");
						main(null);
					}
					else{
						TextIO.putln("The monks have moved the medium disk to the last pillar");
						Disk2 = 3;
						main(null);
					}
				}
			}
		}
		if (Disk2 == 2){
			if(Disk3 == 2){
				TextIO.putln("Cannot move the Medium disk as there is another disk on top of it");
			}
			else{
				TextIO.putln("Which Tower would you like to move the Medium disk to?(Pillar 1, Pillar 2 or Pillar 3)");
				temp2 = TextIO.getChar();
				if (temp2 == '1'){
					if (Disk3 == 1){
						TextIO.putln("cannot move there, a smaller disk is already there");
						main(null);
					}
					else{
						TextIO.putln("The monks have moved the medium disk to the first pillar");
						Disk2 = 1;
						main(null);
					}
					}
				if (temp2 == '2'){
					TextIO.putln("this Disk is already there");
					main(null);
				}
				if (temp2 == '3'){
					if (Disk3 == 3){
						TextIO.putln("cannot move there, a smaller disk is already there");
						main(null);
					}
					else{
						TextIO.putln("The monks have moved the medium disk to the last pillar");
						Disk2 = 3;
						main(null);
					}
				}
			}
		}
		
		if (Disk2 == 3){
			if(Disk3 == 3){
				TextIO.putln("Cannot move the Medium disk as there is another disk on top of it");
			}
			else{
				TextIO.putln("Which Tower would you like to move the Medium disk to?(Pillar 1, Pillar 2 or pillar 3)");
				temp2 = TextIO.getChar();
				if (temp2 == '1'){
					if (Disk3 == 1){
						TextIO.putln("cannot move there, a smaller disk is already there");
						main(null);
					}
					else{
						TextIO.putln("The monks have moved the medium disk to the first pillar");
						Disk2 = 1;
						main(null);
					}
					}
				if (temp2 == '2'){
					if (Disk3 == 3){
						TextIO.putln("cannot move there, a smaller disk is already there");
						main(null);
					}
					else{
						TextIO.putln("The monks have moved the medium disk to the last pillar");
						Disk2 = 2;
						main(null);
				}
				if (temp2 == '3'){
					TextIO.putln("this Disk is already there");
					main(null);
					}
				}
			}
		}
	}
	
	public static void three(){
		int temp2;
		if (Disk3 == 1){
			TextIO.putln("Which Tower would you like to move the Medium disk to?(Pillar 1, Pillar 2 or Pillar 3)");
			temp2 = TextIO.getChar();
			if (temp2 == '1'){
				TextIO.putln("This disk is already there");
				main(null);
			}
			if (temp2 == '2'){
				TextIO.putln("The monks have moved the small disk to the Middle pillar");
				Disk3 = 2;
			}
			if (temp2 == '3'){
				TextIO.putln("The monks have moved the small disk to the final pillar");
				Disk3 = 3;
				main(null);
			}
		}
		if (Disk3 == 2){
			TextIO.putln("Which Tower would you like to move the small disk to?(Pillar 1, Pillar 2, or Pillar 3)");
			temp2 = TextIO.getChar();
			if (temp2 == '1'){
				TextIO.putln("The monks have moved the small disk to the first pillar");
				Disk3 = 1;
				main(null);
			}
			if (temp2 == '2'){
				TextIO.putln("This disk is already there");
				Disk3 = 2;
				main(null);
			}
			if (temp2 == '3'){
				TextIO.putln("The monks have moved the small disk to the final pillar");
				Disk3 = 3;
				main(null);
			}
		}
		if (Disk3 == 3){
			TextIO.putln("Which Tower would you like to move the small disk to?(Pillar 1, Pillar 2, or Pillar 3)");
			temp2 = TextIO.getChar();
			if (temp2 == '1'){
				TextIO.putln("The monks have moved the small disk to the first pillar");
				Disk3 = 1;
				main(null);
			}
			if (temp2 == '2'){
				TextIO.putln("The monks have moved the small disk to the middle pillar");
				Disk3 = 2;
				main(null);
			}
			if (temp2 == '3'){
				TextIO.putln("This disk is already there");
				main(null);
		}
	}

}
}
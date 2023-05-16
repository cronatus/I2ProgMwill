import BinaryMenu.TextIO;


public class threerepeatedbirthdays {
	  public static void main(String[] args) {
		   
	       TextIO.putln("This program simulates taking people at random");
	       TextIO.putln("until two have been found who were born on the");
	       TextIO.putln("same day of the year.\n");
	       
	       do {
	          birthdayProblem();
	          TextIO.put("\nAgain? (Y/N):  ");
	       } while ( TextIO.getlnBoolean() );
	      
	       TextIO.putln("\n\nOK.  Goodbye.");
	       
	   } // end main()
	   
	   
	   /**
	    * Simulate choosing people at random and checking the day of the 
	    * year they were born on.  If the birthday is the same as one that 
	    * was seen previously, stop, and output the number of people who
	    * were checked.
	    */
	   private static void birthdayProblem() {

	      boolean[] used;  // For recording the possible birthdays
	      boolean[] used2; //   that have been seen so far.  A value
	                       //   of true in used[i] means that a person
	                       //   whose birthday is the i-th day of the
	                       //   year has been found.

	      int count;       // The number of people who have been checked.

	      used = new boolean[365];  // Initially, all entries are false.
	      used2 = new boolean[365];
	      count = 0;

	      while (true) {
	             // Select a birthday at random, from 0 to 364.
	             // If the birthday has already been used, quit.
	             // Otherwise, record the birthday as used.
	         int birthday;  // The selected birthday.
	         birthday = (int)(Math.random()*365);
	         count++;
	         if (used[birthday])
	        	 if ( used2[birthday] )  // This day was found before; It's a 
	                                // duplicate.
	        		 break;
	         	used2[birthday] = true;
	         used[birthday] = true;
	      }

	      TextIO.putln("A third replica birthday was found after " + count + " tries.");

	   } // end birthdayProblem()
	 
} //  end class threerepeatedbirthdays

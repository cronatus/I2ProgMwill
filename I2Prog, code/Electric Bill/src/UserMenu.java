import BinaryMenu.TextIO;


public class UserMenu {
/*
 * Read in a name and append it to the array (but do not allow duplicate names,
 * each name should be unique)
 * Read in a name and check whether it is in the array (as 2 above)
 * Read in a name and delete it from the array if it exists. This should not leave
 * a “hole” in the array – the names should continue to occupy consecutive
 * positions in the array – but the order in which the names occur in the list is not
 * important
 * Allow the user to change their username by reading in a name and changing
 * it to a new name if it exists
 * Exit the program
 */
	public static int length = 1;
	public static int j = -1;
	
	public static void main(String[] args) {
		String[] Users = new String[10];
		int selection  = 0;
		
		Users[0] = "Mark";
		Users[1] = "Joan";
		Users[2] = "Lemon";
		Users[3] = "Terrance";
		Users[4] = "Crone";
		
		TextIO.putln("Please choose one of the following options");
		TextIO.putln("1: Create User");
		TextIO.putln("2: Check for a username");
		TextIO.putln("3: delete a Username");
		TextIO.putln("4: Change username");
		TextIO.putln("5: Exit");

		do{
			
		selection = TextIO.getInt();
		TextIO.getln();
		
		switch(selection){
			case 1:{ 
				Users[length -1] = AddUser(Users);
				length++;
				break;
				}
			case 2:{ 
				UserCheck(Users);
				break;
			}
			case 3:	{
				DeleteUser(Users);
				break;
			}
			case 4:{	
				Users[j] = ChangeUser(Users);
				break;
			}
			case 5:{
				System.exit(0);
				break;
			}
			case 6:{
				PrintUsers(Users);
			}
		}
		}while(selection != 5);
		
	}
	
	public static String AddUser(String[] Users){
		String temp;
		TextIO.putln("Please enter your Username");
		temp = TextIO.getln();
		return temp;
		
	}
	
	public static void UserCheck(String[] Users){
		int getindex = 0;
		String target;
		TextIO.putln("Please enter the Username you are searching for");
		
		target = TextIO.getln();
			
		getindex = indexof( Users, target);
		if (getindex >= 0){
			TextIO.putln("The Username entered was found at position " + getindex);
		}
		if(getindex < 0){
			TextIO.putln("The Username entered was not found in the system");
		}
	}
	
	public static int indexof(String[] Users, String target) {
		for (int i=0; i<Users.length; i++) {
			if (target.equals(Users[i])) {
				return i;
			}
		}
		return -1;
	}
	
	public static void DeleteUser(String[] Users){
		String Target;
		int L = 0;
		int T = 0;
		TextIO.putln("Please enter the Username you are attempting to Delete");
		Target = TextIO.getln();
		do{
			if(Target.equals(Users[L])){
				do{
				T = L;
				Users[L] = Users[L + 1];
				L++;
				}while(T < Users.length);
			}
		}while(L < Users.length);
		
	}
	
	public static String ChangeUser(String[] Users){
		String Target;
		String Newuser;
		int i;
		
		TextIO.putln("Please enter your current Username");
		Target = TextIO.getln();
		for( i=0; i<Users.length; i++){
			if (Target.equals(Users[i])){
				j = i;
			}else if (!Target.equals(Users[i])){
				return Target;
			}
		}
		TextIO.putln("Please enter your new Username");
		Newuser = TextIO.getln();
		return Newuser;
	}
	
	public static void PrintUsers(String[] Users){
		for(int i=0; i<Users.length; i++){
			TextIO.putln(Users[i]);
		}
	}
}

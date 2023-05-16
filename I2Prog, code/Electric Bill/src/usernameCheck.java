import BinaryMenu.TextIO;


public class usernameCheck {
	
	public static void main(String[] args) {
		String[] Users = {"Mark", "Joan", "Alan", "Marianne", "Lawrence", "Morgan"};
		String target;
		int getindex = 0;
		
		do{
		TextIO.putln("Please enter the name you are searching for");
		target = TextIO.getln();
		
		getindex = indexof( Users, target);
		if (getindex >= 0){
			TextIO.putln("The name entered was found at index " + getindex);
		}
		if(getindex < 0){
			TextIO.putln("The name entered was not found in the index");
		}
		
		}while(!target.equals("Exit"));
	}
	
	
	public static int indexof(String[] Users, String target) {
		for (int i=0; i<Users.length; i++) {
			if (target.equals(Users[i])) {
				return i;
			}
		}
		return -1;
	
		
	}
}

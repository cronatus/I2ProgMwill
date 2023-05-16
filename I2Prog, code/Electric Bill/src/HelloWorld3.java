import BinaryMenu.TextIO;


public class HelloWorld3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Firstname;
		String Lastname;
		int Age;
		Double Height;
		
		Firstname = "Mark";
		Lastname = "Williams";
		Age = 17;
		Height = 5.7;
				
		TextIO.putln("Hello " + Firstname + " " + Lastname + " you are " + Age + "Years old and " + Height + "ft tall");
	}

}

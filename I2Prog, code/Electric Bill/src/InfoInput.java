import BinaryMenu.TextIO;


public class InfoInput {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			String Firstname;
			String Lastname;
			int Age;
			Double Height;
			
			TextIO.putln("Hello, What is you first name?:");
			Firstname = TextIO.getln();
			TextIO.putln("And your Surname?:");
			Lastname = TextIO.getln();
			TextIO.putln("How old are you?:");
			Age = TextIO.getInt();
			TextIO.putln("How Tall are you?:");
			Height = TextIO.getDouble();
			
					
			TextIO.putln("Hello " + Firstname + " " + Lastname + " you are " + Age + "Years old and " + Height + "ft tall");
		}

}

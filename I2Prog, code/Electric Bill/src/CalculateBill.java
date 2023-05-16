import BinaryMenu.TextIO;


public class CalculateBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc(0);
	}

	public static float  calc(float c) {
		double unitsused;
		double over100;
		double bill;
		
		TextIO.putln("please enter the units used");
		unitsused = TextIO.getInt();
		
		if (unitsused > 100) {
			over100 = unitsused - 100;
			bill = over100 * 15.6;
			bill = bill + (100 * 26.7);
		} else {
			bill = unitsused * 26.7;
		}
	
		TextIO.putln("the final bill is: " + bill);
		return c;
	}
}

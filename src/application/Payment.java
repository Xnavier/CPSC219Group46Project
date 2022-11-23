package application;

public class Payment {
	private double amount = 0.0;
	private boolean recurring = false;
	private boolean onetime = true;
	
	public Payment(double amt) {
		amount = amt;
	}
	
	public Payment(double amt, boolean recur) {
		amount = amt;
		if (recur == true) {
			recurring = true;
			onetime = false;
		}
	}
	
	public Payment(double amt, boolean recur, boolean expense) {
		if (recur == true) {
			recurring = true;
			onetime = false;
		}
		if (expense == true) {
			amount = amt;
			amount = -amount;
		}
	}
	
	public Payment(String amt) {
		// Need to add verification later
		amount = Double.parseDouble(amt); 
	}
	
	public Payment(String amt, boolean recur) {
		amount = Double.parseDouble(amt);
		if (recur == true) {
			recurring = true;
			onetime = false;
		}
	}
	
	public Payment(String amt, boolean recur, boolean expense) {
		if (recur == true) {
			recurring = true;
			onetime = false;
		}
		if (expense == true) {
			amount = Double.parseDouble(amt);
			amount = -amount;
		}
			
	}
}

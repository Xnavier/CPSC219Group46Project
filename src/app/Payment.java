package app;
import java.util.Date;

/**
 * Represents a monetary transaction.
 */

public class Payment {
	
	private int dollars = 0;
	private int cents = 0;
	/**
	 * Date of the transaction, used to determine if the transaction should be considered.
	 */
	private Date startDate = new Date();
	private String name = "";	
	
	public Payment() {
		
	}
	
	public Payment(Payment payment) {
		dollars = payment.dollars;
		cents = payment.cents;
		startDate = payment.startDate;
		name = payment.name;
	}
	
	public Payment(String name, int dollar, int cent) throws InvalidPaymentException {
		if (dollar < 0) {
		throw new InvalidPaymentException("Dollars must be positive. ");
		}
		if (cent > 99 || cent < 0) {
			throw new InvalidPaymentException("Cents must be between 0 and 99.");
		}
		setDollars(dollar);
		setCents(cent);
		setName(name);
	}
	
	public Payment(String name, int total) throws InvalidPaymentException {
		if (total < 0) {
		throw new InvalidPaymentException("Amounts cannot be negative. ");
		}
		setDollars(total / 100);
		setCents(total % 100);
		setName(name);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDollars() {
		return dollars;
	}
	
	public void setDollars(int dollars) {
		this.dollars = dollars;
	}
	
	public int getCents() {
		return cents;
	}

	public void setCents(int cents) {
		this.cents = cents;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	

	
}


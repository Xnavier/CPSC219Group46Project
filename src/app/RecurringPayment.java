package app;
import java.util.Date;

public class RecurringPayment extends Payment{
	private int period = 1;
	
	public RecurringPayment(String name, int dollar, int cent, int days) throws InvalidPaymentException {
		super(name, dollar, cent);
		if (days < 0) {
			throw new InvalidPaymentException("Time period cannot be negative.");
		}
		setPeriod(days);
	}
	
	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public void setPeriod(int number, String timeframe) throws InvalidPaymentException {
		if (timeframe.toLowerCase() == "day" || timeframe.toLowerCase() == "days") {
			setPeriod(number);
		} else if (timeframe.toLowerCase() == "week" || timeframe.toLowerCase() == "weeks") {
			setPeriod(7 * number);
		} else if (timeframe.toLowerCase() == "month" || timeframe.toLowerCase() == "months") {
			setPeriod(30 * number);
		} else if (timeframe.toLowerCase() == "year" || timeframe.toLowerCase() == "years") {
			setPeriod(365 * number);
		} else {
			throw new InvalidPaymentException("The period '" + timeframe + "' is not a valid timeframe.");
		}
	}
	
}

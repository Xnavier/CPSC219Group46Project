package app;
import java.util.ArrayList;
import java.util.Date;


import app.Payment;

public class RecurringTransactionList {
	private String name;
	private ArrayList<RecurringPayment> paymentList = new ArrayList<RecurringPayment>();
	
	public RecurringTransactionList (String listName) {
		name = listName;
		paymentList = new ArrayList<RecurringPayment>();
	}
	
	public ArrayList<RecurringPayment> getTransactions() {
		return paymentList;
	}
	
	public String getName() {
		return name;
	}		
	
	public void addTransaction(RecurringPayment payment) {
		paymentList.add(payment);
	}
	
	public long getTotalAmount(Date start, Date end) {
		int length = paymentList.size();
		long timespan = end.getTime() - start.getTime();
		int counter = 0;
		int dollars = 0;
		int cents = 0;
		long numPayments = 0;
		long totalAmount = 0;
		while (counter < length) {
			if (start.before(paymentList.get(counter).getStartDate()) || start.equals(paymentList.get(counter).getStartDate())) {
				dollars =  paymentList.get(counter).getDollars();
				cents = 100 * dollars + paymentList.get(counter).getCents();
				numPayments = timespan % (paymentList.get(counter).getPeriod() * 86400000);
				totalAmount += numPayments * cents;
				counter++;
			}		
		}
		return totalAmount;
	}	
}

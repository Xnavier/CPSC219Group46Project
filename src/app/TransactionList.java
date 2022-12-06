package app;
import java.util.ArrayList;

import app.Payment;

public class TransactionList {
	private String name;
	private ArrayList<Payment> paymentList = new ArrayList<Payment>();
	
	public TransactionList (String listName) {
		name = listName;
		paymentList = new ArrayList<Payment>();
	}
	
	public ArrayList<Payment> getTransactions() {
		return paymentList;
	}
	
	public String getName() {
		return name;
	}		
	
	public void addTransaction(Payment payment) {
		paymentList.add(payment);
	}
	
	public long getTotalAmount() {
		int length = paymentList.size();
		int counter = 0;
		int dollars = 0;
		int cents = 0;
		while (counter < length) {			
			dollars +=  paymentList.get(counter).getDollars();
			cents += paymentList.get(counter).getCents();
			counter++;
		}
		return 100 * dollars + cents;
	}
	
}

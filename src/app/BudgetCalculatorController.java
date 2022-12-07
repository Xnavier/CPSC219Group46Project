package app;

import javafx.event.ActionEvent;

import java.util.*;
import java.util.Date;
import java.math.*;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BudgetCalculatorController {
	Stage appStage;


	   

	    @FXML
	    private Label expenseLabel;

	    @FXML
	    private Button incomeBaitButton;

	    @FXML
	    private Label incomeSceneBaitLabel;
	    
	    @FXML
	    private Label incomeLabel;

	    @FXML
	    private Label savingsLabel;

	    @FXML
	    private Button getSavingsSceneLabel;

	    @FXML
	    private Button getExpensesButton;
	     
	    @FXML 
	    private Label newDirections;
	    
	    @FXML 
	    private TextField startDateField;
	    
	   @FXML
	    private TextField endDateField;
	   
	   @FXML
	   private Label dateLabel;
	   
	   @FXML
	   private Label dateLabel2;
	   
	   
	    

	    
	   
	    
	    @FXML
	    private Label budgetLabel;
	    
	    @FXML
	    private Button getBudgetButton;
	    

	    @FXML
	    void f50808(ActionEvent event) {

	    }
	    
  
  	Label expenseErrorLabel = new Label("");
  	RecurringTransactionList expenseList = new RecurringTransactionList("Expense subtractors");
  	
	
	@FXML
	public void getExpense(ActionEvent enterExpenseEvent) {
    	Scene mainScene = appStage.getScene();
    	
  
    	VBox expenseBox = new VBox();
    	Label expenseLabel = new Label ("Add together all of your expenses");
    	
    	
    		HBox foodLabelBox = new HBox();
    		Label foodDirect = new Label("Estimate food expenses per month.");
    		
    		foodLabelBox.getChildren().addAll(foodDirect);
    	
    		HBox foodField = new HBox();
    		Label foodDollars = new Label ("Dollars");
    		TextField foodExpenseDollars = new TextField();
    		Label foodCents = new Label ("Cents");
    		TextField foodExpenseCents = new TextField();
    		
    		foodField.getChildren().addAll(foodDollars,foodExpenseDollars, foodCents, foodExpenseCents);
    		
    		HBox foodPeriod = new HBox();
    		Label foodPeriodLabel = new Label("Period of time over which costs occur");
    		TextField periodPayFood  = new TextField();
    		ChoiceBox<String> foodPeriods = new ChoiceBox<String>();
    		
    		foodPeriods.getItems().add("days");
    		foodPeriods.getItems().add("weeks");
    		foodPeriods.getItems().add("months");
    		foodPeriod.getChildren().addAll(foodPeriodLabel, periodPayFood, foodPeriods);
    		
    		
    		HBox utilitiesLabelBox = new HBox();
    		Label utilitiesEstimate = new Label ("Enter the rough amount of money spent per month on utilities.");
    		utilitiesLabelBox.getChildren().addAll(utilitiesEstimate);
    		
    		
    		HBox utilitiesField = new HBox();
    		Label utDollars = new Label("Amount in Dollars");
    		TextField utilitiesDollars = new TextField();
    		Label utCents = new Label("Amount in Cents");
    		TextField utilitiesCents = new TextField();
    		
    		utilitiesField.getChildren().addAll( utDollars,utilitiesDollars,utCents, utilitiesCents);
    		
    		HBox uPeriod = new HBox();
    		Label uPeriodLabel = new Label ("Period of time over which costs occur");
    		TextField periodPayUt  = new TextField();
    		ChoiceBox<String> uPeriods = new ChoiceBox<String>();
    		
    		uPeriods.getItems().add("days");
    		uPeriods.getItems().add("weeks");
    		uPeriods.getItems().add("months");
    		uPeriod.getChildren().addAll(uPeriodLabel, periodPayUt, uPeriods);
    		
    		HBox randomLabelBox = new HBox();
    		Label randomEstimate = new Label ("Estimate of random Expenses");
    		randomLabelBox.getChildren().addAll(randomEstimate);
    		
    		HBox randomsField = new HBox();
    		Label rDollars = new Label ("Amount in dollars");
    		TextField randomExpenseDollars = new TextField();
    		Label rCents = new Label ("Amount in cents");
    		TextField randomExpenseCents = new TextField();
    		
    		randomsField.getChildren().addAll(rDollars, randomExpenseDollars,rCents, randomExpenseCents);
    		
    		
    		HBox rPeriod = new HBox();
    		Label rPeriodLabel = new Label ("Period of time over which incidents can occur");
    		TextField periodPayRa = new TextField();
    		ChoiceBox<String> rPeriods = new ChoiceBox<String>();
    		
    		rPeriods.getItems().add("days");
    		rPeriods.getItems().add("weeks");
    		rPeriods.getItems().add("months");
    		
    		Button doneButton = new Button ("Done");
    		doneButton.setOnAction(doneEvent -> getExpenseHelper(mainScene, foodExpenseDollars,foodExpenseCents,periodPayFood,foodPeriods.getValue(), utilitiesDollars,utilitiesCents ,periodPayUt,uPeriods.getValue(), randomExpenseDollars, randomExpenseCents,periodPayRa,rPeriods.getValue(), "Expenditures"));
    		
    		
    		rPeriod.getChildren().addAll(rPeriodLabel, periodPayRa, rPeriods);
    		expenseBox.getChildren().addAll(expenseLabel,foodLabelBox, foodField, foodPeriod, utilitiesLabelBox, utilitiesField,uPeriod, randomLabelBox, randomsField, rPeriod, doneButton);
    	
    	
    	Scene expenseScene = new Scene (expenseBox, 700, 300);
    	appStage.setScene(expenseScene);
		
    	
    	
    	
    		
    	

	}
	void getExpenseHelper(Scene mainscene, TextField amountDollars, TextField amountCents, TextField periodNumber, String string, TextField utilitiesDollars, TextField utilitiesCents, TextField periodPayUt, String string2, TextField randomExpenseDollars, TextField randomExpenseCents, TextField periodPayRa,  String periodTime, String name) {
		expenseErrorLabel.setText("");		
		String centsString = amountCents.getText();
		String dollarsString = amountDollars.getText();
		String dollarsString2 = utilitiesDollars.getText();
		String centsString2 = utilitiesCents.getText();
		String dollarsString3 = randomExpenseDollars.getText();
		String centsString3 = randomExpenseCents.getText();
		boolean amountError = false;
		for (char c : dollarsString.toCharArray()) {
    		//Check if character is a digit
			if (!Character.isDigit(c)) {
    			if (c == '-') {
    				expenseErrorLabel.setText("Amount should be positive");
					amountError = true;
    			//returns error message for invalid characters
    			} else {
    				expenseErrorLabel.setText("Do not use " + c + " in the entry. Enter a valid number. ");
    				amountError = true;
    			}
    		}
		}	
		for (char c : centsString.toCharArray()) {
    		//Check if character is a digit
    		if (!Character.isDigit(c)) {
    			if (c == '-') {
    				expenseErrorLabel.setText("Amount should be positive");
					amountError = true;
    			//returns error message for invalid characters
    			} else {
    				expenseErrorLabel.setText("Do not use " + c + " in the entry. Enter a valid number. ");
    				amountError = true;
    			}
    		}
    		}
		for (char c : dollarsString2.toCharArray()) {
    		//Check if character is a digit
			if (!Character.isDigit(c)) {
    			if (c == '-') {
    				expenseErrorLabel.setText("Amount should be positive");
					amountError = true;
    			//returns error message for invalid characters
    			} else {
    				expenseErrorLabel.setText("Do not use " + c + " in the entry. Enter a valid number. ");
    				amountError = true;
    			}
    		}
		}	
		for (char c : centsString2.toCharArray()) {
    		//Check if character is a digit
			if (!Character.isDigit(c)) {
    			if (c == '-') {
    				expenseErrorLabel.setText("Amount should be positive");
					amountError = true;
    			//returns error message for invalid characters
    			} else {
    				expenseErrorLabel.setText("Do not use " + c + " in the entry. Enter a valid number. ");
    				amountError = true;
    			}
    		}
		}	
		
		for (char c : dollarsString3.toCharArray()) {
    		//Check if character is a digit
			if (!Character.isDigit(c)) {
    			if (c == '-') {
    				expenseErrorLabel.setText("Amount should be positive");
					amountError = true;
    			//returns error message for invalid characters
    			} else {
    				expenseErrorLabel.setText("Do not use " + c + " in the entry. Enter a valid number. ");
    				amountError = true;
    			}
    		}
		}	
		
		for (char c : centsString3.toCharArray()) {
    		//Check if character is a digit
			if (!Character.isDigit(c)) {
    			if (c == '-') {
    				expenseErrorLabel.setText("Amount should be positive");
					amountError = true;
    			//returns error message for invalid characters
    			} else {
    				expenseErrorLabel.setText("Do not use " + c + " in the entry. Enter a valid number. ");
    				amountError = true;
    			}
    		}
		}	
    	if (amountError == false) { 
    		try {
    			RecurringPayment expenseSource = new RecurringPayment(name, Integer.parseInt(dollarsString), Integer.parseInt(centsString));
    			expenseSource.setPeriod(Integer.parseInt(periodNumber.getText()), periodTime);
    			expenseList.addTransaction(expenseSource);
    		} catch (InvalidPaymentException e) {
    			expenseErrorLabel.setText(e.getMessage());
    		}
    	}
    	
    	if (amountError == false) { 
    		try {
    			RecurringPayment expenseSource = new RecurringPayment(name, Integer.parseInt(dollarsString2), Integer.parseInt(centsString2));
    			expenseSource.setPeriod(Integer.parseInt(periodNumber.getText()), string);
    			expenseList.addTransaction(expenseSource);
    		} catch (InvalidPaymentException e) {
    			expenseErrorLabel.setText(e.getMessage());
    		}
    	}
    	
    	if (amountError == false) { 
    		try {
    			RecurringPayment expenseSource = new RecurringPayment(name, Integer.parseInt(dollarsString3), Integer.parseInt(centsString3));
    			expenseSource.setPeriod(Integer.parseInt(periodPayUt.getText()), string2);
    			expenseList.addTransaction(expenseSource);
    		} catch (InvalidPaymentException e) {
    			expenseErrorLabel.setText(e.getMessage());
    		}
    	}
    	appStage.setScene(mainscene);
 
    	
 
		
		
	}
	
	Label incomeErrorLabel = new Label();
	RecurringTransactionList incomeList = new RecurringTransactionList("Sources of Income");
	
	@FXML
	void getIncome (ActionEvent enterIncome) {
		Scene mainScene = appStage.getScene();
		VBox incomeContainer = new VBox();
		Label primaryIncomeTitle = new Label ("Enter the amount and period of your primary source of income:");
		HBox primaryIncomeContainer = new HBox();
		Label primaryIncomeLabelDollars = new Label ("Dollars: ");
		TextField primaryIncomeAmountDollars = new TextField();
		Label primaryIncomeLabelCents = new Label ("Cents:");
		TextField primaryIncomeAmountCents = new TextField();
		primaryIncomeContainer.getChildren().addAll(primaryIncomeLabelDollars, primaryIncomeAmountDollars, primaryIncomeLabelCents, primaryIncomeAmountCents);
		HBox primaryIncomePeriod = new HBox();
		Label primaryIncomePeriodLabel = new Label("Period of Income:");
		TextField primaryIncomePeriodNumber = new TextField();
		ChoiceBox<String> primaryIncomePeriodTime = new ChoiceBox<String>();
		
		primaryIncomePeriodTime.getItems().add("days");
		primaryIncomePeriodTime.getItems().add("weeks");
		primaryIncomePeriodTime.getItems().add("months");
		
		primaryIncomePeriod.getChildren().addAll(primaryIncomePeriodLabel, primaryIncomePeriodNumber, primaryIncomePeriodTime);
		
		
		
		Button doneButton = new Button ("Done");
		doneButton.setOnAction(doneEvent -> getIncomeHelper(mainScene, primaryIncomeAmountDollars, primaryIncomeAmountCents, primaryIncomePeriodNumber, primaryIncomePeriodTime.getValue(), "Primary Income"));
		
		incomeContainer.getChildren().addAll(primaryIncomeTitle, primaryIncomeContainer, primaryIncomePeriod, incomeErrorLabel, doneButton);
		
		Scene primaryIncomeScene = new Scene(incomeContainer, 700, 700);
		appStage.setScene(primaryIncomeScene);		
	}
	
	void getIncomeHelper(Scene mainscene, TextField amountDollars, TextField amountCents, TextField periodNumber, String periodTime, String name) {
		incomeErrorLabel.setText("");		
		String centsString = amountCents.getText();
		String dollarsString = amountDollars.getText();
		boolean amountError = false;
		for (char c : dollarsString.toCharArray()) {
    		//Check if character is a digit
			if (!Character.isDigit(c)) {
    			if (c == '-') {
    				incomeErrorLabel.setText("Amount should be positive");
					amountError = true;
    			//returns error message for invalid characters
    			} else {
    				incomeErrorLabel.setText("Do not use " + c + " in the entry. Enter a valid number. ");
    				amountError = true;
    			}
    		}
		}	
		for (char c : centsString.toCharArray()) {
    		//Check if character is a digit
    		if (!Character.isDigit(c)) {
    			if (c == '-') {
    				incomeErrorLabel.setText("Amount should be positive");
					amountError = true;
    			//returns error message for invalid characters
    			} else {
    				incomeErrorLabel.setText("Do not use " + c + " in the entry. Enter a valid number. ");
    				amountError = true;
    			}
    		}
    		}
		
    	if (amountError == false) { 
    		try {
    			RecurringPayment incomeSource = new RecurringPayment(name, Integer.parseInt(dollarsString), Integer.parseInt(centsString));
    			incomeSource.setPeriod(Integer.parseInt(periodNumber.getText()), periodTime);
    			incomeList.addTransaction(incomeSource);
    		} catch (InvalidPaymentException e) {
    			incomeErrorLabel.setText(e.getMessage());
    		}
    	}
    	appStage.setScene(mainscene);
	}
	
	Label savingsErrorLabel = new Label();
	RecurringTransactionList savingsList = new RecurringTransactionList("Saved revenue");
	
		
			
		
	@FXML 
	void getSavings (ActionEvent enterSavings) {
		
		VBox savingsBox = new VBox();
		Label savingsTitle = new Label("Enter the amount of money you'd like to save over a certain period of time");
		
		
		HBox savingsToGet = new HBox();
		Label savingsDirectionsLabel = new Label("Amount in Dollars:");
		TextField savingsDollarsTextField = new TextField();
		Label savingsDirectCents = new Label ("Amount in Cents");
		TextField savingsCentsTextField = new TextField();
		savingsToGet.getChildren().addAll(savingsDirectionsLabel, savingsDollarsTextField, savingsDirectCents,savingsCentsTextField );
		
		HBox savingPeriod = new HBox();
		Label savingPeriodLabel = new Label ("Period to save over");
		TextField  savingPeriodNumber = new TextField();
		ChoiceBox<String> savingTime = new ChoiceBox<String>();
		savingTime.getItems().add("days");
		savingTime.getItems().add("weeks");
		savingTime.getItems().add("months");
		savingPeriod.getChildren().addAll(savingPeriodLabel,savingPeriodNumber,savingTime);
		
		 
		savingsBox.getChildren().addAll( savingsTitle, savingsToGet, savingPeriod);
		Scene savingScene = new Scene(savingsBox, 700, 700);
		appStage.setScene(savingScene);
		
		
	
		
				
		
		
		
		
	
	}	
	
	public int findBudget (Date startDate, Date endDate) {
		
		startDate = startDateField.getText();
		endDate = endDateField.getText();
		budget = savings + "incomelist".getTotalAmount(startDate, endDate) - "expenselist".getTotalAmount(startDate, endDate);
		
		
		
		return 0;
		
		
	}
	
	@FXML
	void getBudget (ActionEvent budgetEvent) {
		
		
		
		
	}
		

		
	
	
	
	
}

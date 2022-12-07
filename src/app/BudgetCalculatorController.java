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
	    private Label budgetLabel2;
	    

	    @FXML
	    void f50808(ActionEvent event) {

	    }
	    

	Label expenseErrorLabel = new Label("");
	    
	@FXML
	public void getExpense(ActionEvent enterExpenseEvent) {
    	Scene mainScene = appStage.getScene();
    	
    	VBox expenseBox = new VBox();
    	
    	HBox foodField = new HBox();
    		
    	Label foodEstimate = new Label("Estimate the value of your food expenses per month:");
    	Label foodDollarLabel = new Label("Dollars: ");
    	TextField foodExpenseDollars = new TextField();
    	Label foodCentsLabel = new Label("Cents: ");
    	TextField foodExpenseCents = new TextField();
    	foodField.getChildren().addAll(foodDollarLabel, foodExpenseDollars, foodCentsLabel, foodExpenseCents);
    		
    	HBox utilitiesField = new HBox();
    	Label utilitiesEstimate = new Label ("Enter the rough amount of money spent per month on utilities:");
    	Label uDollarLabel = new Label("Dollars: ");
    	TextField utilitiesDollars = new TextField();
    	Label uCentsLabel = new Label("Cents: ");
    	TextField utilitiesCents = new TextField();
    		
    	utilitiesField.getChildren().addAll(uDollarLabel, utilitiesDollars, uCentsLabel, utilitiesCents);
    		
    	HBox randomsField = new HBox();
    	Label randomEstimate = new Label ("Enter the amount of money you may spend on luxuries or miscellaneous monthly expenses");
    	Label rDollarLabel = new Label("Dollars: ");
    	TextField randomExpenseDollars = new TextField();
    	Label rCentsLabel = new Label("Cents: ");
    	TextField randomExpenseCents = new TextField();
    		
    	randomsField.getChildren().addAll(rDollarLabel, randomExpenseDollars, rCentsLabel, randomExpenseCents);
    		
    	Button eDoneButton = new Button ("Next");
    	eDoneButton.setOnAction(doneEvent -> getExpenseHelper(mainScene, foodExpenseDollars, foodExpenseCents, utilitiesDollars, utilitiesCents, randomExpenseDollars, randomExpenseCents));
    	
    	expenseBox.getChildren().addAll(foodEstimate, foodField, utilitiesEstimate, utilitiesField, randomEstimate, randomsField, expenseErrorLabel, eDoneButton);

    	
    	Scene expenseScene = new Scene (expenseBox, 700, 300);
    	appStage.setScene(expenseScene);
	}
	
	
	
	RecurringTransactionList recurringExpenseList = new RecurringTransactionList("Recurring Expenses");
	
	void getExpenseHelper(Scene mainScene, TextField foodExpenseDollars, TextField foodExpenseCents, TextField utilitiesDollars, TextField utilitiesCents, TextField randomExpenseDollars, TextField randomExpenseCents) {
		boolean amountError = false;
		for (char c : foodExpenseDollars.getText().toCharArray()) {
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
			for (char c : foodExpenseCents.getText().toCharArray()) {
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
		}
		if (amountError == false) {
			for (char c : utilitiesDollars.getText().toCharArray()) {
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

		
		}
		if (amountError == false) {
			for (char c : utilitiesCents.getText().toCharArray()) {
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
		
		}
		if (amountError == false) {
			for (char c : randomExpenseDollars.getText().toCharArray()) {
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
		
		}
		if (amountError == false) {
			for (char c : randomExpenseCents.getText().toCharArray()) {
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
		
		}
		
		int foodDollars = 0;
		int foodCents = 0;
		int utilDollars = 0;
		int utilCents = 0;
		int randDollars = 0;
		int randCents = 0;
		
		if (!(foodExpenseDollars.getText() == "")) {
			foodDollars = Integer.parseInt(foodExpenseDollars.getText());
		}
		if (!(foodExpenseCents.getText() == "")) {
			foodCents = Integer.parseInt(foodExpenseCents.getText());
		}
		if (!(utilitiesDollars.getText() == "")) {
			utilDollars = Integer.parseInt(utilitiesDollars.getText());
		}
		if (!(utilitiesCents.getText() == "")) {
			utilCents = Integer.parseInt(utilitiesCents.getText());
		}
		if (!(randomExpenseDollars.getText() == "")) {
			randDollars = Integer.parseInt(randomExpenseDollars.getText());
		}
		if (!(randomExpenseCents.getText() == "")) {
			randCents = Integer.parseInt(randomExpenseCents.getText());
		}
		
		if (amountError == false) {
			try {
				RecurringPayment food = new RecurringPayment("Food", foodDollars, foodCents, 30);
				recurringExpenseList.addTransaction(food);
			} catch (InvalidPaymentException e) {
    			expenseErrorLabel.setText(e.getMessage());
    		}
			try {
				RecurringPayment utilities = new RecurringPayment("Utilities", utilDollars, utilCents, 30);
				recurringExpenseList.addTransaction(utilities);
			} catch (InvalidPaymentException e) {
    			expenseErrorLabel.setText(e.getMessage());
    		}
			try {
				RecurringPayment food = new RecurringPayment("Miscellaneous", randDollars, randCents, 30);
				recurringExpenseList.addTransaction(food);
			} catch (InvalidPaymentException e) {
    			expenseErrorLabel.setText(e.getMessage());
    		}
		}
		
		appStage.setScene(mainScene);
	}
	
	Label incomeErrorLabel = new Label();
	RecurringTransactionList incomeList = new RecurringTransactionList("Sources of Income");
	
	@FXML
	void getIncome (ActionEvent enterIncome) {
		Scene mainScene = appStage.getScene();
		VBox incomeContainer = new VBox();
		Label primaryIncomeNamePrompt = new Label ("Enter a name for this income source:");
		HBox primaryIncomeNameBox = new HBox();
		Label primaryIncomeNameLabel = new Label ("Name:");
		TextField primaryIncomeName = new TextField();
		primaryIncomeNameBox.getChildren().addAll(primaryIncomeNameLabel, primaryIncomeName);
		
		Label primaryIncomeTitle = new Label ("Enter the amount of money you earn from this income source each payment:");
		HBox primaryIncomeContainer = new HBox();
		Label primaryIncomeLabelDollars = new Label ("Dollars: ");
		TextField primaryIncomeAmountDollars = new TextField();
		Label primaryIncomeLabelCents = new Label ("Cents:");
		TextField primaryIncomeAmountCents = new TextField();
		primaryIncomeContainer.getChildren().addAll(primaryIncomeLabelDollars, primaryIncomeAmountDollars, primaryIncomeLabelCents, primaryIncomeAmountCents);
		
		Label primaryIncomePeriodTitle = new Label ("Enter the period of this income source: (i.e. how often you get paid)");
		HBox primaryIncomePeriod = new HBox();
		Label primaryIncomePeriodLabel = new Label("Period of Income:");
		TextField primaryIncomePeriodNumber = new TextField();
		ChoiceBox<String> primaryIncomePeriodTime = new ChoiceBox<String>();
		
		primaryIncomePeriodTime.getItems().add("days");
		primaryIncomePeriodTime.getItems().add("weeks");
		primaryIncomePeriodTime.getItems().add("months");
		
		primaryIncomePeriod.getChildren().addAll(primaryIncomePeriodLabel, primaryIncomePeriodNumber, primaryIncomePeriodTime);
		
		Button doneButton = new Button ("Done");
		doneButton.setOnAction(doneEvent -> getIncomeHelper(mainScene, primaryIncomeAmountDollars, primaryIncomeAmountCents, primaryIncomePeriodNumber, primaryIncomePeriodTime.getValue(), primaryIncomeName.getText()));
		
		incomeContainer.getChildren().addAll(primaryIncomeNamePrompt, primaryIncomeNameBox, primaryIncomeTitle, primaryIncomeContainer,primaryIncomePeriodTitle, primaryIncomePeriod, incomeErrorLabel, doneButton);
		
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
	
		Label savingsErrorLabel = new Label("");		
		

	@FXML 
	void getSavings (ActionEvent enterSavings) {
		Scene mainScene = appStage.getScene();
		
		VBox savingsBox = new VBox();
		
		Label savingsStartLabel = new Label("Enter the date you would like to start budgeting from (day/month/year):");
		HBox startContainer = new HBox();
		ChoiceBox<String> startDateDay = new ChoiceBox<String>();
		startDateDay.getItems().addAll("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31");
		ChoiceBox<String> startDateMonth = new ChoiceBox<String>();
		startDateMonth.getItems().addAll("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
		TextField startDateYear = new TextField();
		startContainer.getChildren().addAll(startDateDay, startDateMonth, startDateYear);
		savingsBox.getChildren().addAll(savingsStartLabel, startContainer);
		
		Label savingsEndLabel = new Label("Enter the date you would like to stop budgeting until (day/month/year):");
		HBox endContainer = new HBox();
		ChoiceBox<String> endDateDay = new ChoiceBox<String>();
		endDateDay.getItems().addAll("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31");
		ChoiceBox<String> endDateMonth = new ChoiceBox<String>();
		endDateMonth.getItems().addAll("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
		TextField endDateYear = new TextField();
		endContainer.getChildren().addAll(endDateDay, endDateMonth, endDateYear);
		savingsBox.getChildren().addAll(savingsEndLabel, endContainer);
			
		Label savingsDirectionsLabel = new Label("Enter the amount of money you would like to save:");
		HBox savingsToGet = new HBox();
		Label savingsDollarLabel = new Label("Dollars:");
		TextField savingsDollarsTextField = new TextField();
		Label savingsCentsLabel = new Label ("Cents");
		TextField savingsCentsTextField = new TextField();
		savingsToGet.getChildren().addAll(savingsDollarLabel, savingsDollarsTextField, savingsCentsLabel, savingsCentsTextField);
		savingsBox.getChildren().addAll(savingsDirectionsLabel, savingsToGet);
		
		Label savedDirectionsLabel = new Label("Enter your current savings:");
		HBox savedMoneyBox = new HBox();
		Label savedDollarLabel = new Label("Dollars:");
		TextField savedDollarsTextField = new TextField();
		Label savedCentsLabel = new Label ("Cents");
		TextField savedCentsTextField = new TextField();
		savedMoneyBox.getChildren().addAll(savedDollarLabel, savedDollarsTextField, savedCentsLabel, savedCentsTextField);
		savingsBox.getChildren().addAll(savedDirectionsLabel, savedMoneyBox);

		
		// savingsLabel2.setText(String.format("%.2f",wantedSavingsDollars));

		Button sDoneButton = new Button ("Done");
		sDoneButton.setOnAction(doneEvent -> processSavings(mainScene, startDateDay, startDateMonth, startDateYear, endDateDay, endDateMonth, endDateYear, savingsDollarsTextField, savingsCentsTextField, savedDollarsTextField, savedCentsTextField));
		savingsBox.getChildren().addAll(savingsErrorLabel, sDoneButton);
		
		Scene savingsScene = new Scene (savingsBox);
		appStage.setScene(savingsScene);
	}
	
	Payment currentSavings = new Payment();
	Payment targetSavings = new Payment();
	Date startDate = new Date();
	Date endDate = new Date();

	void processSavings(Scene mainScene, ChoiceBox<String> startDateDay, ChoiceBox<String> startDateMonth, TextField startDateYear, ChoiceBox<String> endDateDay, ChoiceBox<String> endDateMonth, TextField endDateYear, TextField savingsDollarsTextField, TextField savingsCentsTextField, TextField savedDollarsTextField, TextField savedCentsTextField) {
		boolean dateError = false;
		boolean saveAmountError = false;
		for (char c : startDateYear.getText().toCharArray()) {
    		//Check if character is a digit
			if (!Character.isDigit(c)) {
    			dateError = true;
    			savingsErrorLabel.setText("Invalid Start Year");
    		}
		}
		if (dateError == false && saveAmountError == false) {
			for (char c : endDateYear.getText().toCharArray()) {
    		//Check if character is a digit
				if (!Character.isDigit(c)) {
					dateError = true;
					savingsErrorLabel.setText("Invalid End Year");
				}
			}
		}
		if (dateError == false && saveAmountError == false) {
			for (char c : savingsDollarsTextField.getText().toCharArray()) {
	    		//Check if character is a digit
				if (!Character.isDigit(c)) {
					saveAmountError = true;
					savingsErrorLabel.setText("Invalid Target Savings Dollar Amount");
	    		}
			}
		}
		if (dateError == false && saveAmountError == false) {
			for (char c : savingsCentsTextField.getText().toCharArray()) {
	    		//Check if character is a digit
				if (!Character.isDigit(c)) {
					saveAmountError = true;
					savingsErrorLabel.setText("Invalid Target Savings Cents Amount");
	    		}
			}
		}
		if (dateError == false && saveAmountError == false) {
			for (char c : savedDollarsTextField.getText().toCharArray()) {
	    		//Check if character is a digit
				if (!Character.isDigit(c)) {
					saveAmountError = true;
					savingsErrorLabel.setText("Invalid Current Savings Dollar Amount");
	    		}
			}
		}
		if (dateError == false && saveAmountError == false) {
			for (char c : savedCentsTextField.getText().toCharArray()) {
	    		//Check if character is a digit
				if (!Character.isDigit(c)) {
					saveAmountError = true;
					savingsErrorLabel.setText("Invalid Current Savings Cents Amount");
	    		}
			}
		}

		
		int targetDollars = 0;
		int targetCents = 0;
		int savedDollars = 0;
		int savedCents = 0;
		
		if (!(savedDollarsTextField.getText() == "")) {
			savedDollars = Integer.parseInt(savedDollarsTextField.getText());
		}
		if (!(savedDollarsTextField.getText() == "")) {
			savedCents = Integer.parseInt(savedCentsTextField.getText());
		}
		if (!(savingsDollarsTextField.getText() == "")) {
			targetDollars = Integer.parseInt(savingsDollarsTextField.getText());
		}
		if (!(savingsCentsTextField.getText() == "")) {
			targetCents = Integer.parseInt(savingsCentsTextField.getText());
		}
		
		
		if (dateError == false && saveAmountError == false) {
			try {
    			currentSavings = new Payment("Current Savings", savedDollars, savedCents);
    		} catch (InvalidPaymentException e) {
    			savingsErrorLabel.setText(e.getMessage());
    		}
			try {
    			targetSavings = new Payment("Target Savings", targetDollars, targetCents);
    		} catch (InvalidPaymentException e) {
    			savingsErrorLabel.setText(e.getMessage());
    		}
			String month = startDateMonth.getValue();
			int monthNumber = 0;
			if (month == "January") {
				monthNumber = 0;
			} else if (month == "February") {
				monthNumber = 1;
			} else if (month == "March") {
				monthNumber = 2;
			} else if (month == "April") {
				monthNumber = 3;
			} else if (month == "May") {
				monthNumber = 4;
			} else if (month == "June") {
				monthNumber = 5;
			} else if (month == "July") {
				monthNumber = 6;
			} else if (month == "August") {
				monthNumber = 7;
			} else if (month == "September") {
				monthNumber = 8;
			} else if (month == "October") {
				monthNumber = 9;
			} else if (month == "November") {
				monthNumber = 10;
			} else if (month == "December") {
				monthNumber = 11;
			}
			startDate = new Date(Integer.parseInt(startDateYear.getText()), monthNumber, Integer.parseInt(startDateDay.getValue()));
			String endMonth = endDateMonth.getValue();
			int endMonthNumber = 0;
			if (endMonth == "January") {
				endMonthNumber = 0;
			} else if (endMonth == "February") {
				endMonthNumber = 1;
			} else if (endMonth == "March") {
				endMonthNumber = 2;
			} else if (endMonth == "April") {
				endMonthNumber = 3;
			} else if (endMonth == "May") {
				endMonthNumber = 4;
			} else if (endMonth == "June") {
				endMonthNumber = 5;
			} else if (endMonth == "July") {
				endMonthNumber = 6;
			} else if (endMonth == "August") {
				endMonthNumber = 7;
			} else if (endMonth == "September") {
				endMonthNumber = 8;
			} else if (endMonth == "October") {
				endMonthNumber = 9;
			} else if (endMonth == "November") {
				endMonthNumber = 10;
			} else if (endMonth == "December") {
				endMonthNumber = 11;
			}
			endDate = new Date(Integer.parseInt(endDateYear.getText()), endMonthNumber, Integer.parseInt(endDateDay.getValue()));
			
			if (endDate.before(startDate)) {
				dateError = true;
			}
		}
		if (dateError == false && saveAmountError == false) {
			appStage.setScene(mainScene);
		}
	}
	
	long budget = 0;
	long netIncome = 0;
	long netExpense = 0;
	long currentSavingsAmount = 0;
	long targetSavingsAmount = 0;
	
	public void getFinal(ActionEvent finalCalc) {
		netIncome = incomeList.getTotalAmount(startDate, endDate);
		
		netExpense = 0 - recurringExpenseList.getTotalAmount(startDate, endDate);
		
		currentSavingsAmount = currentSavings.getDollars()*100 + currentSavings.getCents();
			
		targetSavingsAmount = targetSavings.getDollars()*100 + targetSavings.getCents();
			
		budget = netIncome - netExpense + currentSavingsAmount - targetSavingsAmount;
		
		if (budget >= 0) {
			budgetLabel2.setText("You have met your target savings of $" + (targetSavingsAmount/100) + "." + (targetSavingsAmount%100) + " with a surplus of $" + (budget/100) + "." + (budget%100));
		} else {
			budgetLabel2.setText("You were unable to meet your target savings of $" + (targetSavingsAmount/100) + "." + (targetSavingsAmount%100) + " and have a deficit of $" + (budget/100) + "." + (budget%100));
		}
		
		
		System.out.println("Net Income: " + netIncome);
		System.out.println("Net Expenses: " + netExpense);
		System.out.println("Current Savings: " + currentSavingsAmount);	
		System.out.println("Target Savings: " + targetSavingsAmount);	
		System.out.println("Your final budget is : $" + (budget/100) + "." + (budget%100));

	}
		

		
	
	
	
	
}

package app;

import javafx.event.ActionEvent;
import java.util.*;

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
	    private Label directionsLabel;

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
	    private Label savingsLabel2;

	    @FXML
	    private TextField NumOfUsersTextField;

	    @FXML
	    private Button getSavingsSceneLabel;

	    @FXML
	    private Button getExpensesButton;

	    @FXML
	    private Button RecordNumUsersButton;
	    
	    @FXML 
	    private Label numUsersLabel;
	    
	    @FXML
	    private Label budgetLabel;
	    
	    @FXML
	    private Button getBudgetButton;
	    
	    @FXML 
	    private Label budgetLabel2;

	    @FXML
	    void f50808(ActionEvent event) {

	    }
	    
  
  	int expense= 0;
  	public int calculateExpense (Scene mainScene, Label expenseLabel) {
  		appStage.setScene(mainScene);
  		return expense += Integer.parseInt(expenseLabel.getText());
  	}
	
	@FXML
	public void getExpense(ActionEvent enterExpenseEvent) {
    	Scene mainScene = appStage.getScene();
    	
    	int finExpense = 0;
    	VBox expenseBox = new VBox();{
    	
    		HBox foodField = new HBox();
    		
    		Label foodEstimate = new Label("Estimate the value of the food expenses per month.");
    		TextField foodExpenseDollars = new TextField();
    		TextField foodExpenseCents = new TextField();
    		foodField.getChildren().addAll(foodEstimate, foodExpenseDollars, foodExpenseCents);
    		
    		finExpense = finExpense + ((Integer.parseInt(foodExpenseDollars.getText()))+ ((Integer.parseInt(foodExpenseCents.getText())/ 100)));
    		
    		HBox utilitiesField = new HBox();
    		Label utilitiesEstimate = new Label ("Enter the rough amount of money spent per month on utilities.");
    		TextField utilitiesDollars = new TextField();
    		TextField utilitiesCents = new TextField();
    		
    		utilitiesField.getChildren().addAll(utilitiesEstimate, utilitiesDollars, utilitiesCents);
    		
    		finExpense = finExpense + ((Integer.parseInt(utilitiesDollars.getText()))+ ((Integer.parseInt(utilitiesCents.getText())/ 100)));
    		
    		HBox randomsField = new HBox();
    		Label randomEstimate = new Label ("Enter the amount of money you may spend on luxuries or random incidents requiring payment");
    		TextField randomExpenseDollars = new TextField();
    		TextField randomExpenseCents = new TextField();
    		
    		randomsField.getChildren().addAll(randomEstimate, randomExpenseDollars, randomExpenseCents);
    		
    		
    		
    		finExpense = finExpense + ((Integer.parseInt(randomExpenseDollars.getText()))+ ((Integer.parseInt(randomExpenseCents.getText())/ 100)));
    		expenseBox.getChildren().addAll(foodField, utilitiesField, randomsField);
    		expenseLabel.setText(String.format("%.2f", finExpense));
    	
    	Button eDoneButton = new Button ("Next");
    	eDoneButton.setOnAction(doneEvent -> calculateExpense(mainScene, expenseLabel));}
    	
    	Scene expenseScene = new Scene (expenseBox);
    	appStage.setScene(expenseScene);
		
    	
    	
    	
    		
    	

	}
 
    	
    
  





	

	









	int income = 0;
	
	void calculateIncome (Scene mainScene, Label incomeLabel) {
		appStage.setScene(mainScene);
		income = 0;
		income += Integer.parseInt(incomeLabel.getText());
		
		
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
		
		Scene primaryIncomeScene = new Scene(incomeContainer);
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
	
		int savings = 0;


		private Scene mainScene;
		public int getTotalSavings (Scene mainScene, Label savingsLabel2) {
			appStage.setScene(mainScene);
			savings =+ Integer.parseInt(savingsLabel2.getText());
			return savings;
		
			
		}
	@FXML 
	void getSavings (ActionEvent enterSavings) {
		
		VBox savingsBox = new VBox();{
		
		
		Label savingsStartLabel = new Label("Enter the date you would like to start budgeting from:");
		HBox startContainer = new HBox();
		ChoiceBox<int> startDateDay = new Choicebox<int>();
			
			
		HBox savingsToGet = new HBox();
		Label savingsDirectionsLabel = new Label("Enter the amount of money you would like to save.");
		Label savingsDollarLabel = new Label("Dollars:");
		TextField savingsDollarsTextField = new TextField();
		Label savingsCentsLabel = new Label ("Cents");
		TextField savingsCentsTextField = new TextField();
		int wantedSavingsDollars = 0;
		wantedSavingsDollars = ((Integer.parseInt(savingsDollarsTextField.getText()))+ ((Integer.parseInt(savingsCentsTextField.getText())/ 100)))
		;
		savingsToGet.getChildren().addAll(savingsDollarLabel, savingsDollarsTextField, savingsCentsLabel, savingsCentsTextField);
		savingsBox.getChildren().addAll(savingsDirectionsLabel, savingsToGet);
		
		savingsLabel2.setText(String.format("%.2f",wantedSavingsDollars));
		
		Button sDoneButton = new Button ("Done");
		sDoneButton.setOnAction(finEvent -> getTotalSavings(mainScene, savingsLabel2));}
		
		Scene savingsScene = new Scene (savingsBox);
		appStage.setScene(savingsScene);
		
		
		
				
		
		
		
		
	
	}
		
	void getFinal(ActionEvent finalCalc) {
	
		
		double budget = income + savings - expense;
		
	System.out.println("Your final budget is :" + budget);
	}
		

		
	
	
	
	
}

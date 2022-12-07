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
    		Label randomEstimate = new Label ("Estimate of randomExpenses");
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
    		
    		rPeriod.getChildren().addAll(rPeriodLabel, periodPayRa, rPeriods);
    		expenseBox.getChildren().addAll(foodField, foodPeriod, utilitiesField,uPeriod, randomsField, rPeriod);
    	
    	
    	Scene expenseScene = new Scene (expenseBox);
    	appStage.setScene(expenseScene);
		
    	
    	
    	
    		
    	

	}
 
    	
    
int income = 0;
	
	void calculateIncome (Scene mainScene, Label incomeLabel) {
		appStage.setScene(mainScene);
		income = 0;
		income += Integer.parseInt(incomeLabel.getText());
		
		
	}
	
	@FXML
	void getIncome (ActionEvent enterIncome) {
		Scene mainScene = appStage.getScene();
		
		VBox incomeContainer = new VBox();
		Label primaryIncomeTitle = new Label ("Enter the amount and period of your primary source of income:");
		HBox primaryIncomeContainer = new HBox();
		Label primaryIncomeLabel = new Label ("Amount in Dollars: ");
		TextField primaryIncomeAmount = new TextField();
		primaryIncomeContainer.getChildren().addAll(primaryIncomeLabel, primaryIncomeAmount);
		HBox primaryIncomePeriod = new HBox();
		Label primaryIncomePeriodLabel = new Label("Period of Income:");
		TextField primaryIncomePeriodNumber = new TextField();
		ChoiceBox<String> primaryIncomePeriodTime = new ChoiceBox<String>();
		
		primaryIncomePeriodTime.getItems().add("days");
		primaryIncomePeriodTime.getItems().add("weeks");
		primaryIncomePeriodTime.getItems().add("months");
		
		primaryIncomePeriod.getChildren().addAll(primaryIncomePeriodLabel, primaryIncomePeriodNumber, primaryIncomePeriodTime);
		
		incomeContainer.getChildren().addAll(primaryIncomeTitle, primaryIncomeContainer, primaryIncomePeriod);
		
		Scene primaryIncomeScene = new Scene(incomeContainer);
		appStage.setScene(primaryIncomeScene);
		
		
		
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
		Scene savingScene = new Scene(savingsBox);
		appStage.setScene(savingScene);
		
		
	
		
				
		
		
		
		
	
	}
		
	void getFinal(ActionEvent finalCalc) {
	
		
		double budget = income + savings - expense;
		
	System.out.println("Your final budget is :" + budget);
	}
		

		
	
	
	
	
}

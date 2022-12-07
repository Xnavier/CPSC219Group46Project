package app;

import javafx.event.ActionEvent;
import java.util.*;
import java.math.*;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
	@FXML
	void getIncome (ActionEvent enterIncome) {
		Scene mainScene = appStage.getScene();
		int finIncome = 0; 
		int stagef= 4;
    	
    	
    	
    		
		
		
	VBox incomeBox = new VBox();
	ArrayList<TextField> incomeFields = new ArrayList<TextField>();
	while (stagef > 0) {
		HBox fullTimeField = new HBox();
		Label incomeDirectionsLabel = new Label("Enter the approximate amount of money you make from your full time job per month.");
		TextField fullTimeDollars = new TextField();
		TextField fullTimeCents = new TextField();
		
		finIncome = finIncome + ((Integer.parseInt(fullTimeDollars.getText()))+ ((Integer.parseInt(fullTimeCents.getText())/ 100)));
		fullTimeField.getChildren().addAll(incomeDirectionsLabel, fullTimeDollars, fullTimeCents);
		
		
		HBox partTimeField = new HBox();
		Label partTimeDirectionsLabel = new Label ("enter the amount of money you make from any other streams of income.");
		TextField partTimeDollars= new TextField();
		TextField partTimeCents = new TextField();
		finIncome = finIncome + ((Integer.parseInt(partTimeDollars.getText()))+ ((Integer.parseInt(partTimeCents.getText())/ 100)));
		
		partTimeField.getChildren().addAll(partTimeDirectionsLabel, partTimeDollars, partTimeCents);
		
		incomeBox.getChildren().addAll(fullTimeField, partTimeField);
		incomeLabel.setText(String.format("%.2f", finIncome));
		
		
		
		Button iDoneButton = new Button("Next");
		iDoneButton.setOnAction(nextEvent -> calculateIncome(mainScene, incomeLabel) );
	}
	
		Scene incomeScene = new Scene(incomeBox);
		appStage.setScene(incomeScene);
		
		
		
		
	
		
		
		
		
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
		
		HBox savingsToGet = new HBox();
		Label savingsDirectionsLabel = new Label("Enter the amount of money you would like to save.");
		TextField savingsDollarsTextField = new TextField();
		TextField savingsCentsTextField = new TextField();
		int wantedSavingsDollars = 0;
		wantedSavingsDollars = ((Integer.parseInt(savingsDollarsTextField.getText()))+ ((Integer.parseInt(savingsCentsTextField.getText())/ 100)))
		;
		savingsToGet.getChildren().addAll(savingsDirectionsLabel, savingsDollarsTextField, savingsCentsTextField);
		savingsBox.getChildren().addAll(savingsToGet);
		
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

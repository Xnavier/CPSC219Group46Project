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
	    void f50808(ActionEvent event) {

	    }

	    
	    
	
	    public void recordUserNumber (ActionEvent recordEvent) {
	    	int numUser = Integer.parseInt(NumOfUsersTextField.getText());
	    	numUsersLabel.setText(String.format("%.2f users",numUser));
	    }
    
 
    		
    		
    		
   
    
    
    
 

	
  
  
  	double expense= 0.0;
  	public void calculateExpense (Scene mainScene, Label expenseLabel) {
  		appStage.setScene(mainScene);
  		expense += Integer.parseInt(expenseLabel.getText());
  	}
	
	@FXML
	void getExpense(ActionEvent enterExpenseEvent) {
    	Scene mainScene = appStage.getScene();
    	
    	int finExpense = 0;
    	
    	
    	VBox expenseBox = new VBox();
    		
    		HBox foodField = new HBox();
    		
    		Label foodEstimate = new Label("Estimate the value of the food expenses per month.");
    		TextField foodExpenseDollars = new TextField();
    		TextField foodExpenseCents = new TextField();
    		
    		finExpense = finExpense + ((Integer.parseInt(foodExpenseDollars.getText()))+ ((Integer.parseInt(foodExpenseCents.getText())/ 100)));
    		
    		HBox utilitiesField = new HBox();
    		Label utilitiesEstimate = new Label ("Enter the rough amount of money spent per month on utilities.");
    		TextField utilitiesDollars = new TextField();
    		TextField utilitiesCents = new TextField();
    		
    		finExpense = finExpense + ((Integer.parseInt(utilitiesDollars.getText()))+ ((Integer.parseInt(utilitiesCents.getText())/ 100)));
    		
    		HBox randomsField = new HBox();
    		Label randomEstimate = new Label ("Enter the amount of money you may spend on luxuries or random incidents requiring payment");
    		TextField randomExpenseDollars = new TextField();
    		TextField randomExpenseCents = new TextField();
    		
    		finExpense = finExpense + ((Integer.parseInt(randomExpenseDollars.getText()))+ ((Integer.parseInt(randomExpenseCents.getText())/ 100)));
    		
    		expenseLabel.setText(String.format("%.2f", finExpense));
    	
    	Button eDoneButton = new Button ("Next");
    	eDoneButton.setOnAction(doneEvent -> calculateExpense(mainScene, expenseLabel));
    	
    	
    	
    		
    	

	}
 
    	
    
  





	

	









	double income = 0.0;
	
	public void calculateIncome (Scene mainScene, Label incomeLabel) {
		appStage.setScene(mainScene);
		income += Integer.parseInt(incomeLabel.getText());
		
	}
	@FXML
	void getIncome (ActionEvent enterIncome) {
		Scene mainScene = appStage.getScene();
		int finIncome = 0; 
		
		
	VBox incomeBox = new VBox();
		HBox fullTimeField = new HBox();
		Label incomeDirectionsLabel = new Label("Enter the approximate amount of money you make from your full time job per month.");
		TextField fullTimeDollars = new TextField();
		TextField fullTimeCents = new TextField();
		
		finIncome = finIncome + ((Integer.parseInt(fullTimeDollars.getText()))+ ((Integer.parseInt(fullTimeCents.getText())/ 100)));
		
		HBox partTimeField = new HBox();
		Label partTimeDirectionsLabel = new Label ("enter the amount of money you make from any other streams of income.");
		TextField partTimeDollars= new TextField();
		TextField partTimeCents = new TextField();
		finIncome = finIncome + ((Integer.parseInt(partTimeDollars.getText()))+ ((Integer.parseInt(partTimeCents.getText())/ 100)));
		
		
		incomeLabel.setText(String.format("%.2f", finIncome));
		
		Button iDoneButton = new Button("Next");
		iDoneButton.setOnAction(nextEvent -> calculateIncome(mainScene, incomeLabel) );
		
	
		
		
		
		
	}
		double savings = 0;


		private Scene mainScene;
		public void getTotalSavings (Scene mainScene, Label savingsLabel2) {
			appStage.setScene(mainScene);
			savings =+ Integer.parseInt(savingsLabel2.getText());
		
			
		}
	@FXML 
	void getSavings (ActionEvent enterSavings) {
		
		VBox savingsBox = new VBox();
		
		HBox savingsToGet = new HBox();
		Label savingsDirectionsLabel = new Label("Enter the amount of money you would like to save.");
		TextField savingsDollarsTextField = new TextField();
		TextField savingsCentsTextField = new TextField();
		int wantedSavingsDollars = 0;
		wantedSavingsDollars = ((Integer.parseInt(savingsDollarsTextField.getText()))+ ((Integer.parseInt(savingsCentsTextField.getText())/ 100)));
		
		savingsLabel2.setText(String.format("%.2f",wantedSavingsDollars));
		
		Button sDoneButton = new Button ("Done");
		sDoneButton.setOnAction(doneEvent -> getTotalSavings(mainScene, savingsLabel2));
				
		
		
		
		
	
	}
		
	
	
	
		

		
	
	
	
	
}

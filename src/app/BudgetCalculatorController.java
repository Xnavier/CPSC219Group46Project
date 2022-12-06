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
	VBox expenseBox;
	VBox incomeBox;

	@FXML
	private Label invalidValueLabel;

    @FXML
    private Label directionsLabel;

    @FXML
    private Label expenseLabel;

    @FXML
    private Button getRandomSceneButton;

    @FXML
    private Label savingsLabel;

    @FXML
    private Label randomLabel;

    @FXML
    private TextField NumOfUsersTextField;

    @FXML
    private Button getSavingsSceneLabel;

    @FXML
    private Button getExpensesButton;

    @FXML
    private Button RecordNumUsersButton;
    
 
    		
    		
    		
   
    
    
    
 

	
  public  double getIncome (String valueEntered) {
    	
    	boolean validMoney = true;{
    		
    	}
    	
    	double finBudget = 0.0;
    	if (validMoney);
    		return finBudget = Double.parseDouble(valueEntered);
    	
    	
    }
  
  
  	double planExpense = 0.0;
  	void calculatePlanExpense (Scene mainScene, TextField planExpenseTextField) {
  		appStage.setScene(mainScene);
  		planExpense = Double.parseDouble(planExpenseTextField.getText());
  	}
	
	@FXML
	void getExpenseScene(ActionEvent enterExpenseEvent) {
    	Scene mainScene = appStage.getScene();
    	
    	int inputBoxes = 0; 
    	int numExpenses = 4;
    	while(inputBoxes<numExpenses) {
    	
    	VBox expenseBox = new VBox();
    		
    		HBox foodField = new HBox();
    		
    		Label foodEstimate = new Label("Estimate the value of the food expenses per month.");
    		TextField foodBox = new TextField();
    		foodBox.getText();
    		
    	
    	Button foodDoneButton = new Button ("Done");
    	foodDoneButton.setOnAction(doneEvent -> findTotalExpense(mainScene));
    	
    		
    	

	}
    	Scene plannedExpenseScene = new Scene(expenseBox);
    	
    
  




}
	
	double income = 0.0;
	
	void calculateIncome (Scene mainScene, TextField incomeTextField) {
		appStage.setScene(mainScene);
		income = Double.parseDouble(incomeTextField.getText());
		
	}
	@FXML
	void getIncome (ActionEvent enterIncome) {
		Scene mainScene = appStage.getScene();
		double finIncome = 0; 
		
		
	VBox incomeBox = new VBox();
		HBox fullTimeField = new HBox();
		Label incomeDirectionsLabel = new Label("Enter the approximate amount of money you make from your full time job per month.");
		TextField fullTimeTextField = new TextField();
		
		HBox partTimeField = new HBox();
		Label partTimeDirectionsLabel = new Label ("enter the amount of money you make from any other streams of income.");
		TextField partTimeTextField = new TextField();
		
		Button ptDoneButton = new Button ("Next");
		
		
		Button ftDoneButton = new Button("Next");
		ftDoneButton.setOnAction(nextEvent -> calculateIncome(mainScene, incomeTextField) );
		incomeBox.getChildren().addAll(partTimeField, partTimeDirectionsLabel,partTimeTextField);
	
	
		
		
		
		
	}
	Scene incomeScene = new Scene(incomeBox); 
	
	
	@FXML
	void calculateBudget (ActionEvent calculate) {
		
		double finBudget = 0.0;
		
		finBudget = finBudget + income;
		finBudget = finBudget - planExpense;
		finBudget = finBudget - randomExpense;
		finBudget = finBudget + saveForecast;
		
	}
	
	
	
}

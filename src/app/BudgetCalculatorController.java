package app;

import javafx.event.ActionEvent;
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
    
    
    float getDollarNumber (String valueEntered) {
    	
    	boolean validNumber = true;
    	for (char c: valueEntered.toCharArray()) {
    		if ((!Character.isDigit(c))) {
    			validNumber = false;
    			invalidValueLabel.setText("" + c + " is not a valid entry. Please re-enter your value.");
    		}
    		else if ((!(c == '.'))) {
    			validNumber = false;
    		}
    		float dollarNumber = 0; 
    		if (validNumber)
    			dollarNumber = Float.parseFloat(valueEntered);
    		
    		
    	
    	}
		
    	
    }
    
    
    
    int totalExpense = 0;
    
    
    void findTotalExpense(Scene mainScene) {
    	appStage.setScene(mainScene);
    	totalExpense = 0;
    	
    	
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
	@FXML
	void getIncomeScene (ActionEvent enterIncomeEvent) {
		
	VBox incomeBox = new VBox();
		HBox fullTimeField = new HBox();
		Label incomeDirectionsLabel = new Label("Enter the approximate amount of money you make from your full time job per month.");
		TextField fullTimeTextField = new TextField();
		fullTimeTextField.getText();
		
	Button ftDoneButton = new Button("Next");
	
		HBox partTimeField = new HBox();
		Label partTimeDirectionsLabel = new Label ("enter the amount of money you make from any other streams of income.");
		
	}
	Scene incomeScene = new Scene(incomeBox); 
}

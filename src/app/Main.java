package app;

import javafx.application.Application;

import java.io.FileInputStream;

import app.BudgetCalculatorController;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

/**
 * Main class of the budget calculator. Calls the main scene of the calculator.
 */

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		try { FXMLLoader loader = new FXMLLoader();
		VBox root = loader.load(new FileInputStream("src/app/BudgetMainSceneView.fxml"));
		BudgetCalculatorController controller = (BudgetCalculatorController)loader.getController();
		controller.appStage = primaryStage;
		Scene scene = new Scene(root,800,500);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Group 46 Budget Calculator");
		primaryStage.show();
	} catch(Exception e) {
		e.printStackTrace();
	}
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}

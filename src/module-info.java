module CPSC219Group46Project {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	
	
	
	opens app to javafx.graphics, javafx.fxml;
}

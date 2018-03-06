package edu.carrollcc.cis232.example4gridpane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneApp extends Application {

	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("GridPane Example");

		Button btnYes = new Button("Yes");
		Button btnNo = new Button("No");

		Label lblQuestion = new Label("Aren't gridpanes amazing?");

		GridPane gp = new GridPane();
		gp.setHgap(30);
		gp.setVgap(10);

		gp.setPadding(new Insets(50));

		gp.add(lblQuestion, 0, 0, 2, 1);
		gp.add(btnYes, 0, 1);
		gp.add(btnNo, 1, 1);

		Scene scene = new Scene(gp);
		primaryStage.setScene(scene);

		primaryStage.show();
	}
}

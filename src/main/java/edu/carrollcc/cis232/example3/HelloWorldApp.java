package edu.carrollcc.cis232.example3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloWorldApp extends Application {

	//Now with spacing!

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Hello World App");

		Label lblHello = new Label("Hello Everyone!");
		Button button = new Button("Click Me!");

		VBox vbox = new VBox(10, lblHello, button);
		vbox.setAlignment(Pos.CENTER);
		vbox.setPadding(new Insets(50));

		Scene scene = new Scene(vbox);

		primaryStage.setScene(scene);

		primaryStage.show();
	}
}

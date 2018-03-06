package edu.carrollcc.cis232.example6textfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

public class TextApp extends Application{

	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		TextField myTextField = new TextField();
		Button submit = new Button("Submit");
		HBox hbox = new HBox(myTextField, submit);

		Scene scene = new Scene(hbox);

		primaryStage.setScene(scene);
		primaryStage.setTitle("Text App");
		primaryStage.show();

		submit.setOnAction(event -> {
			System.out.println(myTextField.getText());
			myTextField.setText("");
		});
	}
}

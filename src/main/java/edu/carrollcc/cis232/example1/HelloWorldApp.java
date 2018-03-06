package edu.carrollcc.cis232.example1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloWorldApp extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	class ClickCounter{
		int count = 0;
		public int increment(){
			return ++count;
		}
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Hello World App");

		Label lblHello = new Label("Hello Everyone!");
		Button button = new Button("Click Me!");

		//This option uses an anonymous class with an inner field
//		button.setOnAction(new EventHandler<ActionEvent>(){
//			int clickTimes = 0;
//			@Override
//			public void handle(ActionEvent event) {
//				clickTimes += 1;
//				String time = "time";
//				if(clickTimes > 1){
//					time = "times";
//				}
//				lblHello.setText(String.format("You clicked it %d %s!", clickTimes, time));
//				System.out.println("Button was clicked!");
//			}
//		});

		//This option uses a lambda expression with the click counter object
//		ClickCounter counter = new ClickCounter();
//		button.setOnAction(event -> {
//			int clickTimes = counter.increment();
//			lblHello.setText(String.format("You clicked it %d time%s!", clickTimes, clickTimes > 1 ? "s" : ""));
//			System.out.println("Button was clicked!");
//		});


		//Using an anonymous inner class
//		button.setOnAction(new EventHandler<ActionEvent>(){
//			@Override
//			public void handle(ActionEvent event) {
//				lblHello.setText("Button was clicked!");
//			}
//		});

		//button.setOnAction(event -> lblHello.setText("Button was clicked!"));

		VBox vbox = new VBox(lblHello, button);
		vbox.setAlignment(Pos.CENTER);

		Scene scene = new Scene(vbox, 300, 100);

		primaryStage.setScene(scene);

		primaryStage.show();
	}
}

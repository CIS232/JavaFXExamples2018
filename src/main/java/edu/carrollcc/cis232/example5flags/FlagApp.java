package edu.carrollcc.cis232.example5flags;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FlagApp extends Application {

	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Image flag1 = new Image("https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/1280px-Flag_of_the_United_States.svg.png",
				300, 200, false, true);
		Image flag2 = new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Flag_of_Kazakhstan.svg/1000px-Flag_of_Kazakhstan.svg.png",
				300, 200, false, true);

		ImageView ivFlag1 = new ImageView(flag1);
		ImageView ivFlag2 = new ImageView(flag2);


		VBox vbox = new VBox(ivFlag1, ivFlag2);

		GridPane gridPane = new GridPane();

		gridPane.add(new Label("Flags of US and Kazakhstan"), 0, 0);
		gridPane.add(vbox, 1, 0);

		Scene scene = new Scene(gridPane);

		primaryStage.setTitle("Flags.");
		primaryStage.setScene(scene);
		primaryStage.show();

	}
}

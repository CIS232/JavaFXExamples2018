package edu.carrollcc.cis232.example2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ImageApp extends Application{

	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Image App");

		Image img = new Image("file:HotAirBalloon.jpg");
		ImageView imageView = new ImageView(img);

		HBox hbox = new HBox(imageView);
		Scene scene = new Scene(hbox);
		primaryStage.setScene(scene);

		primaryStage.show();
	}
}

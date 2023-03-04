package main;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainApplication extends Application {

	public static double recomW = 2560;
	public static double recomH = 1440;
	
	public static double W;
	public static double H;
	
	public static double scaleW;
	public static double scaleH;
	
	public static int FPS = 60;
	
	public Stage stage;
	
	public MainApplication() {
		
	}
	
	private void initialize() {
		
	}  
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		this.stage = stage;
		this.stage.setMaximized(true);
		this.stage.initStyle(StageStyle.UNDECORATED);
		this.stage.setTitle("PokemAX Emerald");
		
		this.stage.show();
		
		W = stage.getWidth();
		H = stage.getHeight();
		
		System.out.println(W + " x " + H);
		
		stage.setScene(new Scene(new Group()));
	}
	
}

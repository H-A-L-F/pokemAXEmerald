package main;

import constants.SceneEnums;
import controllers.SceneController;
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
	
	private SceneController sController;
	
	private void initialize() {
		this.sController = new SceneController(this);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		initialize();
		
		this.stage = stage;
		this.stage.setMaximized(true);
		this.stage.initStyle(StageStyle.UNDECORATED);
		this.stage.setTitle("PokemAX Emerald");
		
		this.stage.show();
		
		this.stage.setResizable(false);
		this.stage.setScene(sController.makeScene(SceneEnums.TITLE_SCENE));
		this.stage.sizeToScene();
		
		W = stage.getWidth();
		H = stage.getHeight();
		
		System.out.println(W + " x " + H);
		
		this.stage.show();
	}
	
}

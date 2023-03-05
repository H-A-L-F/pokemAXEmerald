package main;

import constants.SceneEnums;
import controllers.SceneController;
import controllers.SoundController;
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
	public static double MUSIC_VOL = 0.5;
	public static double SFX_VOL = 0.5;
	
	public Stage stage;
	
	private SceneController sceneController;
	private SoundController soundController;
	
	private void initialize() {
		this.sceneController = new SceneController(this);
		this.soundController = SoundController.getInstance();
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		initialize();
		
		this.stage = stage;
		this.stage.setMaximized(true);
		this.stage.initStyle(StageStyle.UNDECORATED);
		this.stage.setTitle("PokemAX Emerald");
		
		soundController.setMusicVolume(MUSIC_VOL);
		soundController.setSoundVolume(SFX_VOL);
		
		this.stage.setResizable(false);
		this.stage.setScene(sceneController.makeScene(SceneEnums.TITLE_SCENE));
		this.stage.sizeToScene();
		
		W = stage.getWidth();
		H = stage.getHeight();
		
		System.out.println(W + " x " + H);
		
		this.stage.show();
	}
	
}

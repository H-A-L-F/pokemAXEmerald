package views;


import controllers.SoundController;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import main.MainApplication;

public abstract class SceneView {
	
	protected StackPane sp;
	protected Scene scene;
	
	protected SoundController sc;
	protected MainApplication app;
	
	public abstract void initComponents();
	
	public abstract StackPane addComponents();
	
	public abstract Scene initScene();
	
	public void generateScene(MainApplication app) {
		this.sc = SoundController.getInstance();
		this.app = app;
		this.initComponents();
		this.sp = this.addComponents();
		this.scene = this.initScene();
	}
	
	public StackPane getStackPane() {
		return sp;
	}

	public void setStackPane(StackPane sp) {
		this.sp = sp;
	}

	public Scene getScene() {
		return scene;
	}

	public void setScene(Scene scene) {
		this.scene = scene;
	}
}

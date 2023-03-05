package views;


import constants.AssetEnums;
import controllers.SoundController;
import javafx.beans.binding.DoubleBinding;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
	
	public void onStart() {
	}
	
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
	
	public ImageView createImageViewBindW(AssetEnums a, DoubleBinding w) {
		ImageView iv = new ImageView(new Image(getClass().getResourceAsStream(a.getSrc())));
		iv.fitWidthProperty().bind(w);
		iv.setPreserveRatio(true);
		iv.setSmooth(true);
		iv.setCache(true);
		
		return iv;
	}
	
	public ImageView createImageViewBindH(AssetEnums a, DoubleBinding h) {
		ImageView iv = new ImageView(new Image(getClass().getResourceAsStream(a.getSrc())));
		iv.fitHeightProperty().bind(h);
		iv.setPreserveRatio(true);
		iv.setSmooth(true);
		iv.setCache(true);
		
		return iv;
	}
}

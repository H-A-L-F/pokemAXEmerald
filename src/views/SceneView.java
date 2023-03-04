package views;

import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import main.MainApplication;

public abstract class SceneView {
	
	protected StackPane sp;
	protected Scene scene;
	protected MainApplication app;
	
	public abstract void initComponents();
	
	public abstract void addComponents();
	
	public abstract void initScene();
	
	
}

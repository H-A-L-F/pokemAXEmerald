package controllers;

import java.util.HashMap;

import constants.SceneEnums;
import javafx.scene.Scene;
import main.MainApplication;
import views.SceneView;
import views.TitleSceneView;

public class SceneController {
	private HashMap<SceneEnums, SceneView> scenes;
	
	private MainApplication app;
	
	public SceneController(MainApplication app) {
		scenes = new HashMap<>();
		
		this.app = app;
		
		initialize();
	}
	
	private void initialize() {
		scenes.put(SceneEnums.TITLE_SCENE, new TitleSceneView());
	}
	
	public Scene makeScene(SceneEnums s) {
		SceneView scene = scenes.get(s);
		
		scene.generateScene(app);
		scene.onStart();
		
		return scene.getScene();
	}
}

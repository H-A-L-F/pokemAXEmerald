package views;

import constants.AssetEnums;
import constants.FontEnums;
import constants.SoundEnums;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import main.MainApplication;

public class TitleSceneView extends SceneView {
	
	private final double TITLE_SCALE = 0.3;
	private final double TITLE_TOP_SPACE = 0.08;
	
	@Override
	public void onStart() {
		sc.playMusic(SoundEnums.TITLE_THEME);
	}

	@Override
	public void initComponents() {
		this.sp = new StackPane();
	}

	public StackPane addComponents() {
		addCustBg();
		addCustTitle();
		addCustText();
		
		return this.sp;
	}
	
	private void addCustText() {
		Text text = new Text("PRESS ENTER");
		text.setFont(FontEnums.RBYGSC.getFont());
		
		sp.getChildren().add(text);
		
		StackPane.setAlignment(text, Pos.CENTER);
	}
	
	private void addCustTitle() {
		ImageView title = createImageViewBindW(AssetEnums.TITLE_TEXT, sp.widthProperty().multiply(TITLE_SCALE));
		
		sp.getChildren().add(title);
		
		StackPane.setAlignment(title, Pos.TOP_CENTER);
		StackPane.setMargin(title, new Insets(MainApplication.H * TITLE_TOP_SPACE ,0,0,0));
	}
	
	private void addCustBg() {
		Image image = new Image(getClass().getResourceAsStream("/assets/EmeraldTitleBg.png"));
		BackgroundSize bgSize = new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, false, true);
		BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, bgSize);
		sp.setBackground(new Background(backgroundImage));
	}

	@Override
	public Scene initScene() {
		this.scene = new Scene(sp);
		
		return scene;
	}

}

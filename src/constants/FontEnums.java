package constants;

import javafx.scene.text.Font;

public enum FontEnums {
	RBYGSC("/fonts/PKMN_RBYGSC.ttf");
	
	private final String src;
	private final Font font;
	
	private FontEnums(String src) {
		this.src = src;
		this.font = Font.loadFont(getClass().getResourceAsStream(src), 24);
	}
	
	public String getSrc() {
		return src;
	}
	
	public Font getFont() {
		return font;
	}
}

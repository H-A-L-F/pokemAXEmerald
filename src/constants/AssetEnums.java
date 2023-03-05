package constants;

public enum AssetEnums {
	TITLE_BG("/assets/EmeraldTitleBg.png"),
	TITLE_TEXT("/assets/pokemAXEmerald.png");
	
	private final String src;

	private AssetEnums(String src) {
		this.src = src;
	}

	public String getSrc() {
		return src;
	}
	
}

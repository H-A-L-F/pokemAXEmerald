package constants;

public enum SoundEnums {
	// MUSICS
	TITLE_THEME("/sounds/musics/TitleTheme.mp3", 0);
	
	private final String src;
	private final int idx;
	
	private SoundEnums(String src, int idx) {
		this.src = src;
		this.idx = idx;
	}

	public String getSrc() {
		return src;
	}

	public int getIdx() {
		return idx;
	}
}

package controllers;

import java.util.HashMap;

import javafx.scene.media.AudioClip;
import javafx.scene.media.MediaPlayer;

public class SoundController {
	
	private HashMap<Integer, AudioClip> sfxs;
	private HashMap<Integer, MediaPlayer> musics;
		
	public static SoundController instance;
	
	private SoundController() {
		this.sfxs = new HashMap<>();
		this.musics = new HashMap<>();
	}
	
	public SoundController getInstance() {
		if(instance == null) instance = new SoundController();
		return instance;
	}
}

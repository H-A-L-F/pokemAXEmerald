package controllers;

import java.util.HashMap;

import constants.SoundEnums;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class SoundController {
	
	private HashMap<Integer, AudioClip> sfxs;
	private HashMap<Integer, MediaPlayer> musics;
		
	public static SoundController instance;
	
	private SoundController() {
		this.sfxs = new HashMap<>();
		this.musics = new HashMap<>();
		
		loadSounds();
	}
	
	public static SoundController getInstance() {
		if(instance == null) instance = new SoundController();
		return instance;
	}
	
	private void loadSounds() {
		loadMusic(SoundEnums.TITLE_THEME);
	}
	
	private void loadSFX(SoundEnums s) {
		this.sfxs.put(s.getIdx(), loadAudioClip(s.getSrc()));
	}
	
	private void loadMusic(SoundEnums s) {
		this.musics.put(s.getIdx(), loadMusic(s.getSrc()));
	}
	
	public MediaPlayer loadMusic(String path) {
		Media m = new Media(getClass().getResource(path).toExternalForm());
		return new MediaPlayer(m);
	}
	
	public MediaPlayer loadMusic(String path, double vol) {
		Media m = new Media(getClass().getResource(path).toExternalForm());
		MediaPlayer mp = new MediaPlayer(m);
		mp.setVolume(vol);
		return mp;
	}
	
	public AudioClip loadAudioClip(String path) {
		return new AudioClip(getClass().getResource(path).toExternalForm());
	}
	
	public AudioClip loadAudioClip(String path, double vol) {
		AudioClip a = new AudioClip(getClass().getResource(path).toExternalForm());
		a.setVolume(vol);
		return a;
	}
	
	public void playSfx(SoundEnums s) {
		this.sfxs.get(s.getIdx()).play();
	}
	
	public void playMusic(SoundEnums s) {
		this.musics.get(s.getIdx()).play();
		this.musics.get(s.getIdx()).setCycleCount(MediaPlayer.INDEFINITE);
	}
	
	public void pauseMusic(SoundEnums s) {
		this.musics.get(s.getIdx()).pause();
	}
	
	public void stopMusic(SoundEnums s) {
		this.musics.get(s.getIdx()).stop();
	}
	
	public void setMusicVolume(double vol) {
		this.musics.forEach((k, v) -> {
			v.setVolume(vol);
			System.out.println("a" + v.getVolume() + " " + vol);
		});
	}
	
	public void setSoundVolume(double vol) {
		this.sfxs.forEach((k, v) -> {
			v.setVolume(vol);
		});
	}
}

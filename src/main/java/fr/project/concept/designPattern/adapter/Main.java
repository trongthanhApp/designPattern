package fr.project.concept.designPattern.adapter;

import fr.project.concept.designPattern.adapter.advancedMedia.IAdvancedMediaPlayer;
import fr.project.concept.designPattern.adapter.advancedMedia.KmAdvancedMediaPlayer;
import fr.project.concept.designPattern.adapter.advancedMedia.VlcAdvancedMediaPlayer;
import fr.project.concept.designPattern.adapter.media.AdapterMediaPlayer;
import fr.project.concept.designPattern.adapter.media.AudioMediaPlayer;

public class Main {

	public static void main(String[] args) {

		// play basic audio media player
		AudioMediaPlayer audioMediaPlayer = new AudioMediaPlayer();
		audioMediaPlayer.play("fileAudio");

		// play advanced media in MediaPlayer need Adapter
		IAdvancedMediaPlayer vlcAdvancedMediaPlayer = new VlcAdvancedMediaPlayer();
		AdapterMediaPlayer adapterMediaPlayerVlc = new AdapterMediaPlayer(vlcAdvancedMediaPlayer);
		adapterMediaPlayerVlc.play("fileMp4");

		// play advanced media in MediaPlayer need Adapter
		IAdvancedMediaPlayer kmAdvancedMediaPlayer = new KmAdvancedMediaPlayer();
		AdapterMediaPlayer adapterMediaPlayerKm = new AdapterMediaPlayer(kmAdvancedMediaPlayer);
		adapterMediaPlayerKm.play("fileAvi");
	}
}

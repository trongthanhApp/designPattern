package fr.project.concept.designPattern.adapter.media;

import fr.project.concept.designPattern.adapter.advancedMedia.IAdvancedMediaPlayer;

public class AdapterMediaPlayer implements IMediaPlayer{

	private IAdvancedMediaPlayer advancedMediaPlayer;

	public AdapterMediaPlayer(IAdvancedMediaPlayer advancedMediaPlayer) {
		super();
		this.advancedMediaPlayer = advancedMediaPlayer;
	}

	@Override
	public void play(String fileName) {
		advancedMediaPlayer.play(fileName);
	}

}

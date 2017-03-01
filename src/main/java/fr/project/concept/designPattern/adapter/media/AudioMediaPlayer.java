package fr.project.concept.designPattern.adapter.media;

public class AudioMediaPlayer implements IMediaPlayer{

	@Override
	public void play(String fileName) {
		System.out.println("Play file by audio media player : " + fileName);
	}

}

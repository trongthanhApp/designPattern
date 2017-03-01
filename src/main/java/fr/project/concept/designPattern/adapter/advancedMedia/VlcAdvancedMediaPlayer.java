package fr.project.concept.designPattern.adapter.advancedMedia;

public class VlcAdvancedMediaPlayer implements IAdvancedMediaPlayer{

	@Override
	public void play(String fileName) {
		System.out.println("Play file by vlc advanced media player : " + fileName);
	}

}

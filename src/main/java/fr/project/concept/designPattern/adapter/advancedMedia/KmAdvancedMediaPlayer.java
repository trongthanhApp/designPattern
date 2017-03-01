package fr.project.concept.designPattern.adapter.advancedMedia;

public class KmAdvancedMediaPlayer implements IAdvancedMediaPlayer{

	@Override
	public void play(String fileName) {
		System.out.println("Play file by KM advanced media player : " + fileName);
	}

}

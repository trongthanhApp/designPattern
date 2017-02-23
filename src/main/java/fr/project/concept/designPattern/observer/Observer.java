package fr.project.concept.designPattern.observer;

import fr.project.concept.designPattern.observer.observable.Observable;

public interface Observer {

	public void update();

	public void setSubject(Observable sub);
}

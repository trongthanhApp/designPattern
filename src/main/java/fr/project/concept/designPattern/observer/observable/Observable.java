package fr.project.concept.designPattern.observer.observable;

import fr.project.concept.designPattern.observer.Observer;

public interface Observable {

	public void register(Observer o);
	public void unregister(Observer o);

	public void notifyObservers();
	public Object getUpdate(Observer obj);
}

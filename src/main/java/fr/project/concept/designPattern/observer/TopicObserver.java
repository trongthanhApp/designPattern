package fr.project.concept.designPattern.observer;

import fr.project.concept.designPattern.observer.observable.Observable;

public class TopicObserver implements Observer{
	private String name;
	private Observable topic;

	public TopicObserver(String nm){
		this.name=nm;
	}
	@Override
	public void update() {
		String msg = (String) topic.getUpdate(this);
		if(msg == null){
			System.out.println(name+":: No new message");
		}else
			System.out.println(name+":: Consuming message::"+msg);
	}

	@Override
	public void setSubject(Observable sub) {
		this.topic=sub;
	}
}

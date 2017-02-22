package fr.project.concept.designPattern.factoryMethod.factory;

import fr.project.concept.designPattern.factoryMethod.document.Document;

public abstract class AbstractDocumentFactory {

	// method factory
	public abstract Document buildDocument();
	
	// call method factory in operation, open close principle, no if statement
	public void open() {
		Document document = buildDocument();
		document.open();
	}
	
}

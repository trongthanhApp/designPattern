package fr.project.concept.designPattern.factoryMethod.factory;

import fr.project.concept.designPattern.factoryMethod.document.Document;
import fr.project.concept.designPattern.factoryMethod.document.impl.PdfDocumentImpl;

public class PdfDocumentFactory extends AbstractDocumentFactory{

	@Override
	public Document buildDocument() {
		return new PdfDocumentImpl();
	}

}

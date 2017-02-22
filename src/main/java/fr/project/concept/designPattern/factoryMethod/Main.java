package fr.project.concept.designPattern.factoryMethod;

import fr.project.concept.designPattern.factoryMethod.factory.HtmlDocumentFactory;
import fr.project.concept.designPattern.factoryMethod.factory.PdfDocumentFactory;

public class Main {

	public static void main(String[] args) {
		PdfDocumentFactory pdfDocument = new PdfDocumentFactory();
		pdfDocument.open();
		
		HtmlDocumentFactory htmlDocument = new HtmlDocumentFactory();
		htmlDocument.open();
	}
}

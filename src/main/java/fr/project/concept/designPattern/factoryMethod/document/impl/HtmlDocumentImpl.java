package fr.project.concept.designPattern.factoryMethod.document.impl;

import fr.project.concept.designPattern.factoryMethod.document.Document;

public class HtmlDocumentImpl implements Document{

	@Override
	public void open() {
		System.out.println("Open html document");
	}

}

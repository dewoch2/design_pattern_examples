package fr.designpattern.construction.prototype.liasses;

import java.util.List;

import fr.designpattern.construction.prototype.documents.Document;

public abstract class Liasse {
	
	protected List<Document> documents;
	
	public List<Document> getDocuments(){
		
		return documents;
	}

}

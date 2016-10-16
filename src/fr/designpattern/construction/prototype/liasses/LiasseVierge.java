package fr.designpattern.construction.prototype.liasses;

import java.util.ArrayList;

import fr.designpattern.construction.prototype.documents.Document;

public class LiasseVierge extends Liasse {

	private static LiasseVierge instance = null;
	
	private LiasseVierge(){
		
		documents = new ArrayList<Document>();
	}
	
	public static LiasseVierge getInstance(){
		
		if(instance == null)
			instance = new LiasseVierge();
	
		return instance;
	}
	
	public void ajoute(Document doc){
		
		documents.add(doc);
	}
	
	public void retire(Document doc){
		
		documents.remove(doc);
	}
}

package fr.designpattern.construction.prototype.documents;

public abstract class Document implements Cloneable{
	
	protected String contenu = null;
	
	public Document duplique(){
		
		Document resultat;
		
		try {
			resultat = (Document)this.clone();
		} catch (CloneNotSupportedException e) {
			
			return null;
		}
		
		return resultat;
		
	}
	
	public void remplit(String informations){
		
		contenu = informations;
	}
	
	public abstract void imprime();
	public abstract void affiche();

}

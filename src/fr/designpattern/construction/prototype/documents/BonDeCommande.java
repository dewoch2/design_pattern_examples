package fr.designpattern.construction.prototype.documents;

public class BonDeCommande extends Document {

	@Override
	public void imprime() {
		
		System.out.println("Imprime le bon de commande : " + contenu);

	}

	@Override
	public void affiche() {
		
		System.out.println("Affiche le bon de commande : " + contenu);

	}

}

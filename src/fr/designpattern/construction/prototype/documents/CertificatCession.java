package fr.designpattern.construction.prototype.documents;

public class CertificatCession extends Document {

	@Override
	public void imprime() {
		
		System.out.println("Imprime le certificat de cession : " + contenu);

	}

	@Override
	public void affiche() {

		System.out.println("Affiche le certificat de cession : " + contenu);

	}

}

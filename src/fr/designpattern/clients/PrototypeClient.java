package fr.designpattern.clients;

import fr.designpattern.construction.prototype.documents.BonDeCommande;
import fr.designpattern.construction.prototype.documents.CertificatCession;
import fr.designpattern.construction.prototype.documents.DemandeImmatriculation;
import fr.designpattern.construction.prototype.liasses.LiasseClient;
import fr.designpattern.construction.prototype.liasses.LiasseVierge;

public final class PrototypeClient {
	
	private PrototypeClient(){
		
		throw new AssertionError("Instantiating utility class...");
		
	}

	public static void main(String[] args) {

		//initialisation de la liasse vierge
		LiasseVierge liasseVierge = LiasseVierge.getInstance();
		liasseVierge.ajoute(new BonDeCommande());
		liasseVierge.ajoute(new CertificatCession());
		liasseVierge.ajoute(new DemandeImmatriculation());
		
		//création d'une nouvelle liasse pour deux clients
		LiasseClient liasseClient1 = new LiasseClient("Martin");
		LiasseClient liasseClient2 = new LiasseClient("Durant");
		
		liasseClient1.affiche();
		liasseClient2.affiche();

	}

}

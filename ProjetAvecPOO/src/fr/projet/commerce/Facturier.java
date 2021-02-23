package fr.projet.commerce;

import java.util.ArrayList;

public final class Facturier {
	private ArrayList<Facture> listeDesFactures;
	
	public void ajouterFacture(Facture facture) {
		listeDesFactures.add(facture);
	}
	
	public void afficherFacture(int numeroFacture) {
		if (numeroFacture < listeDesFactures.size()) {
			System.out.println(listeDesFactures.get(numeroFacture).toString());
		} else {
			System.out.println("Facture inexistante ");
		}
	}
	
	
}

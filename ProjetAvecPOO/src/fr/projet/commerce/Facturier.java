package fr.projet.commerce;

import java.util.ArrayList;

public final class Facturier {
	private ArrayList<Facture> listeDesFactures;
	
	public Facturier() {
		listeDesFactures = new ArrayList<Facture>();
	}
	
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
	
	public void afficherFacturier() {
		String affichage = "";
		if (listeDesFactures.isEmpty()) {
			System.out.println("Facturier vide");
		} else {
			for (Facture facture : listeDesFactures) {
				affichage += facture.toString();
			}
			affichage += "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
		}
		System.out.println(affichage);
	}
}

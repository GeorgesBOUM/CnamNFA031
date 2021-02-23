package fr.projet.commerce;

import java.util.ArrayList;

public final class Facturier {
	private ArrayList<Facture> listeDesFactures;
	
	public void ajouterFacture(Facture facture) {
		listeDesFactures.add(facture);
	}
}

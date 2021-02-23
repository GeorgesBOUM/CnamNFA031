package fr.projet.commerce;

import java.util.ArrayList;

public final class Facture {
	private ArrayList<LigneFacture> listeDesLignes;
	
	public void ajouterLigne(Produit p, int quantite) {
		listeDesLignes.add(new LigneFacture(p, quantite));
	}
}

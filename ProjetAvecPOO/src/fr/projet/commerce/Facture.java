package fr.projet.commerce;

import java.util.ArrayList;
import java.util.Iterator;

public final class Facture {
	private ArrayList<LigneFacture> listeDesLignes;
	
	public Facture() {
		listeDesLignes = new ArrayList<LigneFacture>();
	}
	
	public void ajouterLigne(Produit p, int quantite) {
		listeDesLignes.add(new LigneFacture(p, quantite));
	}
	
	public boolean isEmpty() {
		return listeDesLignes.isEmpty();
	}
	
	public String toString() {
		Iterator<LigneFacture> iterator = listeDesLignes.iterator();
		String affichage = "---------------------------------------\n";
		while (iterator.hasNext()) {
			LigneFacture ligneFacture = (LigneFacture) iterator.next();
			affichage += ligneFacture.toString() + "\n";
		}
		affichage += "---------------------------------------\n";
		return affichage;
	}
}

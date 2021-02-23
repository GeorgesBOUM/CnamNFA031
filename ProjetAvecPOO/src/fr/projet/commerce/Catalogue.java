package fr.projet.commerce;

import java.util.ArrayList;

public final class Catalogue {
	private ArrayList<Produit> listeDeProduits;
	
	public void afficherCatalogue() {
		if (listeDeProduits == null) {
			System.out.println("Catalogue vide");
		} else {
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
			System.out.println("------------- Catalogue -------------");
			for (int i = 0; i < listeDeProduits.size(); i++) {
				listeDeProduits.get(i).toString();
			}
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		}
	}
	
	public void ajouterProduit(String nom, double prix) {
		Produit produit = chercherProduit(nom);
		if (produit == null) {
			listeDeProduits.add(new Produit(nom, prix));
		} else {
			System.out.println("Ce produit est déjà catalogué");
		}
	}
}

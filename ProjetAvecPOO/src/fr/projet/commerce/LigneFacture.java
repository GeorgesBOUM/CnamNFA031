package fr.projet.commerce;

public final class LigneFacture {
	private Produit produit;
	private int quantite;
	
	public LigneFacture(Produit p, int q)  {
		produit = p;
		quantite = q;
	}
	
	public String toString() {
		String affichage = produit + " (" + produit.getPrix()  + "€ par pièce) x ";
		affichage += quantite + " pièces = " + quantite * produit.getPrix() + "€";
		return affichage;
	}
}

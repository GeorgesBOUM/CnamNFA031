package fr.projet.commerce;

public class Produit {
	private String nom;
	private double prix;
	
	public Produit(String nNom, double pPrix) {
		nom = nNom;
		prix = pPrix;
	}
	
	public String getNom() {
		return nom;
	}
	
	public double getPrix() {
		return prix;
	}
}

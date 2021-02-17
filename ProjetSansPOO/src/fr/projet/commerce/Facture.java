package fr.projet.commerce;

import java.util.ArrayList;

public class Facture {
	/*
	 * Question 4.1 : D�finir un facturier (voir sujet)
	 * tab[i][j] : i --> facture et j --> ligne facture
	 */
	private static ArrayList<ArrayList<Integer>> listeProduits = new ArrayList<ArrayList<Integer>>();
	private static ArrayList<ArrayList<Integer>> listeQuantites = new ArrayList<ArrayList<Integer>>();
	
	public static void main(String[] args) {
		int numFacture = nouvelleFacture();
		ajouterProduit(numFacture, 0, 10);
		ajouterProduit(numFacture, 3, 2);
		afficherFacture(numFacture);

		numFacture = nouvelleFacture();
		ajouterProduit(numFacture, 1, 1);
		ajouterProduit(numFacture, 0, 5);
		ajouterProduit(numFacture, 2, 5);
		afficherFacture(numFacture);

		afficher();

	}

	private static int nouvelleFacture() {
		// TODO Question 4.2
		ArrayList<Integer> produit = new ArrayList<Integer>();
		ArrayList<Integer> quantite = new ArrayList<Integer>();
		listeProduits.add(produit);
		listeQuantites.add(quantite);
		return listeProduits.size() - 1;
	}

	private static void ajouterProduit(int numFacture, int numProduit, int quantite) {
		listeProduits.get(numFacture).add(numProduit);
		listeQuantites.get(numFacture).add(quantite);
	}

	/**
	 * Affiche une facture avec son num�ro, la liste des produits (nom du
	 * produit, quantit�, prix unitaire et prix total de la ligne), et le total
	 * de la facture.
	 * 
	 * @param numFacture
	 *            num�ro de la facture
	 */
	private static void afficherFacture(int numFacture) {
		// TODO Question 4.4

	}

	/**
	 * affiche toutes les factures.
	 */
	public static void afficher() {
		// TODO Question 4.5

	}

}

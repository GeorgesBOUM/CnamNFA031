package fr.projet.commerce;

public class Facture {
	/*
	 * Question 4.1 : D�finir un facturier (voir sujet)
	 * tab[i][j] : i --> facture et j --> ligne facture
	 */
	private static int tabProduits [][] = {};
	private static int tabQuantites [][] = {};
	
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
		int produits [][] = new int [tabProduits.length + 1][];
		int quantites [][] = new int [tabQuantites.length + 1][];
		if (tabProduits.length > 0) {
			for (int i = 0; i < tabProduits.length; i++) {
				for (int j = 0; j < tabProduits[i].length; j++) {
					produits[i][j] = tabProduits[i][j];
				}
			}
			for (int i = 0; i < tabQuantites.length; i++) {
				for (int j = 0; j < tabQuantites[i].length; j++) {
					quantites[i][j] = tabQuantites[i][j];
				}
			}
			tabProduits = produits;
			tabQuantites = quantites;
		} else {
			
		}
		return produits.length;
	}

	private static void ajouterProduit(int numFacture, int numProduit,
			int quantite) {
		// TODO Question 4.3

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

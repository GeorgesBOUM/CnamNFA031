package enonce;

public class Facture {
	/*
	 * Question 4.1 : Définir un facturier (voir sujet)
	 */

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
		return 0;
	}

	private static void ajouterProduit(int numFacture, int numProduit,
			int quantite) {
		// TODO Question 4.3

	}

	/**
	 * Affiche une facture avec son numéro, la liste des produits (nom du
	 * produit, quantité, prix unitaire et prix total de la ligne), et le total
	 * de la facture.
	 * 
	 * @param numFacture
	 *            numéro de la facture
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

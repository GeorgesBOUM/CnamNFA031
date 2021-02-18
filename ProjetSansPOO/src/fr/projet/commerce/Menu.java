package fr.projet.commerce;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		int choix;
		do {
			afficheMenu();
			System.out.print("Faites votre choix : ");
			choix = clavier.nextInt();
			clavier.nextLine();
			switch (choix) {
			case 1:
				System.out.println("Afficher un produit");
				System.out.print("Entrer le nom du produit: ");
				String nomProduit = clavier.nextLine();
				Menu.afficheProduit(nomProduit);
				break;
			case 2:
				System.out.println("Ajouter un produit au catalogue");
				System.out.print("Entrer le nom du nouveau produit: ");
				String nomNouveauProduit = clavier.nextLine();
				System.out.print("Entrer le prix du nouveau produit: ");
				double prixNouveauProduit = clavier.nextDouble();
				clavier.nextLine();
				Catalogue.ajouter(nomNouveauProduit, prixNouveauProduit);
				break;
			case 3:
				System.out.println("Consulter le catalogue");
				Catalogue.afficher();
				break;
			case 4:
				System.out.println("Afficher une facture");
				System.out.print("Entrer le numéro de la facture à afficher: ");
				int numFacture = clavier.nextInt();
				Facture.afficherFacture(numFacture);
				break;
			case 5:
				System.out.println("Ajouter une facture");
				int numNouvelleFacture = Facture.nouvelleFacture();
				int numProduitAchete, quantite;
				String reponse;
				do {
					System.out.println("Ajouter un produit à votre facture");
					System.out.print("Numéro du produit: ");
					numProduitAchete = clavier.nextInt();
					if (Catalogue.chercherParNumero(numProduitAchete)) {
						System.out.print("combien de " + Catalogue.getNom(numProduitAchete) + " voulez vous?");
						quantite = clavier.nextInt();
						clavier.nextLine();
						Facture.ajouterProduit(numNouvelleFacture, numProduitAchete, quantite);
					} 
					System.out.println("Voulez vous entrer un autre numéro produit? (oui / non) ");
					reponse = clavier.nextLine();
				} while (reponse.equals("oui"));
				
				break;
			case 6:
				System.out.println("afficher le facturier");
				break;
			case 7:
				sortir();
			default:
				break;
			}
		} while (choix != 7);	
		clavier.close();
	}
	
	public static void afficheMenu() {
		System.out.println("---------------- MENU ----------------");
		System.out.println("1 - afficher un produit");
		System.out.println("2 - ajouter un produit au catalogue");
		System.out.println("3 - afficher le catalogue");
		System.out.println("4 - afficher une facture");
		System.out.println("5 - ajouter une facture");
		System.out.println("6 - afficher le facturier");
		System.out.println("7 - sortir du programme");
	}
	
	private static void afficheProduit(String nom) {
		int numProduit = Catalogue.chercher(nom);
		if (numProduit == -1) {
			System.out.println("Référence non cataloguée");
		} else {
			System.out.println("article n°" + numProduit + 
					" : " + nom + " --> " + Catalogue.getPrix(numProduit));
		}
	}
	
	private static void sortir() {
		System.out.println("Au revoir !!!");
		System.exit(0);
	}
	
}

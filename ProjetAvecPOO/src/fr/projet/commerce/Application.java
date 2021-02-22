package fr.projet.commerce;

import java.util.Scanner;

public final class Application {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		String nomProduit;
		int choix, prixProduit, numFacture;
		// Pour les "tests", nous créons un catalogue et y ajoutons
		// quelques produits
		Catalogue catalogue = new Catalogue();
		catalogue.ajouterProduit("stylo bleu", 1.2);
		catalogue.ajouterProduit("stylo rouge", 1.2);
		catalogue.ajouterProduit("cahier petit format", 2);
		catalogue.ajouterProduit("cahier grand format", 3);
		
		// Pour les "tests", nous créons également un facturier
		Facturier facturier = new Facturier();
		
		afficherMenu();
		System.out.print("Votre choix: ");
		choix = clavier.nextInt();
		clavier.nextLine();
		
		switch (choix) {
		case 1:
			System.out.println("Catalogue complet");
			catalogue.afficherCatalogue();
			break;
			
		case 2:
			System.out.println("Ajout d'un nouveau produit au catalogue");
			System.out.print("Saisir le nom du produit: ");
			nomProduit = clavier.nextLine();
			System.out.print("Saisir le prix du produit: ");
			prixProduit = clavier.nextInt();
			clavier.nextLine();
			catalogue.ajouterProduit(nomProduit, prixProduit);
			break;
			
		case 3:
			System.out.print("Saisir le nom du produit: ");
			nomProduit = clavier.nextLine();
			catalogue.afficherProduit(nomProduit);
			break;
		
		case 4:
			System.out.println("Ajouter des articles au panier");
			Produit produit;
			LigneFacture ligneFacture;
			int quantite;
			String reponse;
			Facture facture = new Facture();
			do {
				System.out.print("Quel produit du catalogue souhaitez vous ? ");
				nomProduit = clavier.nextLine();
				produit = catalogue.chercheProduit(nomProduit);
				if (produit == null) {
					System.out.println("Nous ne disposons pas de " + nomProduit);
				} else {
					System.out.print("Combien en voulez vous ? ");
					quantite = clavier.nextInt();
					clavier.nextLine();
					ligneFacture = new LigneFacture(produit, quantite);
					facture.ajouterLigne(ligneFacture);
				}
				do {
					System.out.print("Souhaitez vous prendre un autre produit ? (oui / non)");
					reponse = clavier.nextLine();
					if (!reponse.equals("oui") && !reponse.equals("non")) {
						System.out.println("Vous devez répondre par oui ou par non");
					}
				} while (!reponse.equals("oui") && !reponse.equals("non"));
			} while (!reponse.equals("non"));
			if (facture != null) {
				facturier.ajouterFacture(facture);
			}
			break;
		
		case 5:
			System.out.println("Affichage d'une facture");
			numFacture = clavier.nextInt();
			clavier.nextLine();
			facture.afficherFacture(numFacture);
			break;
		
		case 6:
			System.out.println("Affichage du facturier");
			facturier.afficherFacturier();
			break;

		case 7:
			sortirDuProgramme();
			break;

		default:
			break;
		}
		clavier.close();
	}
	
	public static void afficherMenu() {
		System.out.println("--------------Menu---------------");
		System.out.println("1- Affichage du catalogue complet");
		System.out.println("2- Ajout d'un produit au catalogue");
		System.out.println("3- Affichage d'un produit");
		System.out.println("4- Ajout de produits au panier et édition de facture");
		System.out.println("5- Affichage d'une facture");
		System.out.println("6- Affichage du facturier");
		System.out.println("7- Sortir du programme");
	}
	
	public static void sortirDuProgramme() {
		System.out.println("Au revoir !!!");
		System.exit(0);
	}
}

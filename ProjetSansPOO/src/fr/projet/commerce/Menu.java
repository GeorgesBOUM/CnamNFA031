package fr.projet.commerce;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		int choix;
		afficheMenu();
		System.out.print("Faites votre choix : ");
		System.out.println();
		choix = clavier.nextInt();
		switch (choix) {
		case 1:
			System.out.print("Entrer le nom du produit: ");
			String nom = clavier.nextLine();
			afficheProduit(nom);
			break;
		case 2:
			System.out.println("ajouter produit");
			break;
		case 3:
			System.out.println("afficher catalogue");
			break;
		case 4:
			System.out.println("afficher une facture");
			break;
		case 5:
			System.out.println("ajouter une facture");
			break;
		case 6:
			System.out.println("afficher le facturier");
			break;
		case 7:
			sortir();
		default:
			break;
		}
		
	}
	
	public static void afficheMenu() {
		System.out.println("---------------- MENU ----------------");
		System.out.println("1 - afficher un produit");
		System.out.println("2 - ajouter un produit");
		System.out.println("3 - afficher le catalogue");
		System.out.println("4 - afficher une facture");
		System.out.println("5 - ajouter une facture");
		System.out.println("6 - afficher le facturier");
		System.out.println("7 - sortir du programme");
	}
	
	private static void afficheProduit(String nom) {
		int numProduit = Catalogue.chercher(nom);
		System.out.println(
				numProduit + " : " + nom + " --> " + Catalogue.getPrix(numProduit));
	}
	
	private static void sortir() {
		System.out.println("Au revoir !!!");
		System.exit(0);
	}
	
}

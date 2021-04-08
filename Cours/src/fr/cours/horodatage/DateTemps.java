package fr.cours.horodatage;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTemps {
	
	public static void main (String [] args) {
		LocalDateTime maintenant = LocalDateTime.now();
		System.out.println("Date et heure courante: " + maintenant);
		
		LocalDate aujourdhui = LocalDate.now();
		System.out.println("Date courante: " + aujourdhui);
		
		int annee = aujourdhui.getYear();
		int mois = aujourdhui.getMonthValue();
		int jour = aujourdhui.getDayOfMonth();
		System.out.println(
				"Date: " + aujourdhui + "\n" +
				"Jour: " + jour + "\n" +
				"Mois: " + mois + "\n" +
				"Année: " + annee + "\n"
				);
		String bissextile = (aujourdhui.isLeapYear()) ? " est une année bissextile" : " n'est pas une année bissextile";
		System.out.println(annee + bissextile);
	}
}

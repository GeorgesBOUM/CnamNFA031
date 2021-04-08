package fr.cours.horodatage;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTemps {
	
	public static void main (String [] args) {
		
		LocalDateTime maintenant = LocalDateTime.now();
		System.out.println("Date et heure courante: " + maintenant);
		
		LocalDate aujourdhui = LocalDate.now();
		System.out.println("Date courante: " + aujourdhui);

		String formatDate = "dd/MM/yyyy HH:mm:ss";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatDate);
		String dateApresFormatage = maintenant.format(formatter);
		
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
		
		System.out.println("Nous sommes le " + dateApresFormatage);
	}
}

package fr.cours.horodatage;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTemps {
	
	public static void main (String [] args) {
		LocalDateTime maintenant = LocalDateTime.now();
		System.out.println("Date et heure courante: " + maintenant);
		
		LocalDate aujourdhui = LocalDate.now();
		System.out.println("Date courante: " + aujourdhui);
	}
}

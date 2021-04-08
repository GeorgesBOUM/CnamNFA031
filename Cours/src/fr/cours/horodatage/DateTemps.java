package fr.cours.horodatage;

import java.time.LocalDateTime;

public class DateTemps {
	
	public static void main (String [] args) {
		LocalDateTime maintenant = LocalDateTime.now();
		System.out.println("Date et heure courante: " + maintenant);
	}
}

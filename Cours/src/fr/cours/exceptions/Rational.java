package fr.cours.exceptions;

public class Rational {

    private int numerator;
    private int denominator;
    
	public int getNumerator() {
		return numerator;
	}
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	public void setDenominator(int denominator) {
		if (denominator == 0) {
			throw new RationalException();
		} else {
			this.denominator = denominator;
		}
	}
    
    
}

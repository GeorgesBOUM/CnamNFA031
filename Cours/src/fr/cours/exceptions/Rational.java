package fr.cours.exceptions;

public class Rational {

    private int numerator;
    private int denominator;
    
    public Rational() {
        this( 0, 1 );           // Une délégation de constructeur
    }
    
    public Rational( int numerator ) {
        this( numerator, 1 );   // Une autre délégation de constructeur
    }
    
    public Rational( int numerator, int denominator ) {
        this.setNumerator( numerator );
        this.setDenominator( denominator );
    }
    
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

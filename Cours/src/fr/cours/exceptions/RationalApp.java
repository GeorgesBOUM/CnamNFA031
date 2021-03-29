package fr.cours.exceptions;

public class RationalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rational r1 = new Rational();
        System.out.printf( "[%d/%d]\n", r1.getNumerator(), r1.getDenominator() );

        Rational r2 = new Rational( 2 );
        System.out.printf( "[%d/%d]\n", r2.getNumerator(), r2.getDenominator() );

        Rational r3 = new Rational( 1, 3 );
        System.out.printf( "[%d/%d]\n", r3.getNumerator(), r3.getDenominator() );
    
	    
	}

}

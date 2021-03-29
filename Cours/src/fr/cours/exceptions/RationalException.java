package fr.cours.exceptions;

public class RationalException extends IllegalArgumentException {
	
	private static final long serialVersionUID = 1L;
	

    public RationalException() {
        this( "Denominator cannot be zero" );
    }

    public RationalException( String message ) {
        super( message );
    }
    
    public RationalException( String message, Throwable cause ) {
        super( message, cause );
    }
}

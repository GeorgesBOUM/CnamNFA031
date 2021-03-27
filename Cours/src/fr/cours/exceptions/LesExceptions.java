package fr.cours.exceptions;

public class LesExceptions {
	
//    public static void method3() throws Exception {
	public static void method3() throws RuntimeException {
        System.out.println( "BEGIN method3" );
        int divisor = (int) (Math.random() * 3);
        if (divisor == 0) {
//			throw new Exception("divisor cannot be nul");
        	throw new RuntimeException("divisor cannot be nul");
		} else {
			int value = 1 / divisor;
	        System.out.println( "Value == " + value );
		}
        System.out.println( "END method3" );
    }

//    public static void method2() throws Exception {
	public static void method2() {
        System.out.println( "BEGIN method2" );
        method3();
        System.out.println( "END method2" );
    }
    
//    public static void method1() throws Exception {
	public static void method1() {
        System.out.println( "BEGIN method1" );
        method2();
        System.out.println( "END method1" );
    }
	
	public static void main(String[] args) {
        System.out.println( "BEGIN main" );
//        method1();
        try {
        	method1();
		} catch (Exception e) {
			System.out.println("Division by zero");
		}
        System.out.println( "END main" );
    }
}

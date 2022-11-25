package exceptionHandling.kendiExceptionSiniflarimiz;

public class Main {

	public static void yasKontrol( int yas ) {
		
		if( yas < 18 )
		{
			throw new InvalidAgeException( "Invalid Age" );
		}
		else
			System.out.println( "Mekana Hoşgeldiniz" );
		
	}
	
	public static void main(String[] args) {
		
		try {
			yasKontrol(17);
			
		} catch (InvalidAgeException e) {
			System.out.println(e);
		}

	}

}

package metodlar;

public class MethodOverloading
{
	public static void sum( int a, int b, int c )
	{
		System.out.println( "3 sayılı toplama işlemi sonucu = " + ( a + b + c ) );
	}
	public static void sum(int a, int b)
	{
		System.out.println("2 sayılı toplama işlemi sonucu = " + ( a + b ));
	}
	public static void sum( String a, String b )
	{
		System.out.println( a + b );
	}
	public static void main ( String[] args )
	{
		sum( 5,7,1 );
		sum( 5, 7 );
		sum( "Mehmet Furkan ", "Sarı" );
	}
}

package metodlar;

public class ParameterizedMethod
{
	public static void greeting(String name)
	{
		System.out.println("Hello " + name);
	}
	public static void sum(int a, int b, int c)
	{
		System.out.println( a + b + c );
	}
	public static void main ( String[] args )
	{
		greeting( "furkan" );
		sum( 5, 7 , 1 );
	}
}

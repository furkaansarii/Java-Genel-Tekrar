package metodlar;


public class ReturnUsage
{
//	public static int sum(int a, int b, int c)
//	{
//	//	System.out.println( a + b + c );
//		return(a + b + c);
//	}
	public static int multiplyByTwo( int a )
	{
		return a * 2;
	}
	public static int sumWithTwo( int a )
	{
		return a + 2;
	}
	public static int multiplyByFour( int a )
	{
		return a * 4;
	}

	public static void main ( String[] args )
	{
		//Return değer döndürmeye yarar

	//	System.out.println( "Çıktı değeri = " + sum( 1, 2, 3 ));
		System.out.println(multiplyByFour( sumWithTwo( multiplyByTwo( 8 ) ) ));
		//return son çalıştırılan koddur sonrasında yazılan hiçbir şey çalışmaz.



	}
}

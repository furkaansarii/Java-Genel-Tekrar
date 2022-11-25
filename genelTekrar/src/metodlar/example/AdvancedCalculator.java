package metodlar.example;

import java.util.Scanner;

public class AdvancedCalculator
{
	public static int sum( int a, int b )
	{
		return a + b;
	}
	public static int sum( int a, int b, int c )
	{
		return a + b + c;
	}
	public static int subtraction( int a, int b )
	{
		return (a - b);
	}
	public static int multiplication( int a, int b )
	{
		return a * b;
	}
	public static int multiplication( int a, int b, int c )
	{
		return a * b * c;
	}
	public static double division(double a, double b)
	{
//		if ( a < b )
//		{
//			return b / a;
//		}
//		else if ( a == b )
//		{
//			return a / b;
//		}
//		else
//			return a / b;
		return  a / b;
	}
	public static void main ( String[] args )
	{
		int a , b , c;
		int value = 0;
		int quit = 0;
		int command = 0;
		while ( quit == 0 )
		{
			System.out.println( "Hoşgeldiniz. Hangi işlemi yapmak istersiniz?" );
			System.out.println( "1 - Toplama İşlemi \n2 - Çarpma İşlemi\n3 - Bölme İşlemi \n4 - Çıkarma İşlemi" );
			Scanner scanner = new Scanner( System.in );
			command = scanner.nextInt();
			if ( command == 1 )
			{
				System.out.println("Kaç sayı toplamak istersiniz?");
				value = scanner.nextInt();
				if ( value == 2 )
				{
					System.out.println("Toplamak istediğiniz sayıları girin");
					a = scanner.nextInt();
					b = scanner.nextInt();
					System.out.println(sum( a, b));
				}
				else if ( value == 3 )
				{
					System.out.println("Toplamak istediğiniz sayıları girin");
					a = scanner.nextInt();
					b = scanner.nextInt();
					c = scanner.nextInt();
					System.out.println(sum( a, b, c ));
				}
				else
				{
					System.out.println("Maalesef o kadar sayı toplayamıyoruz");
				}
			}
			else if ( command == 2 )
			{
				System.out.println("Kaç sayı çarpmak istersiniz?");
				value = scanner.nextInt();
				if ( value == 2 )
				{
					System.out.println("Çarpmak istediğiniz sayıları girin");
					a = scanner.nextInt();
					b = scanner.nextInt();
					System.out.println(multiplication( a, b ));
				}
				else if ( value == 3 )
				{
					System.out.println("Çarpmak istediğiniz sayıları girin");
					a = scanner.nextInt();
					b = scanner.nextInt();
					c = scanner.nextInt();
					System.out.println(multiplication( a, b, c ));
				}
				else
				{
					System.out.println("Maalesef o kadar sayı çarpamıyoruz");
				}
			}
			else if ( command == 3 )
			{
				System.out.println("Lütfen iki sayı girin");
				a = scanner.nextInt();
				b = scanner.nextInt();
				System.out.println(division( a, b ));
			}
			else if ( command == 4 )
			{
				System.out.println("Lütfen iki sayı girin");
				a = scanner.nextInt();
				b = scanner.nextInt();
				System.out.println( subtraction( a, b ) );
			}
			else
			{
				System.out.println("Yanlış Komut");
			}
			System.out.println("Çıkmak için 1 e devam etmek için herhangi bir sayıya basın");
			quit = scanner.nextInt();

		}
	}
}

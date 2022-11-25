package metodlar;

import java.util.Scanner;

public class Entry
{
	public static void greeting()
	{
		System.out.println("Hello world");
		System.out.println("Hello Java");
	}
	public static void fact()
	{
		Scanner scanner = new Scanner( System.in );
		int number = scanner.nextInt();
		int fact = 1;
		while ( number > 0 )
		{
			fact = fact * number;
			number --;
		}
		System.out.println(fact);
	}
	public static void main ( String[] args )
	{

//		greeting();
//		greeting();
//		greeting();
		fact();
	}
}

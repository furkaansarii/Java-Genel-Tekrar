package arreyler;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySiralama {
	
	public static void arraySirala( int[] array )
	{
		Arrays.sort(array);
		arrayiBastir(array);
		
	}
	
	private static void arrayiBastir(int[] array) {
		for ( int i = 0; i < array.length; i++ )
		{
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		int[] array = {1, 7, 8, 36, 21, 102, 4};
	//	arraySirala(array);
		
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {1, 2, 3, 4, 5};
		
		if ( a == b )
		{
			System.out.println("Eşitler");
		}
		else
			System.out.println("Değiller");
		
		System.out.println("Burada referansları kontrol ediyorsun eğer eşitlik durumunu sorgulamak istersen Arrays sınıfını kullan");
		System.out.println("------------------------------------------------------------------------------------------------------------");
		
		if ( Arrays.equals(a, b) )
		{
			System.out.println("Eşitler");
		}
		else
			System.out.println("Değiller");	
		
		
		
	}

}

package arreyler;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		
		int[] a = new int[10]; //bellekte 10 tane int depolayacak yer açılıyor
		a[5] = 32;
		a[9] = 50;
		System.out.println(a[5]);
		System.out.println("Yukarıdaki gibi teker teker vermek saçma");
		
		int[] b = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(b[0]);
		
		System.out.println("----------------------------------------------------------");
		System.out.println("Arrayein değerlerini kullanıcıdan al");
		
		Scanner scanner = new Scanner(System.in);
		int[] c = new int[5];
		
		for ( int i = 0; i < c.length; i++ )
		{
			System.out.println("Diziye " + i + ". değerini ekleyin");
			int deger = scanner.nextInt();
			c[i] = deger;
		}
		
		for ( int i = 0; i < c.length; i++ )
		{
			System.out.println(c[i]);
		}
		
		System.out.println("--------------------------------------------------------------");
		System.out.println("Arrayi Metotta Bastır");
		
		int[] d = {10, 15, 20, 25, 30};
		arrayiBastir(d);

	}

	public static void arrayiBastir( int[] d ) {
		for ( int i = 0; i < d.length; i++ )
		{
			System.out.println(d[i]);
		}
	}

}

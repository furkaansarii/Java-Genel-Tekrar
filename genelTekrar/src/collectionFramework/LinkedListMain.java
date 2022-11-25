package collectionFramework;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListMain {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		zamanHesapla("LinkedList", linkedList);
		zamanHesapla("ArrayList", arrayList);
		
		/*
		 *  Output:
		 *  LinkedList ekleme süresi 155 ms
			Listenin 0.indexine bir şey eklemek istersek
			LinkedList Listenin 0. indexine ekleme süresi 1 ms
			ArrayList ekleme süresi 59 ms
			Listenin 0.indexine bir şey eklemek istersek
			ArrayList Listenin 0. indexine ekleme süresi 292 ms
			
			ArrayList Listeye eleman eklerken daha hızlı fakat listenin 0.indexine eleman eklemek konusunda LinkedList daha avantajlı

		 */
		
	}

	public static void zamanHesapla( String veriTipi, List<Integer> list )
	{
		//Listin sonuna değer ekleme
		
		long baslangic;
		long bitis;
		baslangic = System.currentTimeMillis();
		for ( int i = 0; i < 1000000; i++ )
		{
			
			list.add( i );
		}
		bitis = System.currentTimeMillis();
		System.out.println( veriTipi + " ekleme süresi " + ( bitis - baslangic ) + " ms" );
		
		System.out.println("Listenin 0.indexine bir şey eklemek istersek");
		
		baslangic = System.currentTimeMillis();
		for ( int i = 0; i < 1000; i++ )
		{
			
			list.add( 0, i );
		}
		bitis = System.currentTimeMillis();
		System.out.println( veriTipi + " Listenin 0. indexine ekleme süresi " + ( bitis - baslangic ) + " ms" );
		
		
		
	}
}

package linkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
	
	public static void listeyiBastir(LinkedList<String> gidilecekYerler) 
	{
		/*
		for ( String s : gidilecekYerler )
		{
			System.out.println(s);
		}
		*/
		
		//Listeyi iterator yardımıyla da bastırabilirdik 
		
		ListIterator<String> iterator = gidilecekYerler.listIterator();
		
		while ( iterator.hasNext() )
		{
			System.out.println(iterator.next());
		}
	}
	
	public static void siraliEkle( LinkedList<String> gidilecekYerler, String yeni )
	{
		ListIterator<String> iterator = gidilecekYerler.listIterator();
		
			while (iterator.hasNext()) {
            
            int karsilastir = iterator.next().compareTo(yeni);
            
            if (karsilastir == 0) {
                //İki değer eşit
                System.out.println("Listeniz bu eleman zaten var....");
                
                return;
               
            }
            else if (karsilastir  < 0) {
                
                // Yeni değer iterator.next ten daha büyük.
            }
            else if (karsilastir > 0 ) {
                
                iterator.previous();
                iterator.add(yeni);
                
                return;
                
            }
           
        }
        iterator.add(yeni);

	}

	public static void main(String[] args) {

		LinkedList<String> gidilecekYerler = new LinkedList<String>();
		/*
		gidilecekYerler.add("Postane");
		gidilecekYerler.add("Market");
		gidilecekYerler.add("İş");
		gidilecekYerler.add("Spor Salonu");
		gidilecekYerler.add("Tiyatro");
		gidilecekYerler.add("Ev");
		
		listeyiBastir(gidilecekYerler);
		*/
		System.out.println("------------------------------------------------------------");
		
	//	gidilecekYerler.add( 4, "Alışveriş Merkezi" );
	//	gidilecekYerler.remove(4);
		
	//	listeyiBastir(gidilecekYerler);
		
		System.out.println("---------------------------------------------------------------");
		
		siraliEkle(gidilecekYerler, "Postane");
		siraliEkle(gidilecekYerler, "Market");
		siraliEkle(gidilecekYerler, "Ev");
		listeyiBastir(gidilecekYerler);

	}

}

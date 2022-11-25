package linkedList;

import java.util.ArrayList;

public class ArrayVeLinkedListFarki {

	public static void main(String[] args) {
		
		ArrayList<String> diller = new ArrayList<String>();
		diller.add("Java");
		diller.add("Kotlin");
		diller.add("C++");
		
		/*
		for ( int i = 0; i < diller.size(); i++ )
		{
			System.out.println(diller.get(i));
		}
		*/
		
		diller.add(1, "C#"); //add metodunun böyle de bir kullanımı var 1.indekse c# ekle dedim.
		/*
		 * ArrayListlerde araya eleman eklemek istediğinde çok daha maliyetli ve yavaş oluyor
		 * fakat linkedListlerde bu çok daha hızlı ve kolay oluyor fakat linkedListlerin de dezavantajı çok daha fazla yer kaplıyor oluşu
		 */
		
		for ( String s : diller )
		{
			System.out.println( s );
		}
	}

}

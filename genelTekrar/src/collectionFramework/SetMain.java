package collectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {
	
	public static void main(String[] args) {
		  /*
	    Set Interface ----> HashSet,LinkedHashSet, TreeSet

	    Set Interface ile List Interface’in farkı
	    List interface’i implemente eden classlar bir elementten birden fazla depolayabilirken,  
	    Set interface’i implemente eden classlar bir elementten sadece bir tane depolarlar.

	    HashSet Sınıfı

	    HashSet extends AbstractSet implements Set Interface extends Collection extends Iterable

	    1.HashSet elementleri "hashing" yani hash table  mekanizmasına uygun bir biçimde depolarlar
	    (Her element belli bir key'e göre depolanır.)

	    2.HashSet bir element'i sadece bir defa depolar.(Set Interface)

	    3. Elementlerin ekleme sırasına göre depolamaz.

	    LinkedHashSet Sınıfı

	    LinkedHashSet extends HashSet extends AbstractSet implements Set Interface extends Collection extends Iterable

	    1. LinkedHashSet hem HashTable hem de Set Interface'in LinkedList implementasyonu gibi davranır.

	    2. HashSette olduğu gibi bir elementi sadece bir defa depolar.(Set Interface)

	    3. Elementleri ekleme sırasına göre depolar.


	    TreeSet Sınıfı

	    TreeSet sınıfı NavigableSet inteface'ini implemente eder ve AbstractSet sınıfından miras alır. 
	    NavigableSet interface'i de SortedSet interfaceinden miras alır. 

	    1. Elementleri depolamak için Tree yani Ağaç yapısını kullanır.

	    2. Elementleri alfabetik olarak sıralarlar.



	    HashSet vs LinkedHashSet vs TreeSet

	    HashSet, Hash Table mekanizmasını uyguladığı için elementler sıralı değildir. Ekleme,Çıkarma ve
	    Arama metodları sabit zamanda( Time Complexity : O(1) ) çalışır. 

	    TreeSet, elementleri tree yapısına yani ağaç yapısına uygun depolar. Ekleme,Çıkarma ve 
	    Arama metodları O(log(n)) complexitysi ile çalışır.

	    LinkedHashSet sınıfı hashtable ile linked list yapısını kullanarak elementleri depolar.Bu yüzden,
	    elemetler ekleme sırasına göre depolanır. Ekleme,Çıkarma ve Arama metodları 
	    sabit zamanda( Time Complexity : O(1) ) çalışır. 
	    */
		
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new LinkedHashSet<String>();
		Set<String> set3 = new TreeSet<String>();
		
		//HashSet
		set1.add("Java");
		set1.add("Python");
		set1.add("C++");
		set1.add("JavaScript");
		set1.add("PHP");
		
		//LinkedHashSet
		set2.add("Java");
		set2.add("Python");
		set2.add("C++");
		set2.add("JavaScript");
		set2.add("PHP");
		
		//TreeSet
		set3.add("Java");
		set3.add("Python");
		set3.add("C++");
		set3.add("JavaScript");
		set3.add("PHP");
		
		//HashSette karışık olarak ekrana basar, LinkedHashSette ekleme sıramıza göre ekrana basar, TreeSette alfabetik olarak ekrana basar
		//Javayı bir kez daha eklemek istersek ekrana iki kere java basmazlar bir eleman bir kere depolanır(3 ü için de geçerli).
		
		System.out.println("**************************************HashSet************************************");
		for ( String s : set1 )
		{
			System.out.println(s);
		}
		
		System.out.println("**************************************LinkedHashSet************************************");
		for ( String s : set2 )
		{
			System.out.println(s);
		}
		
		System.out.println("**************************************TreeSet************************************");
		for ( String s : set3 )
		{
			System.out.println(s);
		}
		System.out.println("******************************************Set özellikleri örneği******************************************");
		
		System.out.println( set1.contains("Go") ); //Eğer hashsetin içerisinde go varsa true yoksa false döner.
		System.out.println( set1.contains("Java") );
		
		System.out.println( set1.isEmpty() ); //HashSetin içerisinde eleman varsa true yoksa false döner
		
		
		System.out.println("Sil");
		//set1.remove( "Java" ); Javayı siler 
		
	}

}

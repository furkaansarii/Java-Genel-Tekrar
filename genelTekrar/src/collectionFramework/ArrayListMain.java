package collectionFramework;

import java.util.List;
import java.util.ArrayList;

public class ArrayListMain {
	
	public static void main(String[] args) {
		
	//	ArrayList<String> arrayList = new ArrayList<String>();
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("C++");
		list.add("Kotlin");
		
		System.out.println(list.get(0));
		System.out.println(list.get(2));
		
		for ( String s : list )
		{
			System.out.println(s);
		}
		
		System.out.println("C++ silinecek");
		list.remove(1);
		
		for ( String s : list )
		{
			System.out.println(s);
		}

	}

}

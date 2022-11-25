package vectorveStack;

import java.util.ListIterator;
import java.util.Vector;

public class VectorMain {
	
	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<String>();
		
		vector.add( "Java" );
		vector.add( "C#" );
		vector.add( "Python" );
		vector.add( "Php" );
		
		/*
		for( String s : vector )
		{
			System.out.println( s );
		}
		*/
		
		ListIterator<String> iterator = vector.listIterator();
		while( iterator.hasNext() )
		{
			System.out.println(iterator.next());
		}
		System.out.println( "İlk ve Son Eleman" );
		System.out.println( "İlk eleman" + vector.firstElement() );
		System.out.println( "Son eleman" + vector.lastElement() );
		
	}

}

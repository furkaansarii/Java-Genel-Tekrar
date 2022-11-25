package vectorveStack;

import java.util.Enumeration;
import java.util.Stack;

public class StackMain {
	
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		stack.push( "Java" );
		stack.push( "Python" );
		stack.push( "Php" );
		stack.push( "Go" );
		
		Enumeration<String> enumeration = stack.elements();
		while( enumeration.hasMoreElements() )
		{
			System.out.println( enumeration.nextElement() );
		}
		System.out.println( "Son eleman çıkartılıyor" + stack.pop() );
		for( String s : stack )
		{
			System.out.println(s);
		}
		
		while( !stack.empty() )
		{
			System.out.println( "Eleman Çıkartılıyor..." + stack.pop() );
		}
	}

}

package stringlerinOzellikleri;

public class Main {
	
	public static void main(String[] args) {
		String a = "Furkan";
		String b = new String("Furkan");
		
		System.out.println(b);
		
		System.out.println( "Harf Sayısı: " + b.length() );
		
		System.out.println( "0.indeks:" + b.charAt(0) );
		System.out.println( "1.indeks:" + b.charAt(1) );
		
		for ( int i = 0; i < b.length(); i++ )
		{
			System.out.println(b.charAt(i));
		}
		
		System.out.println( b.startsWith("Fu") ); //Bu string Fu ile mi başlıyor 
		System.out.println( b.endsWith("n") ); //Bu string n ile mi bitiyor
		
		System.out.println( b.indexOf('a') ); //a harfi kaçıncı indexde eğer yoksa -1 döner
		
		System.out.println( b.toLowerCase() ); //Büyük harfleri küçük yapar 
		System.out.println( b.toUpperCase() ); //Küçük harfleri büyük yazar
		
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Stringi int e çevirme");
		String str = "1923";
		int stringToInt = Integer.parseInt(str);
		System.out.println(stringToInt - 42);
		
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("inti Stringe çevirme");
		int intToStr = 1923;
		String c = String.valueOf(intToStr);
		System.out.println( c + 1 );
		
		
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("String tanımlamalarındaki farklılıklar");
		
				
		
		
		
	}

}

package staticClass;

public class Main {
	
	public static void main(String[] args) {
		
		Seyirci seyirci1 = new Seyirci( "Mehmet" );
		Seyirci seyirci2 = new Seyirci( "Furkan" );
		
		System.out.println(Seyirci.seyirciSayisi);
		System.out.println(seyirci2.seyirciSayisi);
		seyirci1.oyunSeyret();
		
		
		
		
	}

}

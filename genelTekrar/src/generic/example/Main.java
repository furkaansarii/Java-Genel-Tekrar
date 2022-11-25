package generic.example;

public class Main {

	public static void main(String[] args) {
		SayisalOgrenci sayisal1 = new SayisalOgrenci(30, 40, 30, 12);
		SayisalOgrenci sayisal2 = new SayisalOgrenci(25, 23, 48, 8);
		
		EsitAgirlikOgrenci ea1 = new EsitAgirlikOgrenci(43, 26, 12, 38);
		EsitAgirlikOgrenci ea2 = new EsitAgirlikOgrenci(40, 2, 20, 40);
		
		EsitAgirlikOgrenci esitAgirlikBirinci = ogrenciBirinci(ea1, ea2);
		
		
		SayisalOgrenci birinciSayisal = ogrenciBirinci(sayisal1, sayisal2);
		System.out.println( "Sayısal Birinci Öğrenci Puanı:" + birinciSayisal.puanHesapla() );
		System.out.println( "Eşit ağırlık birinci:" + esitAgirlikBirinci.puanHesapla() );
	}
	
	public static <E extends Aday> E ogrenciBirinci( E e1, E e2 )
	{
		if ( e1.puanHesapla() > e2.puanHesapla() )
		{
			return e1;
		}
		else
			return e2;
	}

}

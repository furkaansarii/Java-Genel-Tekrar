package genelTekrar.example.yurtDisiCikisProgrami;

import java.util.Scanner;

public class Yolcu implements CikisKurallari {

	private int harc;
	private boolean siyasiYasak;
	private boolean vizeDurum;
	
	public Yolcu() {

		Scanner scanner = new Scanner(System.in);
		System.out.println( "Yatırdığınız harç bedeli nedir? " );
		this.harc = scanner.nextInt();
		scanner.nextLine();
		System.out.println( "Herhangi bir siyasi yasağınız var mı?" );
		String cevap = scanner.nextLine();
		if ( cevap.equals("evet") )
		{
			this.siyasiYasak = true;
		}
		else if ( cevap.equals("hayır") )
		{
			this.siyasiYasak = false;
		}
		else
			System.out.println("lütfen evet ya da hayır diye cevap veriniz");
		
		System.out.println( "Vizeniz bulunuyor mu?" );
		String cevap2 = scanner.nextLine();
		if ( cevap2.equals("evet") )
		{
			this.vizeDurum = true;
		}
		else if ( cevap2.equals("hayır") )
		{
			this.vizeDurum = false;
		}
		else
			System.out.println("Lütfen evet ya da hayır diye cevap verin");
	}
	
	@Override
	public boolean yurtDisiHarciKontrol() {
		if ( harc < 15 )
		{
			System.out.println("Yurt dışı harcınızı yatırınız");
			return false;
		}
		else {
			System.out.println( "Yurt Dışı harcı tamam." );
			return true;
		}
	}
	@Override
	public boolean siyasiYasak() {
		if ( this.siyasiYasak == true )
		{
			System.out.println("Siyasi yasağınız bulunuyor yurtdışına çıkamassınız");
			return false;
		}
		else
		{
			System.out.println("Siyasi yasağınız yoktur");
			return true;
		}
	}
	@Override
	public boolean vizeDurumu() {
		if ( this.vizeDurum == true )
		{
			System.out.println( "Vize durumu tamam" );
			return true;
		}
		else
		{
			System.out.println( "Vizeniz yok" );
			return false;
		}
	}
	
}

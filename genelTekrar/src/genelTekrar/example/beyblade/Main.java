package genelTekrar.example.beyblade;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Beyblade Programına Hoşgeldiniz.");
		System.out.println("Çıkış için q ya basın");
		
		Scanner scanner = new Scanner(System.in);
		
		while ( true )
		{
			System.out.println("Hangi Beyblade üretmek istersiniz");
			String islem = scanner.nextLine();
			if ( islem.equals("q") )
			{
				System.out.println("Programdan Çıkılıyor");
				return;
			}
			else 
			{
				BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
				Beyblade beyblade = fabrika.beybladeUret(islem);
				if ( beyblade == null )
				{
					System.out.println("Lütfen Geçerli Bir Beyblade Adı Girin");
				}
				else
					beyblade.bilgileriGoster();
				
			}
		}

	}

}

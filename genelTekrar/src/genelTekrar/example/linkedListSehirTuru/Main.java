package genelTekrar.example.linkedListSehirTuru;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	public static void islemleriBastir() 
	{
		System.out.println("0 - İşlemleri Görüntüle..");
        System.out.println("1 - Bir sonraki Şehre Git...");
        System.out.println("2 - Bir Önceki Şehre Git...");
        System.out.println("3 - Uygulamadan Çık.");

		
	}
	
	public static void sehirleriTurla( LinkedList<String> sehirler )
	{
		ListIterator<String> iterator = sehirler.listIterator();
		
		int islem;
		
		islemleriBastir();
		
		Scanner scanner = new Scanner( System.in );
		
		if ( !iterator.hasNext() )
		{
			System.out.println("Herhangi bir şehir bulunmuyor");
		}
		
		boolean cikis = false;
		boolean ileri = true;
		while ( !cikis )
		{
			System.out.println("Bir İşlem Seçin");
			islem = scanner.nextInt();
			
			switch (islem) {
				case 0:
					islemleriBastir();
					break;
				
				case 1:
					if ( !ileri )
					{
						if ( iterator.hasNext() )
						{
							iterator.next();
						}
						ileri = true;
					}
					if ( iterator.hasNext() )
					{
						System.out.println("Gidilecek Şehir:" + iterator.next() );
					}
					else
					{
						System.out.println( "Gidilecek Şehir Kalmadı" );
						ileri = true;
					}
					break;	
				case 2:
					if ( ileri )
					{
						if ( iterator.hasPrevious() )
						{
							iterator.previous();
						}
						ileri = false;
					}
					if ( iterator.hasPrevious() )
					{
						System.out.println( "Gidilecek Şehir:" + iterator.previous() );
					}
					else
					{
						System.out.println( "Şehir turu yeni başladı" );
					}
					break;	
				case 3:
					cikis = true;
					System.out.println("Uygulamadan çıkılıyor");
					break;	
				default:
					System.out.println("Yanlış İşlem Seçtiniz");
					break;
			}
		}
	}
	
	
	public static void sehirleriGoster( LinkedList<String> sehirler )
	{
		for ( String s : sehirler )
		{
			System.out.println(s);
		}
	}

	public static void main(String[] args) {

		LinkedList<String> sehirler = new LinkedList<String>();
		
		sehirler.add("Ankara");
		sehirler.add("Eskişehir");
		sehirler.add("Afyon");
		
	//	sehirleriGoster(sehirler);
		sehirleriTurla(sehirler);
	}

}

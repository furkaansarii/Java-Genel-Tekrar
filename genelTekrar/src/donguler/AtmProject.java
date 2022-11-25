package donguler;

import java.util.Scanner;

public class AtmProject
{
	public static void main ( String[] args )
	{
		Scanner scanner = new Scanner(System.in);
		int quit = 0;
		int password = 0;
		int passwordDb = 1234;
		String nameDb = "Furkan";
		int command = 0;
		int bakiyeDb = 1000;
		int money = 0;
		System.out.println( "Hoşgeldiniz Lütfen Parolanızı Giriniz" );
		password = scanner.nextInt();
		if ( password == passwordDb )
		{
			while ( quit == 0 )
			{

					System.out.println( nameDb + " Bey Hoşgeldiniz" );
					System.out.println( "Hangi işlemi yapmak istersiniz" );
					System.out.println( "1-Para Çekme \n 2-Para Yükleme \n 3-Bakiye Sorgulama \n 4-Profili görüntüle" );
					command = scanner.nextInt();
					switch ( command )
					{
						case 1:
							System.out.println("Ne kadar para çekmek istersiniz");
							money = scanner.nextInt();
							if ( bakiyeDb >= money )
							{
								bakiyeDb = bakiyeDb - money;
								System.out.println("Yeni bakiyeniz "+bakiyeDb);
								break;
							}
							else
							{
								System.out.println("Bakiyeniz Yetersiz");
								break;
							}
						case 2:
							System.out.println("Ne kadar para yükleyeceksiniz");
							money = scanner.nextInt();
							bakiyeDb = bakiyeDb + money;
							System.out.println("Yeni bakiyeniz "+ bakiyeDb);
							break;

						case 3:
							System.out.println("Bakiyeniz "+ bakiyeDb);
							break;
						case 4:
							System.out.println("İsminiz:"+nameDb);
							System.out.println("Bakiyeniz:"+bakiyeDb);
							break;
					}
				System.out.println("Başka İşlem Yapmak İster Misiniz?");
				System.out.println("Başka işleminiz varsa 0 a basınız");
				quit = scanner.nextInt();
			}
		}
		else
		{
			System.out.println("Parolanızı Yanlış Girdiniz");
		}
	}
}

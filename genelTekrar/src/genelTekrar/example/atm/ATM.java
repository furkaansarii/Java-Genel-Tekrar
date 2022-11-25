package genelTekrar.example.atm;

import java.util.Scanner;

public class ATM {
	

	public void calis(Hesap hesap) {
		
		
		Scanner scanner = new Scanner(System.in);
		int islem;
		Login login = new Login();
		System.out.println("Hg");
		while (login.girisYap(hesap)) {
			System.out.println("Hangi İşlemi yapacaksınız");
			System.out.println("1-Para Çekme");
			System.out.println("2-Para Yükleme\n3-Bakiye Sorgulama");
			islem = scanner.nextInt();
			switch (islem) {
			case 1:
				System.out.println("Ne kadar para çekmek istersin");
				int tutar = scanner.nextInt();
				hesap.paraCek(tutar);
				break;
				
			case 2:
				System.out.println("Ne kadar para yüklemek istersin");
				tutar = scanner.nextInt();
				hesap.paraYatir(tutar);
				break;
				
			case 3:
				hesap.bakiyeSorgula();
				break;	
				
			default:
				System.out.println("Yanlış işlem seçtiniz");
				break;
			}
			
		}
		
	}

}

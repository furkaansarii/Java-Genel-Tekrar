package genelTekrar.example.atm;

import java.util.Scanner;

public class Login {
	
	public boolean girisYap(Hesap hesap) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Kullanıcı Adınızı Girin");
		String kullaniciAdi = scanner.nextLine();
		System.out.println("Lütfen Parolanızı Girin");
		String parola = scanner.nextLine();
		
		if ( ( hesap.getKullaniciAdi().equals(kullaniciAdi) ) && ( hesap.getParola().equals(parola) ) )
		{
			return true;
		}
		
		return false;
	}

}

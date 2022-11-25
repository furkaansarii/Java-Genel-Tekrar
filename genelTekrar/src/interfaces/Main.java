package interfaces;

public class Main {
	
	public static void main(String[] args) {
		
		BilgisayarMühendisi bilgisayarMühendisi = new BilgisayarMühendisi(true, false);
		
		/*
		bilgisayarMühendisi.askerlikDurumSorgula();
		bilgisayarMühendisi.adliSicilSorgula();
		bilgisayarMühendisi.mezuniyetOrtalamasi(2.74);
		String[] tecrube = {"Leonardo", "Bimetri", "Havelsan"};
		
		bilgisayarMühendisi.isTecrubesi(tecrube);
		*/
		
		MakinaMuhendisi makinaMuhendisi = new MakinaMuhendisi(true, true);
		
		String[] isTecrubesi = null;
		String[] referanslar = {"Furkan Sarı"};
		makinaMuhendisi.adliSicilSorgula();
		makinaMuhendisi.askerlikDurumSorgula();
		makinaMuhendisi.isTecrubesi(isTecrubesi);
		System.out.println(makinaMuhendisi.mezuniyetOrtalamasi(2.74));
		makinaMuhendisi.referansGetir(referanslar);
		makinaMuhendisi.calis();
		
		}

}

package abstracts;

public class Main {

	public static void main(String[] args) {

	//	Sekil sekil = new Sekil("Sekil");  Burası hata verir abstract sınıflardan tıpkı interfaceler gibi obje oluşturamassın.
		
		Sekil sekil;
		sekil = new Kare("Kare2", 6);
		Kare kare = new Kare( "Kare1", 5 );
		Daire daire = new Daire( "Daire", 5 );
		
		kare.alanHesapla();
		daire.alanHesapla();
		sekil.alanHesapla();
		
		kare.cevreHesapla();
		
		//Abstract classlarımızın içinde normal metotlarımızı yazıyoruz ve abstract metotlarımızı aynı anda yazıyoruz.
		//Bunun amacı abstract metotun alt sınıfında kendine göre yazılmazı gerekiyorsa bunu alt sınıf kendine göre yazıyor
		//Bu örnekte de karenin ve dairenin alanları farklı hesaplandığı için alan hesapla metodunu abstract(soyut) olarak yazdık.
	}

}

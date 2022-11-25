package genelTekrar.example.yurtDisiCikisProgrami;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		
		System.out.println("Esenboğa Havaalanına Hoşgeldiniz");
		String sartlar = "Yurtdışı çıkış kuralları...\n" +
						 "Herhangi bir siyasi yasağınızın olmaması gerekiyor.\n" +
						 "15 TL Harç parasını yatırmış olmanız gerekiyor.\n" +
						 "Gideceğiniz ülkeye vizeniz olması gerekiyor.";
		String mesaj = "Yurtdışı şartlarından hepsini sağlamanız gerekiyor.";
		
		while ( true )
		{
			System.out.println("***********************************************************");
			System.out.println(sartlar);
			System.out.println("***********************************************************");
			
Yolcu yolcu = new Yolcu();
            
            System.out.println("Harç Bedeli Kontrol Ediliyor...");
            
            Thread.sleep(3000);
            if (yolcu.yurtDisiHarciKontrol() == false) {
                
                System.out.println(mesaj);
                continue;
            }
            
            System.out.println("Siyasi Yasak Kontrol Ediliyor...");
            Thread.sleep(3000);
            
            if (yolcu.siyasiYasak() == false) {
                System.out.println(mesaj);
                continue;
            }
            System.out.println("Vize Durumu Kontrol Ediliyor...");
            Thread.sleep(3000);
            
            if (yolcu.vizeDurumu() == false){
                System.out.println(mesaj);
                continue;
            }
            System.out.println("İşlemleriniz Tamam ! İyi Yolculuklar...");
            break;

		}
		
	}

}

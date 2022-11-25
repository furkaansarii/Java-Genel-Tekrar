package genelTekrar.oop.inheritance;

public class Main {

	public static void main(String[] args) {
		
		Muhendis muhendis = new Muhendis("Furkan", 10000, "Yazılım");
		
		Yonetici yonetici = new Yonetici("Murat", 25000, "Yönetim", 15);
		
		yonetici.zamYap(muhendis, 10);
		
		muhendis.bilgileriGoster();
		System.out.println("----------------------------------------------------");
		yonetici.bilgileriGoster();

	}

}

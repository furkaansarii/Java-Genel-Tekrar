package composition;

public class Main {
	
	public static void main(String[] args) {
		
		Resolotion resolotion = new Resolotion(1920, 1080);
		
		Kasa kasa = new Kasa("Asus", "ZXY-256", "Siyah");
		
		Monitör monitör = new Monitör("Acer", "Çin", 18, resolotion);
		
		Anakart anakart = new Anakart("Kingston", "ABD", 4);
		
		Bilgisayar pc = new Bilgisayar(kasa, anakart, monitör);
		
		pc.getMonitör().monitoruKapat();
		
		System.out.println(pc.getAnakart().getUretici());
		
	}

}

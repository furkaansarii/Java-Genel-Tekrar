package polymorphism;


class Hayvan {
	
	private String isim;

	public Hayvan(String isim) {
		super();
		this.isim = isim;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	public String konus()
	{
	
		return "Hayvan Konuşuyor";
	}
	
}

 class Kedi extends Hayvan {

	public Kedi(String isim) {
		super(isim);
	}

	@Override
	public String konus() {
		
		return getIsim() + " miyavlıyor";
		
	}

 }
 
 class Kopek extends Hayvan {

	public Kopek(String isim) {
		super(isim);
	}

	@Override
	public String konus() {
		
		return getIsim() + " Havlıyor";
	}

 }


public class Main {
	
	public static void main(String[] args) {
		Hayvan hayvan = new Kopek("Karabaş");
		System.out.println(hayvan.konus());
		
		
		
	}
	

}

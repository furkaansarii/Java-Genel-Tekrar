package genelTekrar.oop.inheritance;

public class Yonetici extends Calisan {

	private int sorumluKisiSayisi;
	public Yonetici(String isim, int maas, String departman, int sorumluKisiSayisi) {
		super(isim, maas, departman);
		this.sorumluKisiSayisi = sorumluKisiSayisi; 
	}
	
	public void zamYap(Muhendis muhendis, int zamMiktari)
	{
		muhendis.setMaas( muhendis.getMaas() + ( (muhendis.getMaas() ) * zamMiktari ) / 100 );
	}
	
	public void bilgileriGoster()
	{
		super.bilgileriGoster();
		System.out.println("Sorumlu kişi sayısı:"+ sorumluKisiSayisi);
	}

}

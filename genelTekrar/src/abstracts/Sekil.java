package abstracts;

public abstract class Sekil {
	
	private String isim;

	public Sekil(String isim) {
		super();
		this.isim = isim;
	}
	
	
	public String getIsim() {
		return isim;
	}


	public void setIsim(String isim) {
		this.isim = isim;
	}


	public void isminiSoyle()
	{
		System.out.println( "Bu obje " + isim + " objesidir" );
	}
	
	abstract void alanHesapla();
	
}

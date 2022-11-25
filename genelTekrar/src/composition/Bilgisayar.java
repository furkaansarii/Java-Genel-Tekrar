package composition;

public class Bilgisayar {
	
	private Kasa kasa;
	
	private Anakart anakart;
	
	private Monitör monitör;

	public Bilgisayar(Kasa kasa, Anakart anakart, Monitör monitör) {
		super();
		this.kasa = kasa;
		this.anakart = anakart;
		this.monitör = monitör;
	}

	public Kasa getKasa() {
		return kasa;
	}

	public void setKasa(Kasa kasa) {
		this.kasa = kasa;
	}

	public Anakart getAnakart() {
		return anakart;
	}

	public void setAnakart(Anakart anakart) {
		this.anakart = anakart;
	}

	public Monitör getMonitör() {
		return monitör;
	}

	public void setMonitör(Monitör monitör) {
		this.monitör = monitör;
	}
	
	

}

package genelTekrar.example.atm;

public class Hesap {
	
	private String kullaniciAdi;
	private String parola;
	private Double bakiye;
	
	
	public String getKullaniciAdi() {
		return kullaniciAdi;
	}
	
	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}
	
	public String getParola() {
		return parola;
	}
	
	public void setParola(String parola) {
		this.parola = parola;
	}
	
	public Double getBakiye() {
		return bakiye;
	}
	
	public void setBakiye(Double bakiye) {
		this.bakiye = bakiye;
	}
	
	public Hesap(String kullaniciAdi, String parola, Double bakiye) {
		super();
		this.kullaniciAdi = kullaniciAdi;
		this.parola = parola;
		this.bakiye = bakiye;
	}
	
	public void paraYatir(double tutar) {
		bakiye = bakiye + tutar;
	}
	
	public void paraCek(double tutar) {
		bakiye = bakiye - tutar;
	}
	
	public void bakiyeSorgula() {
		System.out.println(bakiye);
	}
	

}

package composition;

public class Anakart {
	
	private String marka;
	private String uretici;
	private int yuvaSayisi;

	public Anakart(String marka, String uretici, int yuvaSayisi) {
		super();
		this.marka = marka;
		this.uretici = uretici;
		this.yuvaSayisi = yuvaSayisi;
	}


	
	public String getMarka() {
		return marka;
	}


	public void setMarka(String marka) {
		this.marka = marka;
	}


	public String getUretici() {
		return uretici;
	}


	public void setUretici(String uretici) {
		this.uretici = uretici;
	}


	
	public int getYuvaSayisi() {
		return yuvaSayisi;
	}

	public void setYuvaSayisi(int yuvaSayisi) {
		this.yuvaSayisi = yuvaSayisi;
	}
	

}

package composition;

public class Monitör {
	
	private String model;
	
	private String uretici;
	
	private int boyut;
	
	private Resolotion resolotion;
	
	public void monitoruKapat()
	{
		System.out.println("Monitör Kapatılıyor");
	}

	public Monitör(String model, String uretici, int boyut, Resolotion resolotion) {
		super();
		this.model = model;
		this.uretici = uretici;
		this.boyut = boyut;
		this.resolotion = resolotion;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getUretici() {
		return uretici;
	}

	public void setUretici(String uretici) {
		this.uretici = uretici;
	}

	public int getBoyut() {
		return boyut;
	}

	public void setBoyut(int boyut) {
		this.boyut = boyut;
	}

	public Resolotion getResolotion() {
		return resolotion;
	}

	public void setResolotion(Resolotion resolotion) {
		this.resolotion = resolotion;
	}
	
	

}

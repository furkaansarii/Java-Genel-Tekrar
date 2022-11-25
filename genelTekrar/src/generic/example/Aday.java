package generic.example;

public abstract class Aday {
	
	private int turkceNet;
	private int fizikNet;
	private int matematikNet;
	private int edebiyatNet;
	
	
	public Aday(int turkceNet, int fizikNet, int matematikNet, int edebiyatNet) {
		super();
		this.turkceNet = turkceNet;
		this.fizikNet = fizikNet;
		this.matematikNet = matematikNet;
		this.edebiyatNet = edebiyatNet;
	}


	public int getTurkceNet() {
		return turkceNet;
	}


	public void setTurkceNet(int turkceNet) {
		this.turkceNet = turkceNet;
	}


	public int getFizikNet() {
		return fizikNet;
	}


	public void setFizikNet(int fizikNet) {
		this.fizikNet = fizikNet;
	}


	public int getMatematikNet() {
		return matematikNet;
	}


	public void setMatematikNet(int matematikNet) {
		this.matematikNet = matematikNet;
	}


	public int getEdebiyatNet() {
		return edebiyatNet;
	}


	public void setEdebiyatNet(int edebiyatNet) {
		this.edebiyatNet = edebiyatNet;
	}

	abstract int puanHesapla();

}

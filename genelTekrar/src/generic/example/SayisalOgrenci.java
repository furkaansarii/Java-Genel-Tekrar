package generic.example;

public class SayisalOgrenci extends Aday {

	public SayisalOgrenci(int turkceNet, int fizikNet, int matematikNet, int edebiyatNet) {
		super(turkceNet, fizikNet, matematikNet, edebiyatNet);
		
	}

	@Override
	public int puanHesapla() {
		
		return getTurkceNet() * 5 + getMatematikNet() * 5 + getFizikNet() * 4 + getEdebiyatNet() * 1;
	}

}

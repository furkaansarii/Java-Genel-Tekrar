package generic.example;

public class EsitAgirlikOgrenci extends Aday {

	public EsitAgirlikOgrenci(int turkceNet, int fizikNet, int matematikNet, int edebiyatNet) {
		super(turkceNet, fizikNet, matematikNet, edebiyatNet);
		
	}

	@Override
	public int puanHesapla() {
		
		return getTurkceNet() * 5 + getMatematikNet() * 5 + getFizikNet() * 1 + getEdebiyatNet() * 4;
	}

}

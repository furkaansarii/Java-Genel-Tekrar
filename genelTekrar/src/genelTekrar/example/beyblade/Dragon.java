package genelTekrar.example.beyblade;

public class Dragon extends Beyblade {

	private String kutsalCanavar;
	private String gizliYetenek;
	
	public Dragon(String beybladeci, int donusiHizi, int saldiriGucu, String kutsalCanavar, String gizliYetenek) {
		super(beybladeci, donusiHizi, saldiriGucu);
		this.kutsalCanavar = kutsalCanavar;
		this.gizliYetenek = gizliYetenek;
	}

	public String getKutsalCanavar() {
		return kutsalCanavar;
	}

	public void setKutsalCanavar(String kutsalCanavar) {
		this.kutsalCanavar = kutsalCanavar;
	}

	public String getGizliYetenek() {
		return gizliYetenek;
	}

	public void setGizliYetenek(String gizliYetenek) {
		this.gizliYetenek = gizliYetenek;
	}

	@Override
	public void kutsalCanavar() {
		super.kutsalCanavar();
		System.out.println(getBeybladeci() + " " + kutsalCanavar + " ı ortaya çıkartıyor");
	}

	@Override
	public void bilgileriGoster() {
		super.bilgileriGoster();
		System.out.println("Kutsal Canavar Adı:" + getKutsalCanavar());
		System.out.println("Gizli Yetenek:" + getGizliYetenek());
	}
	
	

}

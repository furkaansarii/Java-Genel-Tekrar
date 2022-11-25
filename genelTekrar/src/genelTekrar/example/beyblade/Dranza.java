package genelTekrar.example.beyblade;

public class Dranza extends Beyblade {
	
	private String kutsalCanavar;
	
	public Dranza(String beybladeci, int donusiHizi, int saldiriGucu, String kutsalCanavar) {
		super(beybladeci, donusiHizi, saldiriGucu);
		this.kutsalCanavar = kutsalCanavar;
	}

	public String getKutsalCanavar() {
		return kutsalCanavar;
	}



	public void setKutsalCanavar(String kutsalCanavar) {
		this.kutsalCanavar = kutsalCanavar;
	}



	@Override
	public void kutsalCanavar() {
		System.out.println(getBeybladeci() + " " + kutsalCanavar + " ı ortaya çıkartıyor." );
	}

	@Override
	public void bilgileriGoster() {
		super.bilgileriGoster();
		System.out.println("Beyblade Kutsal Canavarı:" + getKutsalCanavar());
	}
	

}

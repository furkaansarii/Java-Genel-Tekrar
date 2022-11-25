package genelTekrar.example.beyblade;

public class Beyblade {
	
	private String beybladeci;
	private int donusiHizi;
	private int saldiriGucu;
	
	
	
	public Beyblade(String beybladeci, int donusiHizi, int saldiriGucu) {
		super();
		this.beybladeci = beybladeci;
		this.donusiHizi = donusiHizi;
		this.saldiriGucu = saldiriGucu;
	}



	public String getBeybladeci() {
		return beybladeci;
	}



	public void setBeybladeci(String beybladeci) {
		this.beybladeci = beybladeci;
	}



	public int getDonusiHizi() {
		return donusiHizi;
	}



	public void setDonusiHizi(int donusiHizi) {
		this.donusiHizi = donusiHizi;
	}



	public int getSaldiriGucu() {
		return saldiriGucu;
	}



	public void setSaldiriGucu(int saldiriGucu) {
		this.saldiriGucu = saldiriGucu;
	}



	public void saldir( int saldiriGucu )
	{
		System.out.println( getBeybladeci() + " " + getSaldiriGucu() + " ve " + getDonusiHizi() + " ile saldırıyor." );
	}
	
	public void kutsalCanavar()
	{
		System.out.println("Bu beyblade in kutsal canavarı yok.");
	}
	
	public void bilgileriGoster()
	{
		System.out.println("Beyblade İsmi:" + getBeybladeci());
		System.out.println("Beyblade Dönüş Hızı:" + getDonusiHizi());
		System.out.println("Beyblade saldırı gücü:" + getSaldiriGucu());
	}

}

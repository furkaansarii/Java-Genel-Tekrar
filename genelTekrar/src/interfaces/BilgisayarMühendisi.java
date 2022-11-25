package interfaces;

public class BilgisayarMühendisi implements Muhendis {

	private boolean askerlik;
	private boolean adliSicil;
	
	
	
	public BilgisayarMühendisi(boolean askerlik, boolean adliSicil) {
		super();
		this.askerlik = askerlik;
		this.adliSicil = adliSicil;
	}

	@Override
	public void askerlikDurumSorgula() {
		
		if ( askerlik )
		{
			System.out.println("Askerliğimi Yaptım");
		}
		else
			System.out.println("Askerliğimi henüz yapmadım");
	}

	@Override
	public String mezuniyetOrtalamasi(double derece) {
		
		return "Ortalamam " + derece;
	}

	@Override
	public void adliSicilSorgula() {
		
		if ( adliSicil )
		{
			System.out.println("Adli sicil kaydım bulunmaktadır");
		}
		else
			System.out.println("Adli sicil kaydım bulunmamaktadır");
	}

	@Override
	public void isTecrubesi(String[] array) {
		
		if ( array != null )
		{
			System.out.println("Çalıtığım iş yerleri;");
			for ( int i = 0; i < array.length; i++ )
			{
				System.out.println(array[i]);
			}
		}
		else
			System.out.println("Daha önce bir işte çalışmadım");
		
	}

}

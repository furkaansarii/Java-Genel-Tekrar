package interfaces;

public class MakinaMuhendisi implements Muhendis, Calisma{

	private boolean askerlik;
	private boolean adliSicil;
	
	public MakinaMuhendisi(boolean askerlik, boolean adliSicil) {
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
	
	public void referansGetir( String[] array ){
		
		if ( array.length != 0 )
		{
			System.out.println("Referanslarım;");
			for ( int i = 0; i < array.length; i++ )
			{
				System.out.println(array[i]);
			}
		}
		else
			System.out.println("Referansım bulunmuyor");
	}

	@Override
	public void calis() {
		System.out.println("2. interface sınıfından implement ettiğim metot çalıştı");
		
	}

}

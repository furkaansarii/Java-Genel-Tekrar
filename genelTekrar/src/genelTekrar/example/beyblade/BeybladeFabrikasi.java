package genelTekrar.example.beyblade;

public class BeybladeFabrikasi {
	
	public Beyblade beybladeUret( String beyblade )
	{
	
		if ( beyblade.equals("Dragon") )
		{
			return new Dragon("Takao", 800, 300, "Mavi Ejderha", "Kutsal Canavarla Konuşmak");
		}
		else if ( beyblade.equals("Dranza") )
		{
			return new Dranza("Kai", 600, 400, "Kırmızı Anka Kuşu");
		}
		else if ( beyblade.equals("Drayga") )
		{
			return new Drayga("Rei", 800,250, "Beyaz Kaplan");
		}
		else if ( beyblade.equals("Draciel") )
		{
			return new Draciel("Max", 400, 1000, "Kara Kaplumbağa");
		}
		else
			return null;
	}

	
}

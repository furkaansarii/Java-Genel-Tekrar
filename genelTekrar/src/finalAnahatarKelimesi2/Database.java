package finalAnahatarKelimesi2;

public class Database {
	
	public final void baglantiKur( String userName, String password )
    {
		//aşağıda verilen userName in yani parametrelerin de değiştirilmemesini istiyorsak parametrelerde de final kullanılabilir.
		//userName = "furkan2"
		//Parametrelerde final kullanımı ise şu şekildedir;
		// public final void baglantiKur( final String userName, final String password ) {}
		
    	System.out.println( userName );
    	System.out.println( password );
    }

}

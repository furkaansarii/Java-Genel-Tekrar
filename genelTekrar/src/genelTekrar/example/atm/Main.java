package genelTekrar.example.atm;

public class Main {
	
	public static void main(String[] args) {
		
		Hesap hesap = new Hesap("furkan", "1234", 1000D);
		
		ATM atm = new ATM();
		atm.calis(hesap);
		System.out.println("by");
		
	}

}

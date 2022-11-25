package exceptionHandling;

public class FinallyBlokları {
	
	public static void main(String[] args) {
		
		try {
			int a = 30 / 0;
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally bloğu çalışıyor");
		}
		System.out.println("Burası finally bloğunun dışında olduğu için çalışmayacak çünkü doğru exceptionı yakalayamadık");
		//Finally bloğu try catch den sonra yazılabilir ve ne olursa olsun çalışması gereken kodlar için kullanılabilir.
		//Mesela veri tabanını kapatmamız gerekirse try catch de hatayı yakalayamazsak ve veri tabanının açık kalmasını istemezsek
		//finally içinde close işlemi yapılabilir.
		
	}

}

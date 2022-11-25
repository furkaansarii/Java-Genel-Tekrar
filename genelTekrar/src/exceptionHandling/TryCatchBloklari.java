package exceptionHandling;

public class TryCatchBloklari {
	
	public static void main(String[] args) {
		
	//	int a = 30 / 0; Hataya sebep olmuyor bu yüzden Unchecked Exception gelir
		
	//	int[] a = {1, 2, 3, 4, 5};
		System.out.println("Kod Çalışmıyor");
	//	System.out.println(a[6]); Bu da ArrayIndexOutOfBoundException dizide olmayan elemanı getiremezsin.
	//  dizide olmayan elemanı getirmeye çalıştığımız için altındaki kodlar artık çalışamaz hale geliyor bunun önüne geçmemiz gerekiyor.
		try {
			int[] a = {1, 2, 3, 4, 5};
			System.out.println(a[6]);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Kod Exception alsa bile devam edecek eğer hata almazsa catch bloklarının içerisine girmeyecek");
		}
		System.out.println("Ve devamındaki kodlar artık çalışabilecek");
		
		
	}

}

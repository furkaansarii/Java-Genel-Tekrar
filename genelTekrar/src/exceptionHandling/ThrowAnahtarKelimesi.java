package exceptionHandling;

import java.util.Scanner;

public class ThrowAnahtarKelimesi {
	
	 public static void mekanKontrol(int yas) {
	        
	        if (yas < 18) {
	            throw new ArithmeticException();
	            //throw sayesinde sitediğimiz durumlara olmayan exceptionları atabiliriz genellikle kendi exception sınıflarırımızı
	            //Yazdığımızda işimize yarayacak.
	            
	        }
	        else {
	            System.out.println("Mekana hoşgeldiniz...");
	        }
	        
	        
	    }
	    public static void main(String[] args) {
	        
	        
	        
	        
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Lütfen yaşınızı giriniz: ");
	        int yas = scanner.nextInt();
	        
	        try {
	            mekanKontrol(yas);
	        
	        }
	        catch (ArithmeticException e) {
	            
	            System.out.println("18 yaşından küçükler mekana giremez...");
	        }

	    }

}

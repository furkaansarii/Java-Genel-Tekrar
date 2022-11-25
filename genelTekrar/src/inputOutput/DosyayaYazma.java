package inputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DosyayaYazma {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;
	//	File file = new File( "dosya.txt" );
		
		try {
			fos = new FileOutputStream( "dosya.txt", true ); //dosyanın içeriği varsa sona ekle dosya yoksa oluştur demek true.
			
			/*
			fos.write(65); //ASCI deki 65.karekteri dosyaya yazacak
			fos.write(74);
			fos.write(74);
			*/
			fos.write(65);
			byte[] array = {101, 75, 66, 68};
			fos.write(array);  //byte array olarak yazdık gene ASCI karekterleriyle
			
			String s = "Furkan Sarı";   //Bu yöntem de Stringi yazma yöntemi.
			byte[] sArray = s.getBytes();
			fos.write(sArray);
			
		} catch (FileNotFoundException e) {
			
			System.out.println( "File Not Found Exception Oluştu" );
		} catch (IOException e) {
			
			System.out.println( "Dosyaya yazılırken bir hata oluştu" );
		}
		
		finally {
			try {
				fos.close();
			} catch (IOException e) {
				
				System.out.println( "Dosya Kapatılırken Bir Hata Oluştu" );
			}
		}

	}

}

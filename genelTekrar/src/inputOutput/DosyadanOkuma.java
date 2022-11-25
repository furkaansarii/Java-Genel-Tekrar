package inputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DosyadanOkuma {
	
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream( "dosya.txt" );
			
			int deger;
			String s = "";
			/*
			while (( deger = fis.read() ) != -1 )
			{
				s = s + (char) deger;
			}
			
			System.out.println(s);
			*/
			int say = 0;
			fis.skip(5);
			while (( deger = fis.read() ) != -1 )
			{
				s = s + (char) deger;
				say++;
				if ( say == 10 )
				{
					break;
				}
			}
			
			System.out.println(s);  //Dosyanın belirli bir yerinde itibaren belirli sayıda karekter yazdırma
		} catch (FileNotFoundException e) {

			System.out.println("Dosya Bulunamadı");
		} catch (IOException e) {
			System.out.println( "Dosya Okunamıyor" );
		}
		finally {
			try {
				if( fis != null ) {
					fis.close();
				}
				else
					System.out.println( "Açılamayan bir dosya kapatılamaz" );
			} catch (IOException e) {

				System.out.println( "Dosya Kapatılamadı" );
			}
		}
		
		
	}

}

package inputOutput.exampleMp3Kopyalamak;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	private static ArrayList<Integer> icerik = new ArrayList<Integer>();
	
	public static void dosyaOku() {
		try {
			FileInputStream in = new FileInputStream( "marş.mp3" );
			int oku;
			
			while( ( oku = in.read() ) != -1 )
			{
				icerik.add(oku);
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void kopyala( String dosyaIsmi ) {
		
		try {
			FileOutputStream fos = new FileOutputStream(dosyaIsmi);
			for( int deger : icerik )
			{
				fos.write(deger);
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		dosyaOku();
		
		long baslangic = System.currentTimeMillis();
		kopyala( "kopyalanmışMarş2.mp3" );
		long bitis = System.currentTimeMillis();
		System.out.println( "Dosyanız " + ( bitis - baslangic ) / 1000 + " saniyede kopyalandı" );
	}

}

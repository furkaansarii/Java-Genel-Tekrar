package inputOutput;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterileDosyayaYazmak {

	public static void main(String[] args) {
		
		FileWriter writer = null;
		try {
			writer = new FileWriter( "file.txt" );
			
			writer.write( "Mehmet Furkan Sarı\nBilgisayar Mühendisi" );
		} catch (IOException e) {
			System.out.println( "Dosya açılırken bir hata oluştu" );
		}
		
		finally {
			if( writer != null )
			{
				try {
					writer.close();
				} catch (IOException e) {
					System.out.println("Dosya kapatılırken bir hata oluştu");
				}
			}
		}
		
	}

}

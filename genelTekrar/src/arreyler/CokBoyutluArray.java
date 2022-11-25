package arreyler;

public class CokBoyutluArray {
	
	
	public static void main(String[] args) {
		
		int[] array = { 5, 4, 3, 2 };
		int[] [] array2 = { { 10, 20 }, { 30, 40 } } ;
		
	//	System.out.println(array2[0] [0]);
		
		for ( int i = 0; i < 2; i++ )
		{
			for ( int j = 0; j < 2; j++ )
			{
				System.out.print(array2[i] [j] + " ");
			}
			System.out.println("");
		}
		
	}
}

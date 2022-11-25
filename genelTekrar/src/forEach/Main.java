package forEach;

public class Main {

	public static void main(String[] args) {
		
		String[] array = {"Elma", "Armut", "Kiraz"};
		
		for ( int i = 0; i < array.length; i++ )
		{
			System.out.println(array[i]);
		}
		
		System.out.println("---------------------------------------------");
		System.out.println("ForEach Döngüsü");
		
		for ( String a : array )
		{
			System.out.println(a);
		}
		System.out.println("---------------------------------------------");
		System.out.println("Örnek 2");
		
		int[] array2 = { 1, 2, 3, 4, 5 };
		for ( int i : array2 )
		{
			System.out.println(i);
		}
		
		System.out.println("---------------------------------------------");
		System.out.println("Örnek 3");
		
		Deneme[] deneme = { new Deneme("Mehmet"), new Deneme("Furkan"), new Deneme("Sarı") };
		
		for ( Deneme d : deneme )
		{
			d.yaz();
		}

	}

}

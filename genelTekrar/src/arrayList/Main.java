package arrayList;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Mehmet");
		arrayList.add("Furkan");
		arrayList.add("Sarı");
		
		System.out.println(arrayList.get(2));
		System.out.println(arrayList.size());
		
	//	arrayList.remove("Sarı"); İndex ya da Obje alıyor
	//	arrayList.remove(1); 
		
		for ( int i = 0; i < arrayList.size(); i++ )
		{
			System.out.println(arrayList.get(i));
		}
		
		System.out.println("Listedeki elemanın kaçıncı indexde olduğunu öğrenme");
		System.out.println(arrayList.indexOf("Furkan"));
		
		System.out.println("Güncelleme metodu kullanmak. Direkt kaçıncı indexi güncellemek istediğini ve yeni elemanı giriyosun");
		arrayList.set(0, "Ahmet");
		
		for ( int i = 0; i < arrayList.size(); i++ )
		{
			System.out.println(arrayList.get(i));
		}
		
		System.out.println("ArrayLisleri metoda göndermek");
		arrayiBastir(arrayList);
		
	}
	
	public static void arrayiBastir(ArrayList<String> array)
	{
		for ( int i = 0; i < array.size(); i++ )
		{
			System.out.println(array.get(i));
		}
	}

}

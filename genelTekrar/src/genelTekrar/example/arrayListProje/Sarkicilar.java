package genelTekrar.example.arrayListProje;

import java.util.ArrayList;

public class Sarkicilar {
	
	private ArrayList<String> sarkiciListesi = new ArrayList<String>();
	
	public void sarkicilariBastir()
	{
		System.out.println("Şarkıcı Listesinde " + sarkiciListesi.size() + " kadar şarkıcı var");
		
		for ( int i = 0; i < sarkiciListesi.size(); i++ )
		{
			System.out.println( ( i + 1 ) + ".Şarkıcı " + sarkiciListesi.get(i) );
		}
	}
	
	public void sarkiciEkle(String isim)
	{
		sarkiciListesi.add(isim);
		System.out.println("Şarkıcı Listesi Güncellendi");
	}
	
	public void sarkiciGuncelle(String yeniSarkici, int pozisyon)
	{
		sarkiciListesi.set(pozisyon, yeniSarkici);
		System.out.println("Şarkıcı Listesi Güncellendi");
	}
	
	public void sarkiciSil(int pozisyon)
	{
		String isim = sarkiciListesi.get(pozisyon);
		sarkiciListesi.remove(pozisyon);
		System.out.println( isim + "Adlı Şarkıcı Silindi" );
	}
	
	public void sarkiciAra( String sarkici )
	{
		int pozisyon = sarkiciListesi.indexOf(sarkici);
		if ( pozisyon >= 0 )
		{
			System.out.println( "Aradığınız şarkıcı" + ( pozisyon + 1 ) + ". sıradadır" );
		}
		else
			System.out.println("Aradığınız şarkıcı Listede yok");
	}

}

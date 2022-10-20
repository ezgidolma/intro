package intro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		//camelCase
		// Don't Repeat Yourself
		String internetSubeButonu = "İnternet Şubesi"; 
		double dolarDun=8.15;
		double dolarBugun=8.18;
		int vade=36;
		boolean dustuMu=false;
		
		System.out.println(internetSubeButonu);
		
		if (dolarBugun<dolarDun) {
			System.out.println("Dolar düşmesi resmi");
		}
		else if(dolarBugun>dolarDun) {
			System.out.println("Dolar artış resmi");
		}
		else  {
			System.out.println("Dolar eşittir resmi");
		}
		
		String[] krediler= 
			{
				"Hızlı Kredi",
				"Mutlu Emekli Kredi",
				"Konut Kredisi",
				"Çiftçi Kredisi",
				"Msb Kredisi",
				"Meb Kredisi",
				"Kültür Bakanlığı Kredisi"
		};
		
		for(int i=0;i<krediler.length;i++){
			System.out.println(krediler[i]);
		}
		
		for(String kredi: krediler) {
			System.out.println(kredi);
		}
	}

}

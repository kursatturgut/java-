import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManavProjesi {
	static List<String>manav=new  ArrayList<>();
    static 	List<Double>fiyat=new ArrayList<>();
  static  double total=0;


	public static void main(String[] args) {
		 /*
         * Basit bir 5 �r�nl� manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         *           istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         *           Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */
		manav.add("elma");
	    manav.add("armut");
		manav.add("portakal");
		manav.add("mandalina");	
		manav.add("muz");
		manav.add("kavun");	

		fiyat.add(8.0);
		fiyat.add(7.0);
		fiyat.add(4.0);
		fiyat.add(1.0);
		fiyat.add(9.0);
		fiyat.add(3.0);


Scanner scan=new Scanner(System.in);

	�r�nSe�();
	
	}

	private static void kasa() {
		System.out.println("�cret toplam�:"+total);		
	}

	private static void �r�nSe�() {
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen almak istedi�iniz �r�n� yyaz�n�z (oelma i�in 0) (armuti�in 1) portakal 2 mandalina 3 muz 4 kavun 5   ");
	
		int secim=scan.nextInt();
		if (secim<0 || secim>5) {
			System.out.println("l�tfen ge�erli bir se�im yap�n�z");
		�r�nSe�();
		
		}
	    System.out.println("ka� kilo istedi�inizi griniz");
	    int kilo=scan.nextInt();
       double  tutar=fiyat.get(secim);
	  double enToplam=tutar*kilo;
	 total+=enToplam;
	System.out.println("devam etmek i�in d  bitirmek i�in � bas�n�z ");
	String i�lem=scan.next();
	if (i�lem.equalsIgnoreCase("d")) {
		�r�nSe�();
	}else {
		kasa();
	}
	
	
	}
	
	

}





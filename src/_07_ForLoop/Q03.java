package _07_ForLoop;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
	/*
	 * Girilen bir stringdeki a harfi say�s�n� bulunuz. ama c harfine gelirse
	 * d�ng�den ��k�ls�n
	 * 
	 * Bug�n hava oldukca g�zel.-> 2
	 *  
	 */
   
   Scanner scan=new Scanner (System.in);
   System.out.println("l�tfen bir string griniz");
   String cumle=scan.nextLine();
   int saya�=0;
   char harf='a';
   for (int i = 0; i <cumle.length(); i++) {
	     if (cumle.toLowerCase().charAt(i)=='a') {
			saya�++;
			
		} else if (cumle.toLowerCase().charAt(i)=='c') {
			break;
		}
	   
	   
	   
	   
}
   System.out.println(saya�);
   
   
   
   
   
    
   
    
    
    
    
    
    
    
    }}
   
   
   
   
    
    
    
    
    
    
    
    
    
    
    
    
   



package _04_switchCase1haluk;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

// Girilen bir ay numaras�na g�re , ay�n ka� g�n  oldugunu say� ile yazd�r�nz
Scanner scan=new Scanner(System.in);
System.out.print("l�tfen ay numaras�n� giriniz");
int ayno=scan.nextInt();

switch (ayno) {
case 1:
case 3:
case 5:
case 7:
case 8:
case 10:
case 112:
	System.out.println("31 g�n");
	break;
case 4:
case 6:
case 9:
case 11:
	System.out.println("30 g�n");
	break;
case 2:
	
	System.out.print("y�l� giriniz");
	int y�l=scan.nextInt();
	if (y�l%4==0) {
		System.out.println("29 g�n");
	}else {
		System.out.println("28 g�n");
	}
	
	break;

default:
	System.out.println("ge�erli bir ay griniz");
	break;
}    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
}


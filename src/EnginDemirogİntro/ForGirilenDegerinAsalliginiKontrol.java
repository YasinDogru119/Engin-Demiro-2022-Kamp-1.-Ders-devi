



package EnginDemirogİntro;

import java.util.Scanner;    
public class ForGirilenDegerinAsalliginiKontrol {

	public static void main(String[] args) {
	
	
		 Scanner scan = new Scanner(System.in);
	        
	        System.out.print("Bir sayi giriniz: ");
	        int Deger = scan.nextInt();
	        int sayac = 0;
	        
	        for(int i = 2; i < Deger; i++)
	        {
	            if(Deger % i == 0) {
	                sayac++;
	               
	            }
	        }
	        if(sayac == 0) {
	            System.out.println(Deger + " Asal bir sayidir.");
	        }
	        else  {
	            System.out.println(Deger + " Asal bir sayi degildir.");
	        }
	        
	    }
}



 
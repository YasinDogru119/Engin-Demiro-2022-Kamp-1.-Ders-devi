package EnginDemirogİntro;


public class DegiskenlerBorcSuresiHesaplama {

	public static void main(String[] args) {

		double Bakiye = 13406.83 ;
		double Borc = 46326 ;
		String Name = "Yasin" ;
		String Surname = "Doğru" ;
		double MaasKesintiorani = 0.46 ;
		double Borcbitimkacgün  ;
		double x = (Borc / (Bakiye * MaasKesintiorani) ) ;
	    
		Borcbitimkacgün = x ;
		
		
		System.out.println("MÜŞTERİ ADI = "+ Name + "  " + Surname) ;
		System.out.println("GÜNCEL BORCU =  " + Borc) ;
		System.out.println("Borcunuz Maaşınızdan her ay %46 bir oranda kesilerek ortalama  "
		+ Borcbitimkacgün + " Ay olarak hesaplanmıştır ") ;
		
		
	
   
	}
	

}


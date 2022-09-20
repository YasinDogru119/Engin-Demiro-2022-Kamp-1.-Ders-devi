package EnginDemirogİntro;

public class sartBloklarivkiHesaplama {

	public static void main(String[] args) {
	
		double Kilo = 69 ;
		double Boy = 1.80 ;
	    double Vki = (Kilo/(Boy * Boy)) ; 
	 
	    
	    if(Vki < 18.5)  {
		   
		   System.out.println("VKİ SONUCUNUZ = " + Vki +  "İdeal kilonun altındasınız" ) ;
	   }
	   
	   else if   (18.5 < Vki && Vki < 24.9 ) {
		   System.out.println("VKİ SONUCUNUZ = " + Vki + "İdeal kilodasınız");
		   
	   }
	   
	   
	   else if (25 < Vki && Vki < 29.9  ) {
		   System.out.println("VKİ SONUCUNUZ = " + Vki +  "İdeal kilonun üzerindesiniz");
		   
		   
		   
	   }
	   
	   else if ( 30  < Vki && Vki < 39.9) {
		   System.out.println("VKİ SONUCUNUZ = " +  Vki  + "İdeal kilonun çok  üzerindesiniz (OBEZ)");
		   
		   
		   
		   
		   
	   }
	   
	   else if (Vki > 40 ) {
		   System.out.println("VKİ SONUCUNUZ = " + Vki +  "İdeal kilonun Çok fazla üzerindesiniz (Morbid Obez)");
		   
		   
		 
		   
		   
	   }
	   
	 
	
   
	}
	

}
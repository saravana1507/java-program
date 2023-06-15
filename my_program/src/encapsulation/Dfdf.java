package encapsulation;

	public class Dfdf {

		 private int Ac_No;
		 private String IFSC;
		 private int ATM_PIN;
		 private int CCV;

		  
		 Dfdf(int Ac_No,int ATM_PIN,int CCV) {
		   this.Ac_No=Ac_No;
		   this.ATM_PIN = ATM_PIN;
		   this.CCV = CCV;
		  }
		 Dfdf(String IFSC){
		   this.IFSC=IFSC;
		  }
		 
		 
		  void getAc_No() {
		   System.out.println("The Customer Account:"+Ac_No);
		  }
		   void getIFSC(){
		   System.out.println("The Customer IFSC Code:"+IFSC);
		   
		  }
		   void getATM_PIN(){
		    System.out.println("The Customer ATM_PIN:"+ATM_PIN);
		    
		   }
		   void getCCV(){
		    System.out.println("The Customer CCV:"+CCV);
		    
		   }
		  
		 

		 public static void main(String arg[]) {
		  Dfdf ob = new Dfdf(1234,12435,987);
		  ob.getATM_PIN();
		  
		 }


}
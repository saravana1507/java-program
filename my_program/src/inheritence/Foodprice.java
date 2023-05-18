package inheritence;

public class Foodprice {
	 public int food(int pizza,int burger,int french_fry)
	  {
	   
	    int food_total= pizza+burger+french_fry;
    System.out.println("pizza amount= Rs."+pizza+"\n"+"burger amount= Rs." +burger+"\n"+"french fry amount= Rs."+french_fry);
	    return food_total; 
	  }
	  public int drinks(int coca_cola,int pepsi,int slice)
	    {
	    int drinks_total= coca_cola+pepsi+slice;
	    System.out.println("coca cola amount= Rs."+coca_cola+"\n"+"pepsi amount= Rs."+pepsi+"\n"+"slice amount= Rs."+slice+"\n");

	    return drinks_total; 
	    } 
	  public int total(int food_total,int drinks_total)
	  {
	  	int full_total= food_total+drinks_total;
	    System.out.println("total amount= Rs."+full_total+"\n");

	  	return full_total;
	  	}
}

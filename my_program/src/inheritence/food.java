package inheritence;

public class food extends Foodprice {

public int discount(int num  )
{
	System.out.println("discount = 10%");
   int avg=(num*10)/100;
   System.out.println("discount amount= Rs."+avg);
   return avg;
}
public int amount(int price,int disc)
{
	int total=price-disc;
	System.out.println("discount  to total amount= Rs."+total+"\n");
	return total;
}
}

package withoutloop;
//encapsulation 

public class Bank_detail {
private int bal;
void credit(int amt) {
	bal=bal+amt;
	System.out.println("succeful deposited");
}
void debit(int amt)
{
	bal=bal-amt;
	System.out.println("succeful debiited");
}
void check(){
	System.out.println(bal);
}
}

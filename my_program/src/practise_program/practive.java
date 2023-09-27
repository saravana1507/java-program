package practise_program;
 public class practive{
	 public static void main(String[] args) {
 int a[]= {1,2,3,4,5,7,9,10,12,15};
  int n=0;
 for(int i=0;i<a.length;i++)
 {
	 if(i==n)
	 {
		 System.out.println(a[i]);
		 n=a[i+1]+i;
	 }
 }
   int g=3,h=5;
   System.out.println("total= "+g+h);
   System.out.println(g+h);
 }
}
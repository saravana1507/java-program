package array;

public class Min_max_middle_indexnumber {

	public static void main(String[] args) {
		Input.size();
		Input.number();  
	  Min_max_middle_indexnumber ob=new Min_max_middle_indexnumber();
	  ob.min_index();
	}

	void min_index()
	{ 
		System.out.println();
		if(Input.a.length%2!=0)
	{
		int mid=Input.a.length/2;
		System.out.println("middile index number = "+Input.a[mid]);
	}
	  if(Input.a.length%2==0)
		{
			int mid=Input.a.length/2;
			System.out.println("middile index number = "+Input.a[mid]);
			System.out.println("middile index number = "+Input.a[mid-1]);
		}
	  System.out.println("first index number = "+Input.a[0]);
	  System.out.println("last index number = "+Input.a[Input.a.length-1]);

	}
	

}

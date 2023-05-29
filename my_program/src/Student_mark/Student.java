package Student_mark;

import java.util.Scanner;
public class Student implements State_student{
	 String name,dob,school,district,state,dept;
	 int num,std;
	int tamil, english,math, science,social;
	int physics,chemistry,biology,cs;
	int economics,commerce,accounts;
	 int total;
	double avg;

	
  public void head()
{
	System.out.println("         STUDENT MARKLIST---(2023)\n");
}
	
public  void detail()
{  head();
	Scanner s=new Scanner(System.in);
	System.out.print("enter the  name =");
	 name= s.nextLine();
	System.out.print("\nenter the Roll number =");
	 num= s.nextInt();
	System.out.print("\ndate of birth (DD-MM-YYYY) =");
	  dob= s.next();
	System.out.print("\nenter the school name=");
	 school= s.next();
	System.out.print("\nenter the District name =");
	 district= s.next();
	System.out.print("\nenter the state name =");
	 state= s.next();
	System.out.print("\nenter the class (10 or 12) =");
	 std= s.nextInt();
	 if(std!=10&&std!=12)
	 {
		 System.out.println("please check class");
	 }
 
}
 public void mark()
{    detail(); 
	Scanner s=new Scanner(System.in);
	 switch(std)
     {
     case 10:
     {   
    	   System.out.print("\nTamil mark = ");
    		 tamil= s.nextInt();
    		System.out.print("\nEnglish mark = ");
    		 english= s.nextInt();
    		System.out.print("\nMaths mark = " );
    		 math= s.nextInt();
    		System.out.print("\nscience mark = ");
    		 science= s.nextInt();
    		System.out.print("\nsocial science mark = ");
    		 social= s.nextInt();
    		 total= tamil+english+math+science+social;
    		 avg=total/5;
    		 System.out.println("\n\nstudent data stored");
    		 break;

     }
     case 12:
     {
    	 System.out.print("\nwhich department (biology/computer science/arts) =");
    	  dept= s.nextLine();
    	  if(dept!="biology"&&dept!="computer science"&&dept!="arts")
    	  {
    		  System.out.println("please check department name");
    	  }
    	 switch (dept)
    	 {
    	 case "biology":
    	 {
    		   System.out.print("\nTamil mark =");
       		tamil= s.nextInt();
       		System.out.print("\nEnglish mark =");
       		 english= s.nextInt();
       		System.out.print("\nMaths mark =");
       		 math= s.nextInt();
       		System.out.print("\nphysics mark=");
       		 physics= s.nextInt();
       		System.out.print("\nchemistry  mark = ");
       		 chemistry= s.nextInt();
       		System.out.print("\nbiology mark = ");
       		 biology= s.nextInt();
            total=tamil+english+math+physics+chemistry+biology;
            avg=total/6;
            System.out.println("\n\nstudent data stored");
            break;
    	 }
    	 case "computer science":
    	 {
    		   System.out.print("\nTamil mark =");
       		 tamil= s.nextInt();
       		System.out.print("\nEnglish mark =");
       		 english= s.nextInt();
       		System.out.print("\nMaths mark =");
       		 math= s.nextInt();
       		System.out.print("\nphysics mark=");
       		 physics= s.nextInt();
       		System.out.print("\nchemistry mark = ");
       		 chemistry= s.nextInt();
       		System.out.print("\ncomputer science mark = ");
       		 cs= s.nextInt();
            total=tamil+english+math+physics+chemistry+cs;
            avg=total/6;
            System.out.println("\n\nstudent data stored");
            break;
    	 }
    	 case "arts":
    	 {
    		   System.out.print("\nTamil mark =");
       		 tamil= s.nextInt();
       		System.out.print("\nEnglish mark =");
       		 english= s.nextInt();
       		System.out.print("\ncomputer science mark =");
       		 cs= s.nextInt();
       		System.out.print("\neconomics mark=");
       		economics= s.nextInt();
       		System.out.print("\ncommerce mark = ");
       		 commerce= s.nextInt();
       		System.out.print("\naccountancy mark = ");
       		 accounts= s.nextInt();
            total=tamil+english+cs+economics+commerce+accounts;
            avg=total/6;
            System.out.println("\n\nstudent data stored");         
            break;
          }
        }
    	 		 
     }
     
     }
}
	public void display() {	
		mark();
		if(std==10||std==12) {
	if(dept=="biology"||dept=="computer science"||dept=="arts") {
		System.out.println("\n\n\n\n-------------------------------------------------------");
	System.out.println("-----------------------STUDENT MARK LIST----------------");
	System.out.println("---------------------------------------------------------");
	System.out.print("Student Name = " +name +"\t\tStudent Roll Number = "+num+"\nDate Of Birth = "+dob+"\t\tSchool name = " +school +"\n");
		System.out.print("District  = "+district+"\t\tState = "+state+"\nClass ="+std);
	}}}
 public void mark_detail()	
{  display();
	switch(std)
	{
	case 10:{
		System.out.println("\n-----------------------------------");
		System.out.println("  SUBJECT\t\tMARK ");
		System.out.println("-----------------------------------");
	System.out.println("\nTamil mark =\t\t" +tamil +"\nEnglish mark  =\t\t"+english+"\nMaths mark = \t\t"+math+"\nScience mark =\t\t"+science+"\nSocial mark =\t\t"+social);
	System.out.println("-----------------------------------");
	System.out.println("total =                "+total+"\n-----------------------------------"+"\navarage =               "+avg+"%");
	if(tamil>34&&english>34&&math>34&&science>34&&social>34)
	{   System.out.println("-----------------------------------");
		System.out.println("Result                   PASS");
		System.out.println("-----------------------------------");
	}
	else
	{System.out.println("-----------------------------------");
		System.out.println("Result                    FAIL");
		System.out.println("-----------------------------------");
	}
	break;
	}
	case 12:{
		if(dept=="biology"&&dept=="computer science"&&dept=="arts")
		switch(dept)
		{
		
		case"biology":
		{System.out.print("\t\t\tdepartment="+dept);
			System.out.println("\n-----------------------------------");
			System.out.println("  SUBJECT               MARK ");
			System.out.println("-----------------------------------");
		System.out.println("\nTamil mark = \t\t"+tamil +"\nEnglish mark  =\t\t"+english+"\nMaths mark =\t\t"+math+"\nPhysics mark =\t\t"+physics+"\nChemistry mark =\t"+chemistry+"\nBiology mark =\t\t"+biology);
		System.out.println("-----------------------------------");
		System.out.println("total =                "+total+"\n-----------------------------------"+"\navarage =              "+avg+"%");
		//System.out.println("student data stored");
		
		if(tamil>34&&english>34&&math>34&&physics>34&&chemistry>34&&biology>34)
		{
			System.out.println("-----------------------------------");
			System.out.println("Result                 PASS");
			System.out.println("-----------------------------------");
		}
		else
		{   System.out.println("-----------------------------------");
			System.out.println("Result                  FAIL");
			System.out.println("-----------------------------------");
		}
		break;
		}
		case"computer science":
		{System.out.print("\t\tdepartment="+dept);
			System.out.println("\n-----------------------------------");
			System.out.println("  SUBJECT               MARK ");
			System.out.println("-----------------------------------");

		System.out.println("\nTamil mark =\t\t" +tamil +"\nEnglish mark  =\t\t"+english+"\nMaths mark =\t\t"+math+"\nPhysics mark =\t\t"+physics+"\nChemistry mark =           "+chemistry+"\nComputer Science mark =   \t"+cs);
		System.out.println("-----------------------------------");
		System.out.println("total =                  "+total+"\n-----------------------------------"+"\navarage =               "+avg+"%");
		//System.out.println("student data stored");
		if(tamil>34&&english>34&&math>34&&physics>34&&chemistry>34&&cs>34)
		{   System.out.println("-----------------------------------");
			System.out.println("Result                   PASS");
			System.out.println("-----------------------------------");
		}
		else
		{System.out.println("-----------------------------------");
			System.out.println("Result                   FAIL");
			System.out.println("-----------------------------------");
		}
		break;
		}
		case"arts":
		{System.out.print("\t\tdepartment="+dept);
			System.out.println("\n-----------------------------------");
			System.out.println("  SUBJECT               MARK ");
			System.out.println("-----------------------------------");

		System.out.println("\nTamil mark =\t\t" +tamil +"\nEnglish mark  =\t\t"+english+"\nComputer science mark =\t"+cs+"\nEconomics mark =\t"+economics+"\nCommerce mark =\t\t"+commerce+"\nAccounts mark =\t\t"+accounts);
		System.out.println("-----------------------------------");
		System.out.println("total =                 "+total+"\n-----------------------------------"+"\navarage =              "+avg+"%");
		//System.out.println("student data stored");
		if(tamil>34&&english>34&&cs>34&&economics>34&&commerce>34&&accounts>34)
		{   System.out.println("-----------------------------------");
			System.out.println("Result                    PASS");
			System.out.println("-----------------------------------");
		}
		else
		{System.out.println("\n-----------------------------------");
			System.out.println("Result                      FAIL");
			System.out.println("-----------------------------------");
		}
		break;
		}
	}
}
	
}
}
public  void check()
{ Scanner s=new Scanner(System.in);
	System.out.print("\n\nIf you again insert student details (yes/no) = ");
	String x=s.nextLine();
	switch(x)
	{
	case "yes":
	{    //mark();
		 mark_detail();
		 check();
	}
	case"no":
	{
		System.out.println("\n\n       -----thank you------");
	}
}
}
}
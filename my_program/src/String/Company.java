package String;

import java.util.Arrays;

public class Company  implements Comparable <Company> {
	 private int idnum;
	 private String name;
	 private int age;
	 private String designation;
	 private int salary;

	 public Company(int idnum, String name, int age, String designation, int salary) {
		super();
		this.idnum = idnum;
		this.name = name;
		this.age = age;
		this.designation = designation;
		this.salary = salary;
	}
	public int getIdnum() {
		return idnum;
	}
	public void setIdnum(int idnum) {
		this.idnum = idnum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String toString() {
		return "Company [idnum=" + idnum + ", name=" + name + ", age=" + age + ", designation=" + designation
				+ ", salary=" + salary + "]";
	}
	
	/*
	 * public int compareTo(Company o) { if(this.getSalary()>o.getSalary()) { return
	 * 1; } if(this.getSalary()<o.getSalary()) { return -1; } return 0; }
	 */
	
	  public int compareTo(Company o) { 
		  return this.getDesignation().compareTo(o.getDesignation()); }
	 
	
	public static void main(String[] args) {
	 	
	Company employee1=new Company(1000,"saravana",26,"java developer",25000);
	Company employee2=new Company(1001,"rahul",24," dotnet developer",24000);
	Company employee3=new Company(1002,"mahadevan",22,"software tester",25000);
	Company employee4=new Company(1003,"senthil",24,"ui developer",27000);
	Company employee5=new Company(1004,"kavin",23,"java  developer",26000);
	Company employee6=new Company(1005,"lajeem",23,"software tester",23000);
	Company []store= {employee1,employee2,employee3,employee4,employee5,employee6};
	    Arrays.sort(store);
	System.out.println("ordey by designation");
	    for(Company i:store)
	    {
	    	System.out.println(i);
	    }
	    
	}

}

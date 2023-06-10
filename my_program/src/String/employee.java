package String;

import java.util.Objects;

public class employee {
	private int employeeid;
	private String name;
	private int age;
	private long adhaar;
	
	public employee(int employeeid, String name, int age, long adhaar) {
		super();
		this.employeeid = employeeid;
		this.name = name;
		this.age = age;
		this.adhaar = adhaar;
	}


	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
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

	public long getAdhaar() {
		return adhaar;
	}

	public void setAdhaar(long adhaar) {
		this.adhaar = adhaar;
	}


	@Override
	public int hashCode() {
		return Objects.hash(adhaar)*123;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		employee other = (employee) obj;
		return adhaar == other.adhaar;
	}


	@Override
	public String toString() {
		return "employeeid=" + employeeid + ", name=" + name + ", age=" + age + ", adhaar=" + adhaar;
	}


	public static void main(String[] args) {
	employee customer1=new employee(1, "saravana", 25, 2345678);
	employee customer2=new employee(2, "rahul", 23, 2345778);
	employee customer3=new employee(3, "senthil", 23, 2345678);
System.out.println(customer1.toString());
System.out.println(customer2.toString());
System.out.println(customer3.toString());
System.out.println(customer1.hashCode());
System.out.println(customer2.hashCode());
System.out.println(customer3.hashCode());
System.out.println(customer1.equals(customer2));
System.out.println(customer1.equals(customer3));
System.out.println(customer2.equals(customer3));


	
	
	}
}
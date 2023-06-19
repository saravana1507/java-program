package employee_details_String;

import String.Company;

public class Employee_detail {

	private int idnum;
	private String name;
	private int age;
	private String designation;
	private int salary;

	public Employee_detail(int idnum, String name, int age, String designation, int salary) {
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
		return "idnum=" + idnum + ", name=" + name + ", age=" + age + ", designation=" + designation + ", salary="
				+ salary;
	}

}

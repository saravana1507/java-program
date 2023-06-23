package employee_details_String;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(age, designation, idnum, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee_detail other = (Employee_detail) obj;
		return age == other.age && Objects.equals(designation, other.designation) && idnum == other.idnum
				&& Objects.equals(name, other.name) && salary == other.salary;
	}

}

package MobileShop;

import java.util.Objects;

public class Mobile {
  private String name;
  private String model;
  private int year;
  private String ram;
  private int capacity;
  private String colour;
  private int price;
  
public Mobile(String name, String model, int year, String ram, int capacity, String colour, int price) {
	super();
	this.name = name;
	this.model = model;
	this.year = year;
	this.ram = ram;
	this.capacity = capacity;
	this.colour = colour;
	this.price = price;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

public String getRam() {
	return ram;
}

public void setRam(String ram) {
	this.ram = ram;
}

public int getCapacity() {
	return capacity;
}

public void setCapacity(int capacity) {
	this.capacity = capacity;
}

public String getColour() {
	return colour;
}

public void setColour(String colour) {
	this.colour = colour;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public int hashCode() {
	return Objects.hash(capacity, colour, model, name, price, ram, year)*12342*12;
}

public String toString() {
	return "Mobile name=" + name + ", model=" + model + ", year=" + year + ", ram=" + ram + ", capacity=" + capacity
			+ ", colour=" + colour + ", price=" + price ;
}
  

}

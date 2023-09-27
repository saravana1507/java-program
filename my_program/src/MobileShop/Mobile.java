package MobileShop;

import java.util.Objects;

public class Mobile {
  private String name;
  private String model;
  private int year;
  private String ram;
  private int capacity;
  private int price;
  private long imei;
  
public Mobile(String name, String model, int year, String ram, int capacity, int price, int imei) {
	super();
	this.name = name;
	this.model = model;
	this.year = year;
	this.ram = ram;
	this.capacity = capacity;
	this.price = price;
	this.imei=imei;
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

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public int getImei() {
	return price;
}

public void setImei(int imei) {
	this.imei = imei;
}

public int hashCode() {
	return Objects.hash(capacity, imei, model, name, price, ram, year);
}

public String toString() {
	return  name + " --" + model + "  -- " + year + " -- " + ram + " -- " + capacity
			+ " -- " + price+" -- "+imei ;
}

public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Mobile other = (Mobile) obj;
	return  imei == other.imei;
		
}
  

}

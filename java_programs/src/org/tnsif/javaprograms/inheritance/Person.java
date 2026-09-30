package org.tnsif.javaprograms.inheritance;

public class Person {
private String name;
private String city;
protected Address address;

public Person() {
	this.name="Rahul";
	this.city="Mysore";
	
}
public Person(String name, String city,Address address) {
	this.name = name;
	this.city = city;
	this.address=address;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
}

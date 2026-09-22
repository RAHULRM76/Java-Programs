package org.tnsif.javaprograms.basics;

public class Main {

	public static void main(String[] args) {
		Student obj=new Student();
		obj.setsID(101);
		obj.setsName("Rahul");
		obj.display();
		System.out.println(obj.hashCode());
		
		Student obj1=new Student(102,"Siddu");
		obj1.display();
		System.out.println(obj1.hashCode());

	}

}

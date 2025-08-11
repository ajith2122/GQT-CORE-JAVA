package com.gqt.corejava.Encapsulation;
class Dog1{
	private String name;
	private String color;
	private String breed;
	private int age;
	private int cost;

void setData1(String name,String color,String breed,int age,int cost) {
	this.name = name;
	this.color = color;
	this.breed = breed;
	this.age = age;
	this.cost=cost;
}
void getData() {
	System.out.println("Name="+name);
	System.out.println("Color="+color);
	System.out.println("Breed="+breed);
	System.out.println("Age="+age);
	System.out.println("Cost="+cost);
  }
}
public class Example3 {

	public static void main(String[] args) {
		Dog1 d2 = new Dog1();
		d2.setData1("jacky","White","GR",14,9000);
		d2.getData();
		

	}

}



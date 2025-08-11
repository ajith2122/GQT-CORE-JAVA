package com.gqt.corejava.Encapsulation;
class Dog{
	private String name;
	private String color;
	private String breed;
	private int age;
	private int cost;

void setData1(String name,String color,String breed,int age,int cost) {
	name = name;
	color = color;
	breed = breed;
	age = age;
	cost=cost;
}
void getData() {
	System.out.println("Name="+name);
	System.out.println("Color="+color);
	System.out.println("Breed="+breed);
	System.out.println("Age="+age);
	System.out.println("Cost="+cost);
  }
}
public class Example2 {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.setData1("jacky","White","GR",14,9000);
		d1.getData();
		

	}

}


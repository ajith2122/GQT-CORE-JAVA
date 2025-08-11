package com.gqt.corejava.Encapsulation;
class Lion{
	private String name;
	private String color;
	private String country;
	private int age;

void setData1() {
	name = "Ramu";
	color = "Yellow";
	country = "Africa";
	age = 9;
}
void setData2(String a,String b,String c,int d){
	name=a;
	color=b;
	country=c;
	age=d;
}
void getData() {
	System.out.println("Name="+name);
	System.out.println("Color="+color);
	System.out.println("Country="+country);
	System.out.println("Age="+age);
  }
}
public class Example1 {

	public static void main(String[] args) {
		Lion l = new Lion();
		l.setData1();
		l.getData();
		System.out.println("--------");
		l.setData2("Jimmy", "Red", "Japan", 20);
		l.getData();

	}

}

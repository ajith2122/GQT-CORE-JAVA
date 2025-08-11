package com.gqt.corejava.Encapsulation;
class Dog3 {
	private String name;
	private String color;
	private int cost;
	private int age;
	private String breed;
	
	// Zero Parameterized Constructor
	public Dog3()
	{
		super();
		System.out.println("Inside Zero Parametrized Constructor");
		this.name ="Ramu";
		this.color ="Brown";
		this.cost =7000;
		this.age =3;
		this.breed ="pumorion";
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("----------");
	}
	
	// One Parameterized Constructor
  public Dog3(String name) 
  {
	this();
	System.out.println("Inside One Parametrized Constructor");
	this.name=name;
	System.out.println(this.name);
	System.out.println(this.color);
	System.out.println(this.cost);
	System.out.println(this.age);
	System.out.println(this.breed);
	System.out.println("----------");
	}
  
    // Two Parameterized Constructor
    public Dog3(String name,String color) 
    {
		this("chintu");
		System.out.println("Inside Two Parametrized Constructor");
		this.name=name;
		this.color=color;
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("----------");
		}
  
    //Three Parameterized Constructor
    public Dog3(String name,String color,int cost) 
    {
		this("chintu","Blue");
		System.out.println("Inside Three Parametrized Constructor");
		this.name=name;
		this.color=color;
		this.cost=cost;
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("----------");
		}
    
    //Four Parameterized Constructor
    public Dog3(String name,String color,int cost,int age) 
    {
		this("chintu","Blue",9000);
		System.out.println("Inside Four Parametrized Constructor");
		this.name=name;
		this.color=color;
		this.cost=cost;
		this.age=age;
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("----------");
		}
    
    //Five Parameterized Constructor
    public Dog3(String name,String color,int cost,int age,String breed) 
    {
		this("chintu","Blue",9000,7);
		System.out.println("Inside Five Parametrized Constructor");
		this.name=name;
		this.color=color;
		this.cost=cost;
		this.age=age;
		this.breed=breed;
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("----------");
		}
 }
public class Constructors {

	public static void main(String[] args) {
		Dog3 d3 = new Dog3("Rocky","White",8000,8,"GR");

	}

}

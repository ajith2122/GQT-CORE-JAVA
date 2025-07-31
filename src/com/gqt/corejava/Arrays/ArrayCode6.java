package com.gqt.corejava.Arrays;
import java.util.Scanner;
class ArrayOperations3
{
	String arr[][][];
	Scanner sc = new Scanner(System.in);
	void createArray()
	{
		System.out.println("Enter school count:");
		int sch = sc.nextInt();
		arr = new String[sch][][]; 
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the class count inside the school no:"+(i+1));
			int cls = sc.nextInt();
			
			arr[i] = new String[cls][];
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Inside the school no:"+(i+1));
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Inside the class no:"+(j+1));
				System.out.println("Enter the student count inside the school no:"+(i+1));
				int stu = sc.nextInt();
				arr[i][j] = new String[stu];
			}
		}
		System.out.println("Array created:");
		System.out.println("---------");
	}
	void collectData()
	{
		for(int i=0; i<arr.length;i++)
		{
			System.out.println("Inside the school no:"+(i+1));
			for(int j=0; j<arr[i].length;j++)
			{
				System.out.println("Inside the class no:"+(j+1));
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.println("The name of student no :"+(k+1));
					arr[i][j][k] = sc.next();
				}
			}
		}
		System.out.println("Data Collected");
	}
	void displayData()
	{
		for(int i=0; i<arr.length;i++)
		{
			System.out.println("Inside school no:"+(i+1));
			for(int j=0; j<arr[i].length;j++)
			{
				System.out.println("Inside the class no:"+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("The name of student no :"+(k+1));
					System.out.println("Enter the name of student no:"+(k+1)+ "is ="+arr[i][j][k]);
				}
		
			}
		}
		System.out.println("---------");
		sc.close();
	}
}
public class ArrayCode6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOperations3 ao3 = new ArrayOperations3();
		ao3.createArray();
		ao3.collectData();
		ao3.displayData();
	}
}
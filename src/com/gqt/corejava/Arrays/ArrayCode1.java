package com.gqt.corejava.Arrays;

//Unstructured Program:
import java.util.Scanner;

public class ArrayCode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student count");
		int n = sc.nextInt();
		//Creating the array to store n students marks
		int arr[] = new int[n];
		//Collecting & Storing marks of n students
		for (int i =0;i<arr.length;i++)
		{
			System.out.println("Enter the marks of students no: "+(i+1));
			arr[i] = sc.nextInt();
		}
		System.out.println("-------");
		//Display marks stored inside the array 
		for (int i=0;i<arr.length;i++)
		{
			System.out.println("The marks of student no: "+(i+1) +"is="+arr[i]);
		}
        sc.close();
	}

}

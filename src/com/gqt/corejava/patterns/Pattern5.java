package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count");
		int n =sc.nextInt();
		int count = 1;
		for(int i=1;i<=n;i++) {
		System.out.println(count);
		count++;
		sc.close();

	}

	}

}

/**
 * 
 */
package com.gqt.corejava.PatternNew;

import java.util.Scanner;

/**
 * @author ajith
 *@category Patterns
 *@description This is an example for conditional Pyramid pattern
 */
public class NewPattern3 {

	/**
	 * @param args
	 * @discription This contains source code for the pattern
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count:");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("- ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("$ ");
			}
			System.out.println();
			sc.close();
		}

	}

}

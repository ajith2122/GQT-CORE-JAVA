/**
 * 
 */
package com.gqt.corejava.PatternNew;

import java.util.Scanner;

/**
 *@author ajith
 *@category Patterns
 *@description This is an example for conditional pattern   
 */
public class NewPattern2 {

	/**
	 * @param args
	 * @discription This contains source code for the pattern
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count");
		int n =sc.nextInt();
		for(int i=0;i<n;i++) {
		for(int j=0;j<=i;j++) {
			if (i==0 || i==(n-1) || j==0 || j==i) 
			{
				System.out.print("# ");
			}
			else {
				System.out.print("- ");
			}
		}
       System.out.println();
       sc.close();
	}
  }
}

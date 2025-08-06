package com.gqt.corejava.Strings;

import java.util.Scanner;

public class SumProduct {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.nextLine();
		int sumL=0;
		int sumU=0;
		int sumC=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>=65 && str.charAt(i)<=90) {
				if(str.charAt(i)=='A' ||str.charAt(i)=='E' ||str.charAt(i)=='I' ||str.charAt(i)=='O' ||str.charAt(i)=='U') {
					sumU=sumU+str.charAt(i);
				}
				else {
					sumC=sumC+str.charAt(i);
				}
			}
			else if(str.charAt(i)>=97 && str.charAt(i)<=122) {
				if(str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u') {
					sumL=sumL+str.charAt(i);
				}
				else {
					sumC=sumC+str.charAt(i);
				}
			}
		}
		System.out.println(sumU*sumL*sumC);
		sc.close();
	}

}


package com.gqt.corejava.Strings;

public class MutableStrings {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer("Ramayana.");
		StringBuffer sb2=new StringBuffer("Is the best mythological Story");
		sb1.append(sb2);
		System.out.println(sb1);
		
		StringBuffer sb3=new StringBuffer("Mahabharatha.");
		StringBuffer sb4=new StringBuffer("Is the best mythological history");
		sb3.append(sb4);
		System.out.println(sb3);

	}

}

package com.gqt.corejava.Arrays;

import java.util.Scanner;

class MovieOperations
{
	        long arr[][][];
	        long investment;
	        long prev_profit;
	        long sum_revenue;
	        Scanner sc=new Scanner(System.in);
	        void createArray() 
	        {
	        	System.out.println("Enter the language count");
	        	int lan =sc.nextInt();
	        	System.out.println("Enter category count in each language");
	        	int cat =sc.nextInt();
	        	System.out.println("Enter movie count in each category");
	        	int mov =sc.nextInt();
	        	//Creating 3D Array 
	        	arr =new long[lan][cat][mov];
	        	System.out.println("Array created");
	        	System.out.println("-------");
	        	
	        	System.out.println("Enter the investment made :");
	        	investment=sc.nextLong();
	        	System.out.println("Enter the profit made in the financial year 2023-2024 :");
	        	prev_profit=sc.nextLong();
	        	
	        	System.out.println("-------");
	        }
	        void collectRevenueData() 
	        {
	        	for (int i=0;i<arr.length;i++)
	    		{
	        		System.out.println("Inside language no:"+(i+1));
	        		for(int j=0;j<arr[i].length;j++)
	        		{
	        			System.out.println("Inside category no:"+(j+1));
	        			for(int k=0;k<arr[i][j].length;k++) 
	        			{
	        				System.out.println("Enter the revenue of the movie no:"+(k+1));
	        			    arr[i][j][k] = sc.nextLong();
	        			    sum_revenue +=arr[i][j][k];
	        			}
	        		}
	    		}
	        	System.out.println("Data collected & calculated");
	        	System.out.println("-------");
	        }
	        void displayData()
	    	{
	    		for(int i=0; i<arr.length;i++)
	    		{
	    			System.out.println("Inside language no:"+(i+1));
	    			for(int j=0; j<arr[i].length;j++)
	    			{
	    				System.out.println("Inside the category no:"+(j+1));
	    				for(int k=0;k<arr[i][j].length;k++) 
	    				{
	    					
	    					System.out.println(" the revenue of the movie no:"+(k+1)+ "is ="+arr[i][j][k]);
	    				}
	    			}
	    		}
	    		System.out.println("---------");
	    		System.out.println("Overall revenue :"+sum_revenue);
	    		System.out.println("---------");
	    		if(sum_revenue>investment) {
	    			long profit = (sum_revenue-investment);
	    			System.out.println("The profit made by hemanth is = "+profit);
	    			if(profit>prev_profit) {
	    				System.out.println("Hemanth has made more profit than previous year");
	    			}
	    			
	    		else {
	    			System.out.println("Hemanth has not made more profit than previous year");
	    		}
	    	}
	        else {
	        	System.out.println("the loss incured by hemanth is ="+(investment-sum_revenue));
	        }
	        	
	    		sc.close();
	    	}
	}


public class ArrayCode7 {

public static void main(String[] args) {
	// TODO Auto-generated method stub
	MovieOperations mo = new MovieOperations();
	mo.createArray();
	mo.collectRevenueData();
	mo.displayData();
}
}


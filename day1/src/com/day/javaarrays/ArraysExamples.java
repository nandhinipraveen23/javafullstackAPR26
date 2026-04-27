package com.day.javaarrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysExamples {

	static public   void main(String[] args) {
		 	
		
		 //                 r  c
		int b[][]= new int [3][3];
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the nos:");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				b[i][j]=s.nextInt();
			}
		}
	 System.out.println("the res......");
	 System.out.println(Arrays.deepToString(b));
}

   
   
	
}
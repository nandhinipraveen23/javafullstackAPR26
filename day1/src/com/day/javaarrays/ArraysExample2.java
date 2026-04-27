package com.day.javaarrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysExample2 {

	public static void main(String[] args) {
		 int a[][]=new int [3][];
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter the datas"); 
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.println("how many nos of col u want in "+i+"row");
			 int col=s.nextInt();//5
			 a[i]= new int[col];
			 System.out.println("enter the nos: ");
			 for(int j=0;j<col;j++)
			 {
				 a[i][j]=s.nextInt();
			 }
		 }
		 
		 System.out.println(Arrays.deepToString(a));
	}

}

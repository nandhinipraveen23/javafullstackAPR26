package com.day.javaarrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExamples1 {

	

	public static void main(String[] args) {
		 //                 r  c
		int b[][]= new int [4][3];
		int c[][]=new int[][] {{1},{10,23},{34,56,56,567,678,78,99}};
		Scanner s = new Scanner(System.in);
		
		//System.out.println("len "+c[2].length);
		System.out.println("Enter the nos:");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				b[i][j]=s.nextInt();
			}
		}
		
		
	 System.out.println("the res......");
	 
	 for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}

	 
//	 for(int i=0;i<c.length;i++)
//			{
//				for(int j=0;j<c[i].length;j++)
//				{
//					System.out.print(c[i][j]+" ");
//				}
//				System.out.println();
//			}
//	 
	}

}

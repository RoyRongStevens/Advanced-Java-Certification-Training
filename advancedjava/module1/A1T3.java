package com.edureka.advancedjava.module1;

public class A1T3

{

	public static void main(String[] args) {
		int m = 3, n = 3;
		int a[][] = new int [m][n];
		 
		 System.out.println("Among the 10 integers, the even values are:");
		 
			for (int i = 0; i < 3; ++i)
			{
				for(int j = 0; j < 3; ++j){
					  a[i][j] = i + j;
					  if (a[i][j] % 2 == 1) {
					        System.out.println(a[i][j]);
					      }
				}
			}
	}
}


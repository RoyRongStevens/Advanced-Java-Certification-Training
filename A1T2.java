package com.edureka.advancedjava.module1;

public class A1T2 {

	public static void main(String[] args) {
		 int a[] = new int [10];
		 
		 System.out.println("Among the 10 integers, the even values are:");
		 
			for (int i = 0; i < 10; ++i)
			{
			  a[i] = i + 1;
			  if (a[i] % 2 == 0) {
			        System.out.println(a[i]);
			      }
			}
	}
}

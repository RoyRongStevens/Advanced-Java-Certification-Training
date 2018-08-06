package com.edureka.advancedjava.module1;

public class A1T5 {
	public static void main(String[] args) {
		 System.out.println("The first matrice is:");
		int m = 4, n = 3;
		int a[][] = new int [m][n];
			for (int i = 0; i < 4; ++i)
			{
				for(int j = 0; j < 3; ++j){
					  a[i][j] = i * j;

				}
		        System.out.println(a[i][0] + " " + a[i][1] + " " + a[i][2]);
			}
			
			System.out.println("\n" + "The second matrice is:");
			int b[][] = new int [m][n];
				for (int i = 0; i < 4; ++i)
				{
					for(int j = 0; j < 3; ++j){
						  b[i][j] = i ^ j;

					}
			        System.out.println(b[i][0] + " " + b[i][1] + " " + b[i][2]);
				}	
				
				System.out.println("\n" + "Check if the two matrices are of equal dimension:" + "\n");
				if((a[0].length == b[0].length) && (a[1].length == b[1].length)){
												
				System.out.println("\n" + "Two metrices can be added and the sum matrice is:" + "\n");
				int s[][] = new int [m][n];
					for (int i = 0; i < 4; ++i)
					{
						for(int j = 0; j < 3; ++j){
							  s[i][j] = a[i][j] + b[i][j];

						}
				        System.out.println(s[i][0] + " " + s[i][1] + " " + s[i][2]);
					}	
				}
	}
}

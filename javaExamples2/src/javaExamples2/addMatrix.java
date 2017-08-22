package javaExamples2;

import java.util.Scanner;

public class addMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      int rows, cols, c, d;
	 
	      Scanner in = new Scanner(System.in);
	 
	      System.out.println("Enter rows and colums");
	 
	      rows = in.nextInt();
	      cols  = in.nextInt();
	 
	      int matrix1[][] = new int[rows][cols];
	      int matrix2[][] = new int[rows][cols];
	      int sum[][] = new int[rows][cols];
	 
	      System.out.println("enter 1st matrix");
	 
	      for (  c = 0 ; c < rows ; c++ )
	         for ( d = 0 ; d < cols ; d++ )
	            matrix1[c][d] = in.nextInt();
	 
	      System.out.println("enter 2nd matrix");
	 
	      for ( c = 0 ; c < rows ; c++ )
	         for ( d = 0 ; d < cols ; d++ )
	            matrix2[c][d] = in.nextInt();
	 
	      for ( c = 0 ; c < rows ; c++ )
	         for ( d = 0 ; d < cols ; d++ )
	             sum[c][d] = matrix1[c][d] + matrix2[c][d];  
	      System.out.println("Sum : ");
	 
	      for ( c = 0 ; c < rows ; c++ )
	      {
	         for ( d = 0 ; d < cols ; d++ )
	            System.out.print(sum[c][d]+"\t");
	         System.out.println();
	      }
		
		
		
	}

}

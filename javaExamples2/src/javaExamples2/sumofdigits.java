package javaExamples2;

import java.util.Scanner;

public class sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner in = new Scanner(System.in);
		 
		System.out.println("Please Enter a number");
		 
		number=in.nextInt(); 
		 
		if((number &1)==0){
			System.out.println(+number+" is Even number");
	    }else{
	        System.out.println(+number+" is Odd Number");
		}
		int sum=0 ;
		 
		while(number!=0){
		 
		sum=sum+(number%10);
		number=number/10;
		}
		 
		System.out.println("Sum of Digits ="+sum);
		 

	}

}

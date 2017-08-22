package javaExamples2;


import java.util.Random;
import java.util.Scanner;
public class RandomN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in = new Scanner(System.in);
		  System.out.println("Enter least number");
		  int l=in.nextInt();
		  
		  System.out.println("Enter highest number");
		  int h=in.nextInt();
		  
		  int randomNum = l + (int)(Math.random() * h);
		  
		  System.out.println("Random Number= "+randomNum);
		  //between 1 to 100 and generate 10 numbers
		  
		  Random rn = new Random();
		  
          for (int n = 1; n <= 10; ++n){
        	int rn1 = rn.nextInt(100);
             System.out.println("Random Number= "+rn1);
	}
	}
}

package javaExamples2;

public class SecondLNumb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {10,30,2,6,90,45,67};
		int highest = 0;
		 int secondh = 0;
		 
		for(int n:array){
		 
		if(highest < n){
		 
		      secondh = highest;
		      highest =n;
		 
		 } else if(secondh < n){
		 
			 secondh = n;
		 
		}
		 
		}
		        System.out.println("First Max Number: "+highest);
		        System.out.println("Second Max Number: "+secondh);

	}

}

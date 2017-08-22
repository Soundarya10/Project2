package javaExamples2;

public class biggestSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Soundarya Reddy is a good girl";
		 
		 String longest="";
		 int maxlength=0;
		 
		 String arr[]=str.split("a");
		 
		for (int i = 1; i < arr.length-1; i++) {
		 
		   System.out.println(arr[i]); 
		          if(arr[i].length() > maxlength){
		               maxlength = arr[i].length();
		                longest = arr[i];
		            }   
		 
		   }      
		  
		System.out.println("Longest substring :  "+longest);
		
		
		
	}

}

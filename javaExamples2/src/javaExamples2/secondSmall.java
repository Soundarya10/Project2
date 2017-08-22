package javaExamples2;

public class secondSmall {

public static void main(String args[]){
	
int[] x ={20,30,10,4,18,45,10};
 
int s=x[0];
 
 for(int i=0;i<x.length;i++)
 {
        if(x[i]<s)
        {
        s=x[i];
        }
 }
 
   int ss = x[0];
 
for(int i=0;i<x.length;i++)
 {
        if(x[i]<ss && x[i]!=s)
        {
        ss=x[i];
        }
  }
 
        System.out.println("Second Smallest Number: " + ss);
        
        }

}

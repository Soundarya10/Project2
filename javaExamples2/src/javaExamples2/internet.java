package javaExamples2;

import java.net.URL;
import java.net.URLConnection;

public class internet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
		        URL url = new URL("http://www.google.com");
		 
		        URLConnection connection = url.openConnection();
		        connection.connect();   
		 
		        System.out.println("Internet Connected");   
		            
		 }catch (Exception e){
		     
		System.out.println("No Internet");     
		                                                            
		} 
	}

}

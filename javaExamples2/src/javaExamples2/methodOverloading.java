package javaExamples2;

public class methodOverloading {
	void add(){
		System.out.println("hello");
	}
	  
	void add(int a, int b){
		System.out.println(a + b);
	}
	 
	void add(float a, float b){
		System.out.println(a + b);
	}
	public static void main(String [] args){
		methodOverloading obj= new methodOverloading();
	 
	obj.add();
	obj.add(1,2);
	obj.add(1.2f,1.4f);
	

	}
	

}

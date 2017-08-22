package javaExamples2;

public class methodOverriding extends clasA{

	  void msg(){
	 
	System.out.println("Ammu");
	 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  clasA a=new clasA();
		  methodOverriding b=new methodOverriding();
		     clasA obj=new methodOverriding(); 
		 
		  a.msg();
		  b.msg();
		  obj.msg();
	}

}

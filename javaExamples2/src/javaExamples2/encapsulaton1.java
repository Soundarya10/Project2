package javaExamples2;

public class encapsulaton1 {
	 int id;
	    String name;
	  
		
	    public void setRno(int id) {
	        this.id = id;
	 }
	  
	    public int getid() {
	        return id;
	     }
	    public void setName(String name) {
	         this.name = name;
	 }
	
	 public String getName() {
	         return name;
	 }

	    public encapsulaton1(int id, String name) {
			// TODO Auto-generated constructor stub
	    	this.id = id;
	    	this.name = name;
		}
	  
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		encapsulaton1 e = new encapsulaton1(1,"ammu");
		System.out.println(e.getid());
		System.out.println(e.getName());
	}

}

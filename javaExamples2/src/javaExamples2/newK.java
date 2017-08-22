package javaExamples2;

public class newK {
	private int id;
    private String name;
     
    newK(int id,String name){
    this.id=id;
    this.name=name;
    }
     
    public void display(){
     
    System.out.println(id+" "+name);
     
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 newK e=new newK(1,"Ammu");
		 newK e1=new newK(2,"reddy");
		     
		    e.display();
		    e1.display();
	}

}

package Static;

public class Hectic {
	int empid;
	String name;
	static String company= "-Audax";
	
	Hectic(int empid, String  name  ){
		this.empid=empid;
		this.name=name;
		//this.company=company;
	}
	void display() {
		System.out.println(empid + " " + name + " " +company);
		
	}
	public static void main(String[] args) {
		Hectic h1= new Hectic(102, "Stark" ) ;
		h1.display();
		
		Hectic h2 = new Hectic(103, "jgtrr");
		h2.display();
		
		
		
	}
	
	

}

package Polymorphism;

public class MethOver {
	void show(Object a) {
		System.out.println("in Object");
	}
	void show(String a) {
		System.out.println("in String");
	}
	public static void main(String[] args) {
		MethOver ts= new MethOver();
		ts.show("abc");
		
	}
	

}
//Object is the parent class of all the java Classes it will give preference to the child class only
// it will not call the parent unless it can be done with child
package Polymorphism;

public class Exception {
	void show() throws RuntimeException {
		System.out.println("in 1");
	}

}
class XYZ extends Exception {
	void shows ()  {
		System.out.println(" in 2");
		
	}
	public static void main(String[] args) {
		Exception obj1= new Exception();
		obj1.show();
		
		XYZ obj2= new XYZ();
		obj2.show();
		obj2.shows();
		
	}
}

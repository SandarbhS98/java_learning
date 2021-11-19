package Polymorphism;

public class CovariRetu {
	Object show() {
		System.out.println(" in1");
		return null;
	}

}
class Bb extends CovariRetu{
	String show() {
		System.out.println("in 2");
		return null;
	}
	public static void main(String[] args) {
		CovariRetu bs= new CovariRetu();
		bs.show();
		
		B nd= new B();
		nd.show();
		
		
	}
	
}

// Child Class Accessibility Should be Greater than the Parent Class 

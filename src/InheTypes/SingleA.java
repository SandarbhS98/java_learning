package InheTypes;

public class SingleA {
	
	void A() {
		System.out.println("i'm In Method A");
	}

}
class Double extends SingleA{
	
	void B() {
		System.out.println("i'm in B");
	}
	public static void main(String[] args) {
		SingleA ab= new SingleA();
		Double ac= new Double();
		
		
		ab.A();
		ac.B();
		System.out.println("i'm in c");
		
	}
}
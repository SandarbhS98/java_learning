package InheTypes;
//tried for hiererical
public class MultiInhA {
	void A() {
		System.out.println("i'm in Ab");
	}

}
class MultiInhB extends MultiInhA {
	void B(){
		System.out.println("i'm in Bc");
	}
}
class MultiInhC extends MultiInhB {
	
	void C(){
		System.out.println("i'm in Cd");
		
	}
	public static void main(String[] args) {
		
		MultiInhA ab= new MultiInhA();
		MultiInhB bc= new MultiInhB();
		MultiInhC cd = new MultiInhC();
		
		ab.A();
		
		bc.A();
		bc.B();
		
		cd.A();
		cd.B();
		cd.C();
	}
}
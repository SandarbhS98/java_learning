package Abstract;

abstract public class AbsEx {
	abstract void sisplay (); 	
	void show() {
		System.out.println("in 1");
	}

}
class Xyza {
	
	void sisplay() {
		System.out.println("starts with key ");
	}
	void shew() {
		System.out.println("in 2");
	}
	public static void main(String[] args) {
		//AbsEx onj1= new AbsEx();
		//onj1.show();
		//learn
		System.out.println("learn");
		
		Xyza obj2= new Xyza();
		obj2.shew();
		
		
	}
}

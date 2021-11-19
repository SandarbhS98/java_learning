package learnjob;

public class Inheritance {
	
	void eat() {
		System.out.println("I 'm Eating");
	}
}
class Inherit extends Inheritance{
	public static void main(String[] args) {
		
		Inherit it = new Inherit();
		it.eat();
	}
}



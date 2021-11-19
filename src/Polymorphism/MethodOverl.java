package Polymorphism;

public class MethodOverl {
	void show () {
		System.out.println("11");
	}
	void show (int a) {
		System.out.println("22");
	}
	
	public static void main(String[] args) {
		
		MethodOverl met= new MethodOverl();
		met.show(3);
		
	}

}

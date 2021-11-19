package Polymorphism;

public class OverRide {
	protected void show(int a) {
		System.out.println(" in 1st");
	}

}

class B extends OverRide {
	public void show() {
		System.out.println("in 2nd");
	}

	public static void main(String[] args) {
		OverRide sw = new OverRide();
		// sw.show("ad");

		B bc = new B();
		bc.show();
		bc.show(2);

	}
}

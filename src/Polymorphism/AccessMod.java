package Polymorphism;

public class AccessMod {
	void show() {
		System.out.println();
	}

}
class bh {
	public void show() {
		System.out.println();
	}
	public static void main(String[] args) {
		AccessMod hb = new AccessMod();
		hb.show();
		
	}
}

package Keyword;

public class Super {
	int B=10;
}
class Abc extends Super{
	int B=20;
	void show(int B) {
		//super refers parent class instance variable
		System.out.println(super.B);
		
	}
	public static void main(String[] args) {
		Abc ob = new Abc();
		ob.show(30);	
	}
}

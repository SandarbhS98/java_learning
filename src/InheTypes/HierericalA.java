package InheTypes;

public class HierericalA {
	void Ab (){
		System.out.println("i'm at A");
		
		
	}
}
class B extends HierericalA {
	void Bc () {
		System.out.println("i'm at B");
		
	}
}
class C extends HierericalA {
	void Cd () {
		System.out.println("i'm at C");
		System.out.println("-----------");
	}
	public static void main(String[] args) {
		HierericalA obj1= new HierericalA();
		B obj2 =new B();
		C obj3 = new C();
		
		obj1.Ab();
		System.out.println("-----------");
		
		obj2.Ab();
		obj2.Bc();
		System.out.println("-----------");
		
		obj3.Ab();
		obj3.Cd();
		
		
	}
}

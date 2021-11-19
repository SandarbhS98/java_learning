package Polymorphism;

public class MethodOver3 {
	void show(int a , float b) {
		System.out.println("in Int  n Float");
	}
	void show(float a ,int b) {
		System.out.println("in Float & int");
	}
	void show (int... a) {
		System.out.println("in varargs");
	}
	public static void main(String[] args) {
		MethodOver3 mo=new MethodOver3();
		mo.show(73 ,65.32f);
		mo.show(233.533f,0);
		mo.show(10,2903,3984,32039,3342);
		// if we doesn't pass any args  then also it will call varargs
		//mo.show(10, 30);
	}

}

package learnjob;

public class objMethod {
	
	public void eat() {
		System.out.println("I'm on 2nd ");

		
	}
	
	public static void main(String[] args) {
		System.out.println("i'm on 1st ");
		
		objMethod buzo = new objMethod();
		buzo.eat();
		buzo.run();
		NewClass get = new NewClass();
		get.fly();
		
		
		
		
		
		// TODO Auto-generated method stub

	}
	public void run() {
		System.out.println("i'm on 3rd");
	}
	

}
class NewClass{
	
	
	
	void fly() {
		
		System.out.println("i'm flying");
	}
}

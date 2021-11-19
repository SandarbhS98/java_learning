package Abstract;

abstract public class Abstraction {
	int no_of_tyres= 3;
	abstract void show();
	

}
class Abstr extends Abstraction {
	void show() {
		System.out.println(" i'm Groot");
	}
	
}
class Abs extends Abstraction{
	void show() {
		System.out.println(" i'm not groot");
	}
	public static void main(String[] args) {
		Abstr ab= new Abstr();
		ab.show();
		
		Abs ax=new Abs();
		ax.show();
		ab.show();
	}
	
}

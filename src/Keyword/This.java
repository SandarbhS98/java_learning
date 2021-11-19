package Keyword;

public class This {
	int i ;
	void show1(int i) {
		this.i=i;
	}
	void exo() {
		System.out.println(" in 2nd method " +i);		
	}

}
class That {
	public static void main(String[] args) {
		This y= new This();
		y.show1(10);
		y.exo();
		
	}
}
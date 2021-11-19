package Keyword;

public class Conat {
	int a;
	Conat() {
		this(12);
		System.out.println(" no arg Const");
	}
	
	Conat(int c) {
		
		System.out.println("Arg Const");		
	}
	
	public static void main(String[] args) {
		Conat ct= new Conat();
	}	

}


package Abstract;
// interface support multiple inheritance

public interface Inter {
	void show();
}

interface New {
	void se();
}

class Test implements Inter, New {
	public void show() {
		System.out.println(" hi there");
		
	}
	public void se() {
		System.out.println(" there");
		
	}
	
	public static void main(String[] args) {
		System.out.println(" inside");
		
		//Inter it = new Inter();
		//it.show();
		
		Test ts= new Test();
		ts.show();
		ts.se();
		
		//New kn= new New();
		//kn.se();
		
		
		
		
	}
}

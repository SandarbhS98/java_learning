package Exception;

public class Try {
	public static void main(String[] args) {
		try {
			int i = 100;
			int j= 0;
			int k= i/j;
			System.out.println("output is "+k);
			
			
		}
		
		catch(Exception e){
			System.out.println("hey");
			
		}
		System.out.println(" ranned");
	}

}

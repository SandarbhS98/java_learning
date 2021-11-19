package learnjob;

public class Construct {

	public static void main(String[] args) {
		
		Abc ref = new Abc(2);
		ref.sum(2,5);
		int a=ref.subt(33, 4);
		System.out.println(a);
		
		// TODO Auto-generated method stub
	}

}
class Abc {
	
	public Abc(int l) {
		System.out.println("Without para");
	}
	
	void sum(int b,int c){
		int a=b+c;
		System.out.println(a);
		
		
	}
	int subt (int e,int f) {
		int k=e-f;
		//System.out.println("Susu is " +k);
		return k;
	}
}

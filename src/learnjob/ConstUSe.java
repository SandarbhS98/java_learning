package learnjob;

public class ConstUSe {
	
	String Name;
	int Age;
	
	ConstUSe(String Name,int Age){
		this.Name=Name;
		this.Age=Age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstUSe srt = new ConstUSe("Stark",21);
		ConstUSe srt1 = new ConstUSe("Star",2);
		
		System.out.println(srt.Name +" _" +srt.Age);
		System.out.println(srt1.Name+ " _"+srt1.Age);
		
		

	}

}

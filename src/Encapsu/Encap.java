package Encapsu;

public class Encap {
	private int empid;
	public void setEmpid (int empid1) {
		empid=empid1;
		
	}
	public int getEmpid() {
		return empid;
	}	

}
class Company {
	public static void main(String[] args) {
		Encap ec= new Encap();
		ec.setEmpid(102);
		System.out.println(ec.getEmpid());
	}
}

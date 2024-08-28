package Halwa;

public class Halwa {

	String name;
	int quantity;
	double price;
	
	public Halwa() {
		System.out.println("created the no args constructor");
		}
	
	public Halwa(String name,int quantity,double price) {
		System.out.println("created the halwa with name,quantity,price");
		
	}
	public void order() {
		System.out.println("running order in halwa");
		
	}
	public void display() {
		System.out.println("running display in halwa");
	}
}

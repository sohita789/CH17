package Phone;

public class SmartPhone {
	String name;
	String color;
	int quantity;
	double price;
	
	public SmartPhone() {
		System.out.println("created the no args constructor");
		}
	
	public SmartPhone(String name,String color,int quantity,double price) {
		this.name=name;
		this.color=color;
		this.quantity=quantity;
		this.price=price;
		System.out.println("created the SmartPhone with name,quantity,price");
		
	}
	public void order() {
		System.out.println("running order in SmartPhone");
		
	}
	public void display() {
		System.out.println("running display in SmartPhone");
	}
}



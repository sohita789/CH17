package Hen;

public class Chicken {

	public String breed;
	public String color;
	public int age;
	public double weight;
	public boolean isEggLaying;
	public int eggcount;
	public String habitat;
	public double height;
	public double price;
	
	public Chicken(String breed, String color, int age, double weight, boolean isEggLaying, int eggcount,
			String habitat, double height, double price) {
		super();
		this.breed = breed;
		this.color = color;
		this.age = age;
		this.weight = weight;
		this.isEggLaying = isEggLaying;
		this.eggcount = eggcount;
		this.habitat = habitat;
		this.height = height;
		this.price = price;
	}
	
	public void show() {
		System.out.println("running show in chicken");
	}
    public void print() {
    	System.out.println("running print in chicken");
    }
    public void run() {
    	System.out.println("runnning run in chicken");
    }
    public void display() {
    	System.out.println("running display in chicken");
    	
    }
	public void read() {
		System.out.println("running read in chicken");
	}
		
	}


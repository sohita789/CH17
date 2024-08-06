class Rocket
{
	String country;
	int speed=17400;
	int fuelCapacity;
	int noOfThrusters;
	
	public Rocket(String country)
	{
		this.country=country;
	}
	public void setFuelCapacity(int fuelCapacity)
	{
		this.fuelCapacity=fuelCapacity;
	}
	public void display()
	{
		System.out.println("country:"+country);
		System.out.println("speed:"+speed);
		System.out.println("fuelCapacity:"+fuelCapacity);
		System.out.println("noOfThrusters:"+noOfThrusters);
	}
}

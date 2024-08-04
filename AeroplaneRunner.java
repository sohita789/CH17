class AeroplaneRunner
{
public static void main(String[]args)
{
	System.out.println("starting main in AeroplaneRunner");
	
Aeroplane aeroplane=new Aeroplane("jet",20,2300,"bangalore","mysore");
System.out.println("Aeroplane company:"+aeroplane.company);
System.out.println("Aeroplane noOfSeats:"+aeroplane.noOfSeats);
System.out.println("Aeroplane ticketPrice:"+aeroplane.ticketPrice);
System.out.println("Aeroplane source:"+aeroplane.source);
System.out.println("Aeroplane destination:"+aeroplane.destination);

Aeroplane aeroplane1=new Aeroplane("margo","bangalore","hyderabad");
System.out.println("Aeroplane company:"+aeroplane1.company);
System.out.println("Aeroplane source:"+aeroplane1.source);
System.out.println("Aeroplane destination:"+aeroplane1.destination);


Aeroplane aeroplane2=new Aeroplane("helicopter",2000,"chikkmagaluru","chennai");
System.out.println("Aeroplane company:"+aeroplane2.company);
System.out.println("Aeroplane ticketPrice:"+aeroplane2.ticketPrice);
System.out.println("Aeroplane source:"+aeroplane2.source);
System.out.println("Aeroplane destination:"+aeroplane2.destination);

	System.out.println("ending main in AeroplaneRunner");
}
}
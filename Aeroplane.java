class Aeroplane
{

String company;
int noOfSeats;
double ticketPrice;
String source;
String destination;

Aeroplane(){
	System.out.println("creating the Aeroplane with  no parameter");
}
Aeroplane(String company,int noOfSeats,double price,String source,String destination)
{
	System.out.println("creating the Aeroplane with String,int,String,String");
	
	this.company=company;
System.out.println("String company:"+company);
this.noOfSeats=noOfSeats;
System.out.println("int noOfSeats:"+noOfSeats);
this.ticketPrice=ticketPrice;
System.out.println("double ticketPrice:"+ticketPrice);
this.source=source;
System.out.println("String source:"+source);
this.destination=destination;
System.out.println("String destination:"+destination);
}

Aeroplane(String company,String source,String destination)
{
	System.out.println("creating the Aeroplane with  String,String,String");
	
	this.company=company;
	this.source=source;
	this.destination=destination;
	System.out.println("String company:"+company);
	System.out.println("String source:"+source);
	System.out.println("String destination:"+destination);
	}
	
	Aeroplane(String company,double ticketPrice,String source,String destination)
	{
	System.out.println("creating the Aeroplane using String,double,String,String");
		
		this.company=company;
		this.ticketPrice=ticketPrice;
		this.source=source;
		this.destination=destination;
		System.out.println("String company:"+company);
		System.out.println("double ticketPrice:"+ticketPrice);
	System.out.println("String source:"+source);
	System.out.println("String destination:"+destination);
	}
	}
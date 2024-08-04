class Kerosene
{
double price;
int quantity;
boolean quality;

Kerosene(){
	System.out.println("created the copy Kerosene using instance double,int,boolean");
this.price=price;
this.quantity=quantity;
this.quality=quality;	
}

Kerosene(double price,int quantity,boolean quality)
{
this.price=price;
this.quantity=quantity;
this.quality=quality;
}

Kerosene(boolean quality)
{
	System.out.println("created the copy Kerosene using instance boolean");
	
this.quality=quality;
}
Kerosene(double price)
{
	System.out.println("created the copy Kerosene using instance double");
	
this.price=price;
}
}
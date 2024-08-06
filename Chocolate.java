class Chocolate
{
String brand;
double price;
String flavour;
char size='S';

public Chocolate(String brand){
this.brand=brand;
}
public Chocolate(double price){
this.price=price;
}
public void setFlavour(String flavour){
this.flavour=flavour;
}
public void display(){
System.out.println("size:"+size);
System.out.println("price:"+price);
System.out.println("flavour:"+flavour);
}
}
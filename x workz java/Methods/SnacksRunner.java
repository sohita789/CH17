class SnacksRunner
{
public static void main(String[]args)
{
System.out.println("starting main method");
String item="pizza";
double price=Snacks.getprice(item);
System.out.println("price:"+price);
double price1=Snacks.getprice(item);
System.out.println("price1:"+price1);
double price2=Snacks.getprice(item);
System.out.println("price2:"+price2);
double price3=Snacks.getprice(item);
System.out.println("price3:"+price3);
double price4=Snacks.getprice(item);
System.out.println("price4:"+price4);
double price5=Snacks.getprice(item);
System.out.println("price5:"+price5);
System.out.println("no item matched");
}
}
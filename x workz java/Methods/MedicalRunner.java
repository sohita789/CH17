class MedicalRunner
{
public static void main(String[]args)
{
System.out.println("starting main method");
String Medicine="dolo650";
double price=Medical.getprice(Medicine);
System.out.println("price:"+price);
double price1=Medical.getprice(Medicine);
System.out.println("price1:"+price1);
double price2=Medical.getprice(Medicine);
System.out.println("price2:"+price2);
double price3=Medical.getprice(Medicine);
System.out.println("price3:"+price3);
double price4=Medical.getprice(Medicine);
System.out.println("price4:"+price4);
double price5=Medical.getprice(Medicine);
System.out.println("price5:"+price5);
System.out.println("no Medicine matched");
}
}
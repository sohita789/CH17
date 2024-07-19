class Train{
public static void book(String source,String destination)
{
System.out.println("Source:"+source);
System.out.println("destination:"+destination);
System.out.println("parameter with source and destination");
}
public static void book(String source,String destination,String quality)
{
System.out.println("parameter with source and destination");
System.out.println("Source:"+source);
System.out.println("destination:"+destination);
System.out.println("quality:"+quality);
}
public static void book(String source,String destination,String quality,int price)
{
System.out.println("parameter with source and destination and price");
System.out.println("Source:"+source);
System.out.println("destination:"+destination);
System.out.println("quality:"+quality);
System.out.println("price:"+price);
}

public static void cancel(int ticketNo)
{
System.out.println("passing a parameter with cancelling ticket");
System.out.println("cancelling ticket:"+ticketNo);
}

public static void cancel(String source,String destination)
{
System.out.println("passing a parameter with cancelling ticket");
System.out.println("source:"+source);
System.out.println("destination:"+destination);
}
}

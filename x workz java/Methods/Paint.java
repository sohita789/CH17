class Paint{
public static void sketch(String brand)
{
System.out.println("brand:"+brand);
}
public static void sketch(String brand,String color)
{
System.out.println("parameter with brand name and color");
System.out.println("brand:"+brand);
System.out.println("brand:"+color);
}
public static void sketch(String brand,int price)
{
System.out.println("parameter with brand name");
System.out.println("brand:"+brand);
System.out.println("price:"+price);
}
public static void sketch(String color,String type,int price)
{
System.out.println("parameter with brand name and brand price");
System.out.println("color:"+color);
System.out.println("type:"+type);
System.out.println("price:"+price);
}
}
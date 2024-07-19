class Snacks
{
public static double getprice(String item)
{
System.out.println("starting getprice");
System.out.println("item arg"+item);

if(item=="pizza")
{
System.out.println("item is pizza");
return 299;
}

if(item=="biscuit")
{
System.out.println("item is biscuit");
return 45;
}

if(item=="chocalate")
{
System.out.println("item is chocalate");
return 170;
}

if(item=="coffee")
{
System.out.println("item is coffee");
return 20;
}
if(item=="masaldosa")
{
System.out.println("item is masaldosa");
return 55;
}
System.out.println("no item matched");
return 0;
}
}
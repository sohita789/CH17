class Medical
{
public static double getprice(String Medicine)
{
System.out.println("starting getprice");
System.out.println("Medicine arg"+Medicine);

if(Medicine="dolo650")
{
System.out.println("Medicine is dolo650");
return 5;
}

if(Medicine=="chestonCold")
{
System.out.println("Medicine is chestonCold");
return 3;
}

if(Medicine=="meftolplus")
{
System.out.println("Medicine is meftolplus");
return 5;
}

if(Medicine=="paracetamol")
{
System.out.println("Medicine is paracetamol");
return 6;
}
if(Medicine=="pentop")
{
System.out.println("Medicine is pentop");
return 10;
}
System.out.println("no item matched");
return 0;
}
}
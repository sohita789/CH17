class Country
{
public static String getdistrictName(double code)
{
System.out.println("Starting getdistrictName");
System.out.println("code arg"+code);
if(code==585103)
{
	System.out.println("pincode is kalaburagi");
	return "kalaburagi";
}
if(code==530068)
{
	System.out.println("pincode is banglore");
	return "banglore";
}
if(code==570001)
{
	System.out.println("pincode is mysore");
	return "mysore";
}
if(code==509210)
{
	System.out.println("pincode is yadgir");
	return "yadgir";
}
if(code==585401)
{
	System.out.println("pincode is bidar");
	return "bidar";
}
System.out.println("district not found");
return "invalid";
}
}

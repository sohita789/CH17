class Continent
{
public static int getdistrictName(String code)
{
System.out.println("Starting getdistrictName");
System.out.println("code arg"+code);
if(code=="585103")
{
	System.out.println("pincode is kalaburagi");
	return kalaburagi;
}
if(code=="530068")
{
	System.out.println("pincode is banglore");
	return 530068;
}
if(code=="570001")
{
	System.out.println("pincode is mysore");
	return 570001;
}
if(code=="509210")
{
	System.out.println("pincode is yadgir");
	return 509210;
}
if(code=="585401")
{
	System.out.println("pincode is bidar");
	return 585401;
}
System.out.println("district not found");
return 0;
}
}
}
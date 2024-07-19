class CountryRunner
{
public static void main(String[] args)
{
System.out.println("start main method");
String code=Country.getdistrictName(585103);
System.out.println("code:"+code);
String code1=Country.getdistrictName(530068);
System.out.println("code1:"+code1);
String code2=Country.getdistrictName(570001);
System.out.println("code2:"+code2);
String code3=Country.getdistrictName(509210);
System.out.println("code3:"+code3);
String code4=Country.getdistrictName(585401);
System.out.println("code4:"+code4);
System.out.println("district not found");
}
}
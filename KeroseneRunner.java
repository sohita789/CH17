class KeroseneRunner
{
public static void main(String[]args)
{
	System.out.println("starting main in KeroseneRunner");
	
	
Kerosene kerosene=new Kerosene();
System.out.println("Kerosene price:"+kerosene.price);
System.out.println("Kerosene quantity:"+kerosene.quantity);
System.out.println("Kerosene quality:"+kerosene.quality);


	
Kerosene kerosene1=new Kerosene(140,200,false);
System.out.println("Kerosene price:"+kerosene1.price);
System.out.println("Kerosene quantity:"+kerosene1.quantity);
System.out.println("Kerosene quality:"+kerosene1.quality);


Kerosene kerosene2=new Kerosene(true);
System.out.println("Kerosene quality:"+kerosene2.quality);


Kerosene kerosene3=new Kerosene(200);
System.out.println("Kerosene price:"+kerosene3.price);

	System.out.println("ending  main in KeroseneRunner");

}
}



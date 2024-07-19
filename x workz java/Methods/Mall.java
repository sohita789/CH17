class Mall
{
public static void product(String brand,double price)
{
System.out.println("brand:"+brand);
System.out.println("price:"+price);
if(price>=100.00)
{
	System.out.println("price is valid");
}
	else
	{
		System.out.println("price is invalid");
}
}
public static void product(String name,String quantity,double price)
{
System.out.println("name:"+name);
System.out.println("quantity:"+quantity);
System.out.println("price:"+price);
}
public static void bookMovieTicket(String name,String theaterName,int quantity,double price)
{
	if(price>=100)
	{
		System.out.println("price is valid");
	}
	else{
		System.out.println("price is invalid");
	}
System.out.println("name:"+name);
System.out.println("theaterName:"+theaterName);
System.out.println("quantity:"+quantity);
System.out.println("price:"+price);
}
public static void buyEgg(int total,double pricePerEgg)
{
	if(total>=10000)
	{
		System.out.println("price is valid");
	}
	else
	{
		System.out.println("price is valid");
	}
System.out.println("total:"+total);
System.out.println("pricePerEgg:"+pricePerEgg);
}
public static void buyShampoo(int quantityInMl,double price,String brand,String manfDate)
{
	System.out.println("quantityInMl:"+quantityInMl);
System.out.println("price:"+price);
System.out.println("brand:"+brand);
System.out.println(" manfDate:"+ manfDate);
}
	public static void buyCake(char size,String type,String flavour,double cost,int quantity)
{
	System.out.println("size:"+size);
System.out.println("type:"+type);
System.out.println("flavour:"+flavour);
System.out.println("cost:"+cost);
System.out.println("quantity:"+quantity);
	if(quantity>=10)
	{
		System.out.println("quality is valid");
	}
		else{
			System.out.println("quality is in valid");
		}
				
}
public  static void buyLaptop(String brand,int serialNo,double price,int batteryCapacity,double screenSize,String os,int harddiskSize,int ramSize)
{
System.out.println("brand:"+brand);
System.out.println("serialNo:"+serialNo);
System.out.println("price:"+price);
System.out.println("batteryCapacity:"+batteryCapacity);
System.out.println("screenSize:"+screenSize);
System.out.println("os:"+os);
System.out.println("harddiskSize:"+harddiskSize);
System.out.println("ramSize:"+ramSize);
	if(price>=50000)
	{
		System.out.println("price is valid");
	}
	else{
		System.out.println("price is invalid");
	}
}
public static void buySmartWatch(String brand,double price,String color,char type,int mode)
{
System.out.println("brand:"+brand);
System.out.println("price:"+price);
System.out.println("color:"+color);
System.out.println(" type:" +type);
System.out.println("mode:"+mode);
	if(price>=6000.000)
	{
		System.out.println("price is valid");
	}
	else{
			
			System.out.println("price is invalid");
		}
}
}
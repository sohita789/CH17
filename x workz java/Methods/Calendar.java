 class Calendar{
    
    public static int price(String mangocolor) 
	{
       System.out.println("mango have color");
	   if(mangocolor=="orange")
	   {
		System.out.println("mango have color");
return 10;		
	   }
	   else if(mangocolor=="green")
	   {
		   System.out.println("apple have color");
		   return 30;
	   }
		   System.out.println("apple have color");
		   
	   return 0; // Return statement
    }
	

    public static void main(String[] args) 
	{
        int fruit=Calendar.price("orange");
		   System.out.println("fruit:"+fruit);
		
		int fruit1=Calendar.price("green");
        System.out.println("fruit:" +fruit);
		
		int fruit2=Calendar.price("purple");
		System.out.println("fruit:"+fruit);
	}
 }
    


class MaskRunner{
public static void main(String[]args)
{
	System.out.println("starting main in MaskRunner");
	
Mask mask=new Mask();
System.out.println("Mask cost:"+mask.cost);
System.out.println("Mask size:"+mask.size);
System.out.println("Mask material:"+mask.material);


Mask mask1=new Mask(30);
System.out.println("Mask cost:"+mask1.cost);


Mask mask2=new Mask('S');
System.out.println("Mask size:"+mask2.size);

Mask mask3=new Mask("polyster");
System.out.println("Mask material:"+mask3.material);

Mask mask4=new Mask(25,'M',"cotton");
System.out.println("Mask cost:"+mask4.cost);
System.out.println("Mask size:"+mask4.size);
System.out.println("Mask material:"+mask4.material);

Mask mask5=new Mask(45,'L');
System.out.println("Mask cost:"+mask5.cost);
System.out.println("Mask size:"+mask5.size);

	System.out.println("ending main in MaskRunner");

}
}


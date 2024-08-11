class Keybunch
{
String material="metal";
Key key;


public Keybunch(String material,Key key)
{
	this.material=material;
	this.key=key;
	
System.out.println("created keybunch using string,key constr");
}
public void show(){
	System.out.println("material:"+material);

key.show();
System.out.println("end showin keybunch");
}
}

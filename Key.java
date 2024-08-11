class Key
{
int weight;
String brand;
public Key(int weight,String brand)
{
this.weight=weight;
this.brand=brand;
System.out.println("created the key with int weight and string brand");
}

public void show(){
System.out.println("weight:"+this.weight);
System.out.println("brand:"+this.brand);
}
}